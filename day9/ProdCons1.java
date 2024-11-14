package day9;

public class ProdCons1 {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		Thread producer = new Thread(new Producer1(queue));
		Thread consumer = new Thread(new Consumer1(queue));
		
		producer.start();
		consumer.start();
		
	}

}
