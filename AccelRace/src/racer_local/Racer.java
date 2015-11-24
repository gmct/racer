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
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import racer_local.Car;

@SuppressWarnings("serial")
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
		drawGrid(700, 500);
		
		while(true){
			System.out.print("Please enter a change in x velocity (-1, 0, or 1): ");
			xChange = scan.nextInt();
			if (xChange < -1 || xChange > 1){
				System.out.println("Invalid parameter.");
				continue;
			}
			
			System.out.print("Please enter a change in y velocity (-1, 0, or 1): ");
			yChange = scan.nextInt();
			if (yChange < -1 || yChange > 1){
				System.out.println("Invalid parameter.");
				continue;
			}
			
			racer.moveCar(xChange, yChange);
		}
	}
	public static void drawGrid(int XSIZE, int YSIZE){
		// Code broken. Figure out how to draw line here and then reimplement for loops.
		Graphics g = raceTrack.getGraphics();
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.black);
		g2d.drawLine(40, 70, 100, 90);
		g2d.dispose();
		g.dispose();
	}
}