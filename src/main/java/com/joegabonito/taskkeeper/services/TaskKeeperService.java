package com.joegabonito.taskkeeper.services;

import java.util.List;

import com.joegabonito.taskkeeper.model.TaskKeeper;

public interface TaskKeeperService  {

	List<TaskKeeper> getList();

	void save(TaskKeeper task);

}
