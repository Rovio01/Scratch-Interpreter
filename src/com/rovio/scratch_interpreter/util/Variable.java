package com.rovio.scratch_interpreter.util;

public class Variable<E> {
	private E data;
	
	public Variable(E data) {
		this.data=data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	
}
