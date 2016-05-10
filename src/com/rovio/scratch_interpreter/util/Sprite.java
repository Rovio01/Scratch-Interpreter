package com.rovio.scratch_interpreter.util;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Sprite {
	
	private List<Script> scripts = new ArrayList<Script>();
	
	private Variable[] variables;
	private List<Image> costumes=new ArrayList<Image>();
	private int currentCostume;
	private int x;
	private int y;
	private double size;
	private int color;
	private int penColor;
	private boolean visible;
	private boolean penDown;
	
	public Sprite() {
		currentCostume=0;
		x=0;
		y=0;
		size=100;
		color=0;
		penColor=0;
		visible=true;
		penDown=false;
	}

	public int getCurrentCostume() {
		return currentCostume;
	}

	public void setCurrentCostume(int currentCostume) {
		this.currentCostume = currentCostume;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color%100;
	}

	public int getPenColor() {
		return penColor;
	}

	public void setPenColor(int penColor) {
		this.penColor = penColor;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isPenDown() {
		return penDown;
	}

	public void setPenDown(boolean penDown) {
		this.penDown = penDown;
	}
	
}
