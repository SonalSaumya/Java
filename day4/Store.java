package day4;
import java.util.*;

public class Store extends Cart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int n;
//		
//		System.out.println("Welcome to the Store ");
//		System.out.println("Enter total items : ");
//		n = sc.nextInt();
//		
//		for(int i=0;i<n;i++)
//		{
//			String type = sc.next();
//			int quantity = sc.nextInt();
//			
//
//			switch(type)
//			{
//			case "Cookies":
//				Cookies cook = new Cookies(quantity);
//				Cart cook1 = new Cart();
//				cook1.addToCart(cook);
//				break;
//			
//			case "Candies":
//
//				Candies can = new Candies(quantity);
//				Cart can1 = new Cart();
//				can1.addToCart(can);
//				break;
//				
//			case "Icecreams":
//				Icecreams ice = new Icecreams(quantity);
//				Cart ice1 = new Cart();
//				ice1.addToCart(ice);
//				break;	
//			}
//				
//		}
//				

//		System.out.println("Total Bill : " + totalPrice);
		
		
		int count = 0;
		System.out.println("Welcome to the Store ");
		System.out.println("****************************************");
	
		while(true)
		{
			System.out.println("Enter Type of Dessert : ");
			String type = sc.next();
			System.out.println("Enter total items : ");
			int quantity = sc.nextInt();
			count+=quantity;
			
			switch(type)
			{
			case "Cookies":
				Cookies cook = new Cookies(quantity);
				Cart cook1 = new Cart();
				cook1.addToCart(cook);
				System.out.println("Total price of " + type +  ":" +  cook.total);
				break;
			
			case "Candies":

				Candies can = new Candies(quantity);
				Cart can1 = new Cart();
				can1.addToCart(can);
				System.out.println("Total price of " + type +  ":" +  can.total);
				break;
				
			case "Icecreams":
				Icecreams ice = new Icecreams(quantity);
				Cart ice1 = new Cart();
				ice1.addToCart(ice);
				System.out.println("Total price of " + type +  ":" +  ice.total);
				break;	
			}
			
			System.out.println("Total items in Cart: " + count);
			System.out.println("Total Bill : " + totalPrice);
			System.out.println("_______________________________");
		}
		
		
		
		
		
		
	}

}
