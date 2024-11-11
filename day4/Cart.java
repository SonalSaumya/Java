package day4;

public class Cart {
	static int totalPrice =0;
	
	public void addToCart(Dessert d)
	{
		
		totalPrice += d.calculatePrice();
	}
	
public static void main(String[] args) {
		
	}


}
