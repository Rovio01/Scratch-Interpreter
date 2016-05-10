package com.rovio.compiler.util.slots;

import com.rovio.compiler.util.insertables.BooleanInsertable;

public class BooleanSlot extends Slot {
	private BooleanInsertable contents;
	
	public boolean resolve() {
		try {
			return contents.resolve();
		} catch (NullPointerException e) {
			System.err.println("There is no insertable in one or more slots");
			System.exit(-1);
		}
		return false;
	}
	public void removeContents() {
		contents=null;
	}
}
