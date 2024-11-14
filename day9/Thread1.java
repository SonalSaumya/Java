package day9;

public class Thread1 extends Thread{
	
public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getName()+" " +i);
			
			try
	{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}
	
//	
//	public void run()
//	{
//		char[] greeting = {'G','o','o','d',' ','M','o','r','n','i','n','g'};
//		
//		for(int i = 0;i<greeting.length;i++)
//		{
//			System.out.print(greeting[i]);
//		}
//	}
	
	
	

}
