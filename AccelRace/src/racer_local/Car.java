package racer_local;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Car extends Racer{
	public int x;
	public int y;
	public String color;
	public int[] coords = new int[2];
	public int[] lastCoords = new int[2];
	public int xVelocity;
	public int yVelocity;
	
	public Car(int x, String color){
		this.x = x;
		y = 5;
		this.color = color;
		xVelocity = 0;
		yVelocity = 0;
	}
	public void moveCar(int xChange, int yChange){
		xVelocity += xChange;
		yVelocity += yChange;
		x += xVelocity;
		y += yVelocity;
		
		// Visualizes the movement of the car.
		Graphics g = raceTrack.getGraphics();
		g.setColor(Color.red);
		// drawVelocity(g);
		drawCar(g);
		//drawGrid(g, 700, 500);
		g.dispose();
	}
	
	private void drawCar(Graphics g){
		int xOld = x - xVelocity;
		int yOld = y - yVelocity;
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.red);
		g2d.fillOval(x * 10, 500 - y * 10, 10, 10);
		// TODO: Separate this code into more easy to read lines. Maybe do this by making graphX/Y vars.
		g2d.drawLine(xOld * 10 + 5, 500 - (yOld * 10 - 5), x * 10 + 5, 500 - (y * 10 - 5));
		g2d.setPaint(Color.black);
		g2d.dispose();
	}
	
	private void drawVelocity(Graphics g){
		// For some reason this line causes program to freeze.
		 g.drawString(Integer.toString(xVelocity), 20, 30);
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