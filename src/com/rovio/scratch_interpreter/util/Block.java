package com.rovio.scratch_interpreter.util;

import com.rovio.scratch_interpreter.util.slots.Slot;

public abstract class Block {
	private Slot[] parameters;
	public abstract void run();
}
