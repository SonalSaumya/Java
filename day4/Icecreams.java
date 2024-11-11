package day4;


public class Icecreams extends Dessert{
	protected int total;
	protected int piece ;
	protected int quantity;
	protected int price = 10;

	public Icecreams(int quantity)
	{
		//.piece = piece;
		this.quantity =quantity;
	}
	
	public int calculatePrice()
	{
		this.total = this.quantity * this.price;
		return this.total;
		
	}

}
