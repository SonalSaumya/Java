package day1;

public class Calender {

	public static void main(String[] args)
	{
		NewDate d = new NewDate();
		d.setDay(11);
		d.setMonth("jan");
		d.setYear(2024);
		
		System.out.println(d);
	}
}