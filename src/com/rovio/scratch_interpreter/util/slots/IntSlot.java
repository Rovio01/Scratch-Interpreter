package com.rovio.scratch_interpreter.util.slots;

import com.rovio.scratch_interpreter.util.insertables.IntInsertable;

public class IntSlot extends Slot {
	private IntInsertable contents;
	public IntSlot(IntInsertable value) {
		contents=value;
	}
	public double evaluate() {
		return contents.resolve();
	}
}
