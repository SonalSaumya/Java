package day7;
public class Math {
	
	
	public static int increment(int num)
	{
		num++;
		return num;
	}
	
	
	
	

		public static void main(String[] args)
		{
			
			int n=0;
			System.out.println("Before :"+n);
			n = increment(n);
			System.out.println("After : "+n);
			n = increment(n);
			System.out.println("After : "+n);
			
			
		}
}