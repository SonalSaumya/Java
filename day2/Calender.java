
package day2;

import java.util.*;

public class Calender {
	
	public static void main(String[] args)
	{
		NewDate d = new NewDate();
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		Months m = Months.valueOf(choice.toUpperCase());
		
		
		d.setDay(11);
		d.setMonth(m);
		d.setYear(2024);
		
		System.out.println(d);
	}

}
