package com.greatlearning.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="roles")
@Data
public class Role {
	
	@Id
	@Column(name="role_id")
	private Integer id;
	
	public Role(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}
	
	public Role()
	{
		
	}
	
}
