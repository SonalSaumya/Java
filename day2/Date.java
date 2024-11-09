package day2;

public class Date {
	
			
		private int day;
		private String month;
		private int year;
		
		
		
		public Date(int d,String m,int y)
		{
			this.day = d;
			this.month = m;
			this.year=y;
		}
		
		public String toString()
		{
			return  day + "/" + month + "/"+ year;
			
		}
		
		
		

	
}
