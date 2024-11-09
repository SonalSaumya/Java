package day1;
public class Student {

	private static int rollno=0;
	private String name=null;
	
	public Student(String name)
	{	
		rollno+=1;
		this.name = name;
	}
	
	public String toString()
	{
		return this.name + " " + rollno;
	}
	public static void main(String[] args)
	{
		Student s = new Student("Siddhi");
		System.out.println(s);
		
		Student s1 = new Student("Sonal");
		System.out.println(s1);
	}
		
	
}
