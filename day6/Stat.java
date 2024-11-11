package day6;

public class Stat<T extends Number>
{
	T[] num;
	
	public  void setValues(T[] num)
	{
		this.num= num;
	}
	
	
	public double getAverage()
	{
		double sum=0.0;
		for(int i=0;i<num.length;i++)
		{
			sum += num[i].doubleValue();
		}
		
		return sum/num.length;
	}
	
	
	
	public static void main(StringInterface[] args)
	{
		Integer[] arr = {1,2,3,4,5,6,7};
		Stat stat1 = new Stat();
		stat1.setValues(arr);
		System.out.println(stat1.getAverage());
		
		
		Double[] arr1 = {1.1,2.2,3.3,4.4,5.5,6.6};
		Stat stat2 = new Stat();
		stat2.setValues(arr1);
		System.out.println(stat2.getAverage());
		
	
	}
}
  