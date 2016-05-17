package com.rovio.scratch_interpreter.util;

public class Variable {
	private String data;
	private String name;
	
	public Variable(String name) {
		this.name=name;
	}

	public String getData() {
		return data;
	}

	public Variable setData(String data) {
		this.data = data;
		return this;
	}
	
	public String getName() {
		return name;
	}
}
