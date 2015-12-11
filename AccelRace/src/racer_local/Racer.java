/* TODO
 * Create Window - Done
 * Create Grid - WIP. Learn how to draw lines.
 * Create track outline
 * Create car - Done
 * Create ways to move car - WIP. Need to implement in GUI.
 * Draw car at start line.
 */
package racer_local;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import racer_local.*;

@SuppressWarnings("serial")
public class Racer{
	public static void main(String[] args){
		RaceTrack raceTrack = new RaceTrack("Racer", 700, 500);
		raceTrack.drawGrid(5);
//		Scanner scan = new Scanner(System.in);
//		Car racer = new Car(2, "red");
//		int xChange;
//		int yChange;
//		
//		while(true){
//			System.out.print("Please enter a change in x velocity (-1, 0, or 1): ");
//			// Temporary solution until I can implement a GUI based input.
//			try{
//				xChange = Integer.parseInt(scan.nextLine());
//				if (xChange < -1 || xChange > 1){
//					System.out.println("Invalid parameter.");
//					continue;
//				}
//			} catch (NumberFormatException e){
//				System.err.println("Invalid input.");
//				System.out.println();
//				continue;
//			}
//			
//			System.out.print("Please enter a change in y velocity (-1, 0, or 1): ");
//			
//			try{
//				yChange = Integer.parseInt(scan.nextLine());
//				if (yChange < -1 || yChange > 1){
//					System.out.println("Invalid parameter.");
//					continue;
//				}
//			}catch(NumberFormatException e){
//				System.err.println("Invalid input.");
//				System.out.println();
//				continue;
//			}
//			
//			racer.moveCar(xChange, yChange);
//		}
	}
//	public static void drawGrid(int XSIZE, int YSIZE){
//		// Code broken. Figure out how to draw line here and then reimplement for loops.
//		// Separate code into RaceTrack which will handle the graphics for the raceTrack.
//		Graphics g = raceTrack.getGraphics();
//		Graphics2D g2d = (Graphics2D) g;
//		g2d.setPaint(Color.black);
//		for (int i = 5; i < XSIZE; i += 5){
//			g2d.drawLine(i, 0, i, YSIZE);
//		}
//		for (int i = 5; i < YSIZE; i += 5){
//			g2d.drawLine(0, i, XSIZE, i);
//		}
//		g2d.dispose();
//	}
}