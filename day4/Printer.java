package day4;


public class Printer {
	
	public void printData(Printable p)
	{
		p.print();
	}
	
	public static void main (String[] args) {
		Printer p = new Printer();
		Book b = new Book("Head first Java", 900);
		p.printData(b);
		
	

}
}

