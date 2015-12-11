package racer_active_animation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import racer_active_animation.*;

@SuppressWarnings("serial")
public class Racer {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Frame");
        RaceTrack raceTrack = new RaceTrack();
        frame.add(raceTrack);
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Scanner scan = new Scanner(System.in);
        Car racer = new Car(raceTrack, 5, "red");
        int xChange, yChange;
        
        while (true) {
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
			raceTrack.repaint();
			Thread.sleep(10);
        }
    }
}