package day4;

public class Candies extends Dessert {
	
	protected int total;
	protected int kg ;
	protected int quantity;
	protected int price = 10;
	
	
	public Candies(int quantity)
	{
		//this.kg = kg;
		this.quantity =quantity;
		
	}
	
	public int calculatePrice()
	{
		this.total = this.quantity * this.price;
		return this.total;
		
	}
	
	
	

}