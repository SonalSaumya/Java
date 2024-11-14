package day9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.Month;
import java.time.DayOfWeek;


public class Formatting_age {
	
	
	public static void main(String args[])
	{
		
		//Calculating age
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate dob = LocalDate.of(2000,7,5);
		System.out.println(dob);
		
		int year = today.getYear() - dob.getYear();
		System.out.println("Age : "+year);
		
		
		Period age = dob.until(today);
		System.out.println(age.getYears() +"year(s)" + age.getMonths() + "month(s)" + age.getDays() + "day(s)");
		
		
		//	Months that started on a Sundays in year 2024	
		int y = 2024;
        for (Month m : Month.values())
        {
            LocalDate firstDay = LocalDate.of(y, m, 1);
            if (firstDay.getDayOfWeek() == DayOfWeek.SUNDAY)
            {
                System.out.println(m);
            }
        }
        
        LocalDate programmerday= LocalDate.of(2024,1, 1).plus(256, ChronoUnit.DAYS);
        System.out.println(programmerday);
        
        Stream<LocalDate> currentyear = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
        List<LocalDate> filtered = currentyear.filter((date) -> date.getDayOfMonth()==1).filter((date) -> date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).collect(Collectors.toList());
        System.out.println(filtered);
        
        
        
        

       
    
          
        
	}

}
