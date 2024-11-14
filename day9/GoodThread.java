package day9;

public class GoodThread {
	
	public static void main(String[] args)
	{
		
		Greetings g = new Greetings();		
	
	
		
		
	
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				synchronized(g)
				{
					g.parray();
				}
			}
			
		});
		
		 
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				synchronized(g)
				{
					g.parray();
				}
			}
			
		});
			
		t1.start();
		t2.start();
	}

}


//
//public class GoodThread {
//	
//	public static void main(String[] args)
//	{
//		char[] greeting = {'G','o','o','d',' ','M','o','r','n','i','n','g'};
//		
//new Thread(new Runnable() {
//			
//			public void run()
//			{
//				synchronized(greeting)
//				{
//					for(int i=0;i<greeting.length;i++)
//					{
//						System.out.print(greeting[i]);
//						try
//						{
//							Thread.sleep(500);
//							
//						}
//						catch(InterruptedException e)
//						{
//							e.printStackTrace();
//						}
//					}
//				}
//			}
//		}).start();
//	}

