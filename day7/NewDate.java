package day7;

import day2.Months;

public class NewDate {
	
	//Months m = Months
	
	private int day;
	private Months month;
	private int year;
	
	
	
	
	public void setDay(int day)
	{
		this.day = day;
		
		if (day < 0)
		{
			System.out.println("Invalid");
			
		}
		else
		{
			this.day = day;
		}
		
	}
	
	public int getDay()
	{
		return day;
	}
	
	
	public void setMonth(Months month)
	{
		this.month = month;
	}
	
	public Months getMonth()
	{
		return month;
	}
	
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
	

}