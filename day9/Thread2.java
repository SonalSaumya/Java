package day9;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
		try
			{
				Thread.sleep(1000);
			}
		catch(InterruptedException e)
			{
				e.printStackTrace();
			}
				}
		
	
//	public void run()
//	
//	{
//		char[] greeting = {'G','o','o','d',' ','M','o','r','n','i','n','g'};
//		
//		for(int i = 0;i<greeting.length;i++)
//		{
//			System.out.print(greeting[i]);
//		}
//	}
	
		
	}
}
	


