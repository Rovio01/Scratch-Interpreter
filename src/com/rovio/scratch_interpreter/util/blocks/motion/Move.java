package com.rovio.scratch_interpreter.util.blocks.motion;

import com.rovio.scratch_interpreter.util.Block;
import com.rovio.scratch_interpreter.util.Sprite;
import com.rovio.scratch_interpreter.util.insertables.IntInsertable;
import com.rovio.scratch_interpreter.util.slots.IntSlot;

public class Move extends Block {
	private IntSlot distance;
	public Move(IntInsertable value) {
		distance=new IntSlot(value);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Sprite sprite=getSprite();
		double direction=sprite.getDirection();
		double deltaX=Math.sin(direction)*distance.evaluate();
		double deltaY=Math.cos(direction)*distance.evaluate();
		sprite.setX(sprite.getX()+deltaX);
		sprite.setY(sprite.getY()+deltaY);
	}

}
