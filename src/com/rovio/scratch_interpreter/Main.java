package com.rovio.scratch_interpreter;

import java.util.ArrayList;
import java.util.List;

import com.rovio.scratch_interpreter.util.Block;

public class Main {
	
	private List<Block> blocks = new ArrayList<Block>();

	public static void main(String[] args) {
		// TODO There really is QUITE a bit left to do here
		// Things left to do:
		// Get filename if not an argument
		// Parse the file (decompress as zip, read JSON, validate syntax, 
		//					parse into objects)
		// Main Loop (render, run scripts, 
		if (args.length>0) {
			parseFile(args[0]);
		}
		else {
			String filepath="temp";
			//Get a filename with a text input
			
			parseFile(filepath);
		}
		//
	}
	
	private static void parseFile(String path) {
		
	}
}
