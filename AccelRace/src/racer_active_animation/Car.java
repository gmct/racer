package racer_active_animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import racer_local.*;

public class Car{
	public int x;
	public int y;
	// TODO Make method setColor that changes the color which is set for drawing of car.
	public String color;
	private int[] coords = new int[2];
	private int[] lastCoords = new int[2];
	private int xVelocity;
	private int yVelocity;
	private RaceTrack raceTrack;
	
	public Car(RaceTrack raceTrack, int x, String color){
		this.x = x;
		y = 1;
		this.color = color;
		xVelocity = 0;
		yVelocity = 0;
		this.raceTrack = raceTrack;
		raceTrack.setCoords(x, y);
	}
	public void moveCar(int xChange, int yChange){
		/**
		 * This method changes the velocity and position of the car.
		 * The inputs should only be done in increments of 1 or 0
		 * 
		 * @param	xChange	the change in x velocity
		 */
		xVelocity += xChange;
		yVelocity += yChange;
		x += xVelocity;
		y += yVelocity;
		// TODO Change this implementation so that the in between points are animated.
		raceTrack.setCoords(x, y);
	}
	
	
	public int[] getVelocity(){
		/**
		 * Returns an array with the current x and y velocity.
		 * Value at index 0 corresponds to x velocity and
		 * value at index 1 corresponds to y velocity.
		 * 
		 * @return	array with current x and y velocity
		 */
		// TODO Have velocity drawn.
		int[] velocities = {xVelocity, yVelocity};
		return velocities;
	}
	public int[] getCoords(){
		/**
		 * Returns an array with the current x and y coordinates.
		 * 
		 * @return	array with current coordinates	
		 */
		coords[0] = x;
		coords[1] = y;
		return coords;
	}
	public int[] getLastCoords(){
		/**
		 * Returns an array with the values for x and y before the most recent movement.
		 * The value at index 0 represents x and the value at index 1 represents y.
		 * 
		 * @return	array with last coordinates
		 */
		lastCoords[0] = coords[0] - xVelocity;
		lastCoords[1] = coords[1] - yVelocity;
		return lastCoords;
	}
	
	public void createPoint(String id, int x, int y){
		/**
		 * Creates a point with a unique id so that all points
		 * can be addressed by the paint method in order to
		 * create a visual history of all movement.
		 * 
		 * @param id	Unique ID number to be assigned to point object
		 * @param x		x-coordinate of the point
		 * @param y		y-coordinate of the point
		 */
		// TODO Make code which creates an Object pointx with id. i.e point0, point1, point2...
		/* Alternative to above TODO, make an ArrayList<Integer[]> = new ArrayList<>(new int[2]); 
		 * and add new points to that with an enhanced for loop in the paint method.
		 */
	}
}