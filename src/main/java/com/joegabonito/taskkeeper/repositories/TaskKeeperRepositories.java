package com.joegabonito.taskkeeper.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.joegabonito.taskkeeper.model.TaskKeeper;

public interface TaskKeeperRepositories extends CrudRepository<TaskKeeper, Long> {

	List<TaskKeeper> findAll();

}
