package day9;

public class Consumer1 implements Runnable {
	private Queue queue;
	
	public Consumer1(Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		for(int i= 0; i<1; i++) {
			queue.getValue();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
