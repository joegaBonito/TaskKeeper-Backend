package com.joegabonito.taskkeeper.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.joegabonito.taskkeeper.model.TaskKeeper;
import com.joegabonito.taskkeeper.services.TaskKeeperService;

@CrossOrigin(origins = "http://localhost:3000, http://localhost:3001", maxAge = 3600)
@Controller
@RequestMapping("/api")
public class TaskKeeperController {
	
	Logger logger = LoggerFactory.getLogger(TaskKeeperController.class);
    
	@Autowired
	TaskKeeperService taskKeeperService;
	
	public TaskKeeperController(TaskKeeperService taskKeeperService) {
		this.taskKeeperService = taskKeeperService;
	}
	
	@RequestMapping(value="/taskkeeping-list", method=RequestMethod.GET)
	public ResponseEntity<List<TaskKeeper>> TaskKeeperList() {
		return new ResponseEntity<List<TaskKeeper>>(taskKeeperService.getList(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/taskkeeping-create",method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody() HashMap<String,String> payload) {
		TaskKeeper task = new TaskKeeper();
		task.setTitle(payload.get("title"));
		task.setOwner(payload.get("owner"));
		task.setDate_created(payload.get("date_created"));
		task.setDate_modified(payload.get("date_modified"));
		task.setDescription(payload.get("description"));
		task.setStatus(payload.get("status"));
		task.setUse_flag('Y');
		logger.info("Payload: " + payload);
		logger.info("Task: " + task);
		taskKeeperService.save(task);
	}
}
