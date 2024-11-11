package day5;
import java.util.Scanner;

public class Assignment {

			public static void check(int n) throws Exception
	{
		
		if(n>60000)
		{
			throw new Exception("Number is too greater");
		}
	}

		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			try
			{
				check(n);
			}
		
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}	
		

	}

