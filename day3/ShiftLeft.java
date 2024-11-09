package day3;

public class ShiftLeft {
	
	
	public static void leftShift(String s)
	{
		
		char arr[] = s.toCharArray();
		char newarr[] = new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			if (i < (s.length()-1)/2)
					{
						newarr[i+2*2]=arr[i];
					}
			
			else
			{
				//newarr[i]=arr[i+2];
				newarr[i-2]=arr[i];
			}
		}
		
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(newarr[i]);
		}
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		leftShift("siddhi");
	}
	

}
