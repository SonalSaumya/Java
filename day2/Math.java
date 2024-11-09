package day2;
import java.util.Arrays;

import day1.Date;
import day1.NewDate;

public class Math {
	/* Paramaeters in java are passed by value: only a copy of variable data is passed
	 *from calling method to called method, not the actual data
	 * When the array/reference variable is pased it passes copy of 
	 * reference to the called method not the actual object
	 */
	public static int increment(int num)
	{
		num = num+1;
		return num;
	}
	
	public static void incrementDate(NewDate d)
	{
		int day = d.getDay();
		d.setDay(day+1);
	}
	
	public static void swapDates(Date d1, Date d2)
	{
		Date temp=null;
		temp=d1;
		d1=d2;
		d2=temp;
	}
	public static void sortArray(int[]arr)
	{
		int n= arr.length;
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]> arr[j+1])
				{
					int temp = arr [j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
		
			public static void main(String[] args) {
				int n=10;
				System.out.println("Before increment : " + n);
				n = increment(n);
				System.out.println("After increment: " +n);
				
				NewDate d = new NewDate();
				d.setDay(23);
				d.setMonth("Jan");
				d.setYear(2000);
				
				
		System.out.println("Before Increment : " +d);
		incrementDate(d);
		System.out.println("After Increment : " +d);
		
		Date dt1= new Date(4,"Dec",1990);
		Date dt2 = new Date(5,"Dec", 1990);
		System.out.println("before Swap d1 : " + dt1 + "d2 : " +dt2);
		swapDates(dt1,dt2);
		System.out.println("After Swap d1 : " + dt1 + "d2 : " +dt2);
		
		swapDates(dt1,dt2);
		System.out.println("After Swap d1: " +dt1 +"d2:" +dt2);
		
		int arr[]= {12,34,10,98,75}
;
		sortArray(arr);
		System.out.println("After Sorting " + Arrays.toString(arr));
			}
}
