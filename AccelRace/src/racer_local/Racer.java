/* TODO
 * Create Window
 * Create Grid
 * Create track outline
 * Create car
 * Create ways to move car.
 * 
 */
package racer_local;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import racer_local.Car;

public class Racer extends JFrame{
	static JFrame raceTrack = new JFrame("Racer");
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Car racer = new Car(2, "red");
		int xChange = 0;
		int yChange;
		
		
		raceTrack.setSize(700, 500);
		raceTrack.setVisible(true);
		raceTrack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(xChange >= -1 && xChange <= 1){
			// Implement something so that this doesn't accept input outside acceptable range.
			System.out.print("Please enter a change in x velocity (-1, 0, or 1): ");
			xChange = scan.nextInt();
			System.out.print("Please enter a change in y velocity (-1, 0, or 1): ");
			yChange = scan.nextInt();
			racer.moveCar(xChange, yChange);
			int[] coords = racer.getCoords();
			paint(coords[0]* 5, 500 - coords[1] * 5, 20, 20);
			}
	}
	public static void paint(int x,int y,int XSIZE,int YSIZE) {
		  Graphics g = raceTrack.getGraphics();
		  g.setColor(Color.red);
		  g.fillOval(x, y, XSIZE, YSIZE);
		  g.dispose();
	}
}