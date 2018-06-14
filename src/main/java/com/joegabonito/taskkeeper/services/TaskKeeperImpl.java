package com.joegabonito.taskkeeper.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joegabonito.taskkeeper.model.TaskKeeper;
import com.joegabonito.taskkeeper.repositories.TaskKeeperRepositories;

@Service
public class TaskKeeperImpl implements TaskKeeperService {

	@Autowired
	TaskKeeperRepositories taskKeeperRepositories;
	
	public TaskKeeperImpl(TaskKeeperRepositories taskKeeperRepositories) {
		super();
		this.taskKeeperRepositories = taskKeeperRepositories;
	}

	@Override
	public List<TaskKeeper> getList() {
		// TODO Auto-generated method stub
		return (List<TaskKeeper>) taskKeeperRepositories.findAll();
	}

}
