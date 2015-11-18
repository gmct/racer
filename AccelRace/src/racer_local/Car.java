package racer_local;

public class Car{
	public int x;
	public int y;
	public String color;
	public int[] coords = new int[2];
	public int xVelocity;
	public int yVelocity;
	
	public Car(int startX, String carColor){
		x = startX;
		y = 0;
		color = carColor;
		xVelocity = 0;
		yVelocity = 0;
	}
	public void moveCar(int xChange, int yChange){
		xVelocity += xChange;
		yVelocity += yChange;
		x += xVelocity;
		y += yVelocity;
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
}

/*public class Employee {
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
}*//*
private int x = 1;
private String departmentName;

public Racer(String startName, double startSalary, String startJobDescription, int startYearsEmployed, String startDepartmentName) {
	super(startName, startSalary, startJobDescription, startYearsEmployed);
	departmentName = startDepartmentName;
	}

public void doWork(){
	System.out.println("Go Back to Work People!");
	numOnTeam = numOnTeam + 2;
	
	super.doWork();
}

public void printDetails(){
	super.printDetails();
	System.out.println("Department Name: " + departmentName + "\n"
					+ "Number On Team: " + numOnTeam);
}*/