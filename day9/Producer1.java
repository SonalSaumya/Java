package day9;

public class Producer1 implements Runnable{
	Queue queue;
	
	public Producer1 (Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		for(int i= 0; i<1; i++) {
			queue.setValue(i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

}