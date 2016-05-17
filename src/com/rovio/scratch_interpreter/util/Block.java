package com.rovio.scratch_interpreter.util;

public abstract class Block {
	private Sprite inside;
	public abstract void run();
	public Sprite getSprite() {
		return inside;
	}
}
