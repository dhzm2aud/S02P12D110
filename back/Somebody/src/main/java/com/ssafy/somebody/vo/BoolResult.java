package com.ssafy.somebody.vo;

import java.io.Serializable;

public class BoolResult implements Serializable{
	private String name;
	private String state;

	
	@Override
	public String toString() {
		return "BoolResult [name=" + name + ", state=" + state + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

  }