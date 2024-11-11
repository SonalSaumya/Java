package day4;

public class Cookies extends Dessert{
	
	
	protected int total;
	protected int dozen ;
	protected int price = 10;
	protected int quantity;

	public Cookies(int quantity)
	{
		//this.dozen = dozen;
		this.quantity=quantity;
		
	}
	
	public int calculatePrice()
	{
		this.total = this.quantity * this.price;
		return this.total;
		
	}
	

}
