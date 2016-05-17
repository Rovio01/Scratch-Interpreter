package com.rovio.scratch_interpreter;

import java.util.ArrayList;
import java.util.List;

import com.rovio.scratch_interpreter.util.Sprite;

public class Runner {
	
	private List<Sprite> sprites = new ArrayList<Sprite>();
	
	boolean run=true;
	
	public void run(String[] args) {
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
		//TODO Load blocks and scripts
		
		while (run)
		{
			//Run each block
			for(Sprite s:sprites) {
				s.executeScripts();
			}
			//TODO Render everything
			
			//TODO Some sort of frame synchronization
		}
	}
	
	private static void parseFile(String path) {
		//TODO
	}
}