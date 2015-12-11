package racer_active_animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import racer_local.*;

public class Car{
	public int x;
	public int y;
	public String color;
	private int[] coords = new int[2];
	private int[] lastCoords = new int[2];
	private int xVelocity;
	private int yVelocity;
	private RaceTrack raceTrack;
	
	public Car(RaceTrack raceTrack, int x, String color){
		this.x = x;
		y = 5;
		this.color = color;
		xVelocity = 0;
		yVelocity = 0;
		this.raceTrack = raceTrack;
	}
	public void moveCar(int xChange, int yChange){
		xVelocity += xChange;
		yVelocity += yChange;
		x += xVelocity * 5;
		y += yVelocity * 5;
		raceTrack.setCoords(x, y);
	}
	
	public int[] getVelocity(){
		int[] velocities = {xVelocity, yVelocity};
		return velocities;
	}
	public int[] getCoords(){
		coords[0] = x;
		coords[1] = y;
		return coords;
	}
	public int[] getLastCoords(){
		lastCoords[0] = coords[0] - xVelocity;
		lastCoords[1] = coords[1] - yVelocity;
		return lastCoords;
	}
}