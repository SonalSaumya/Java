package day4;

public abstract class Employee implements Printable {
	
	protected int empid;
	protected String name;
	
	public Employee(int empid, String name)
	{
		this.empid = empid;
		this.name = name;
	}
	
	public abstract double calculateGross();
	
public void print()
	{
	System.out.println("Employee Data : Employee id - "+ empid + ", Name - "+ name);
	}

}

