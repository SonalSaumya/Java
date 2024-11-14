package day9;

public class ThreadsDemo 
{
	
	public static void main(String[] args)
	{		
		new Thread(new Runnable()
		{
			public void run()
			{
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
			}
		}).start();
		
		
		
		Runnable t = () ->
		{
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
		};
	}

}
