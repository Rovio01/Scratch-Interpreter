package com.rovio.compiler.util;

import java.util.ArrayList;
import java.util.List;

public class Script {
	private List<Block> blocks = new ArrayList<Block>();
	private Header header;
	
	public void run() {
		for (Block b:blocks) {
			b.run();
		}
	}
	
	public void tryExecute() {
		if (header.doExecute()) {
			run();
		}
	}
}
