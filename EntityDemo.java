package com.SpringDataJpaDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EntityDemo {
	@Id
	private Integer id;
	private String name;
	
	public EntityDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntityDemo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EntityDemo [id=" + id + ", name=" + name + "]";
	}
	
	
}
