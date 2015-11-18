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
import racer_local.Racer;

public class RaceTrack extends JFrame{
//	JTextField xChange;
//	JTextField yChange;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Racer racer = new Racer(2, "red");
		boolean race = true;
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
	}
}

/*
 * public static void main(String[] args){
		public class Employee {
	public String name;
	public double salary;
	public String jobDescription;
	public int yearsEmployed;
	
	public Employee(String startName, double startSalary, String startJobDescription, int startYearsEmployed){
		salary = startSalary;
		yearsEmployed = startYearsEmployed;
		name = startName;
		jobDescription = startJobDescription;
	}
	public void doWork(){
		System.out.println("I Work Too Hard");
		yearsEmployed++;
		salary *= 1.05;
	}
	
	public void printDetails(){
		System.out.println("Name: " + name + "\n"
						+ "Salary: " + Math.round(salary * 100.0) / 100.0 + "\n"
						+ "Job Description: " + jobDescription + "\n"
						+ "Years Employed: " + yearsEmployed);
	}
}
	}
 */
