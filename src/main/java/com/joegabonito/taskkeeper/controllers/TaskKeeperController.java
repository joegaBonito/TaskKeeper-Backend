package com.joegabonito.taskkeeper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joegabonito.taskkeeper.model.TaskKeeper;
import com.joegabonito.taskkeeper.services.TaskKeeperService;

@CrossOrigin(origins = "http://localhost:3000, http://localhost:3001", maxAge = 3600)
@Controller
@RequestMapping("/api")
public class TaskKeeperController {
	
	@Autowired
	TaskKeeperService taskKeeperService;
	
	public TaskKeeperController(TaskKeeperService taskKeeperService) {
		this.taskKeeperService = taskKeeperService;
	}
	
	@RequestMapping(value="/taskkeeping-list", method=RequestMethod.GET)
	public ResponseEntity<List<TaskKeeper>> TaskKeeperList() {
		return new ResponseEntity<List<TaskKeeper>>(taskKeeperService.getList(),HttpStatus.OK);
	}
}
