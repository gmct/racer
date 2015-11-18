/* TODO
 * Create Window
 * Create Grid
 * Create track outline
 * Create car
 * Create ways to move car.
 * 
 */
package racer_local;

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
//	JTextField xChange;
//	JTextField yChange;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Car racer = new Car(2, "red");
		/*boolean race = true;
		int xChange = 0;
		int yChange;
		while(xChange >= -1 && xChange <= 1){
			// Implement something so that this doesn't accept input outside acceptable range.
			System.out.print("Please enter a change in x velocity (-1, 0, or 1): ");
			xChange = scan.nextInt();
			System.out.print("Please enter a change in y velocity (-1, 0, or 1): ");
			yChange = scan.nextInt();
			racer.moveCar(xChange, yChange);
			System.out.println("Coords: " + Arrays.toString(racer.getCoords()) + " Velocities: " +
			Arrays.toString(racer.getVelocity()));
			}
			*/
		JFrame raceTrack = new JFrame("Mini Tennis");
		Racer game = new Racer();
		raceTrack.add(game);
		raceTrack.setSize(700, 500);
		raceTrack.setVisible(true);
		raceTrack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			// Ahh figure this out.
			game.moveCar();
			game.repaint();
			Thread.sleep(10);
		}
	}
}