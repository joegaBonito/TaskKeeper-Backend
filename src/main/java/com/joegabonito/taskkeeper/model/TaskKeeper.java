package com.joegabonito.taskkeeper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class TaskKeeper {
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	
	@Column(name="title")
	public String title;
	
	@Column(name="date_created")
	public String date_created;
	
	@Column(name="owner")
	public String owner;
	
	@Column(name="status")
	public String status;
	
	@Column(name="description")
	public String description;
	
	@Column(name="use_flag")
	public char use_flag;
	
	@Column(name="date_modified")
	public String date_modified;

	public TaskKeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskKeeper(int id, String title, String date_created, String owner, String status, String description, char use_flag,
			String date_modified) {
		super();
		this.id = id;
		this.title = title;
		this.date_created = date_created;
		this.owner = owner;
		this.status = status;
		this.description = description;
		this.use_flag = use_flag;
		this.date_modified = date_modified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getUse_flag() {
		return use_flag;
	}

	public void setUse_flag(char use_flag) {
		this.use_flag = use_flag;
	}

	public String getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}
}
