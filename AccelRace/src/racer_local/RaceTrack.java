package racer_local;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import racer_local.Racer;

//@SuppressWarnings("serial")
//public class RaceTrack extends JPanel{
//	public static void main(String[] args){
//		Racer racer1 = new Racer(0, "red");
//		racer1.moveCar(0, 1);
//		int[] coords = racer1.getCoords();
//	}
//}
public class RaceTrack{
	public static void main(String[] args){
		Racer racer1 = new Racer(5, "red");
		racer1.moveCar(1, 1);
		int[] coords = racer1.getCoords();
		System.out.println(Arrays.toString(coords));
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
