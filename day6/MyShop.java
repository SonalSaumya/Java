package day6;

import java.util.*;

public class MyShop {
	
	public static void main(String[] args)
	{
       Stock stock = new Stock();
       
       stock.addToy(new Toy(1, "A", 25, 5,1,1 ,"Educational" ,1));
       stock.addToy(new Toy(2, "B", 44, 8,2,2, "Battery Operated" ,2));
       stock.addToy(new Toy(3, "C", 35, 3, 3,3,"Battery Operated" ,3));
       stock.addToy(new Toy(4, "D", 15, 6, 4,4,"Educational",4 ));
       
       
       while (true)
       {
           System.out.println("\nToy Store Menu:");
           System.out.println("1. List Stock");
           System.out.println("2. Filter by Category");
           System.out.println("3. Search Toy by ID");
           System.out.println("4. List Toys by Price Range");
           System.out.println("5. List Toys by Age");
           System.out.println("6. Sort Toys by Price");
           System.out.println("7. Sort Toys by Product ID");
           System.out.println("8. List Old Stock (older than 1 year)");
           System.out.println("9. Group Toys by Category");
           System.out.println("10. Exit");

	
       
       
       
       Scanner scanner = new Scanner(System.in);
       int choice = scanner.nextInt();
       
       switch (choice) {
       case 1:
           stock.liststock();
           break;
       case 2:
           System.out.print("Enter category: ");
           String category = scanner.next();
           stock.filterByCategory(category);
           break;
       case 3:
           System.out.print("Enter toy product ID: ");
           int productId = scanner.nextInt();
           stock.searchToy(productId);
           break;
       case 4:
           System.out.print("Enter minimum price: ");
           double minPrice = scanner.nextDouble();
           System.out.print("Enter maximum price: ");
           double maxPrice = scanner.nextDouble();
           stock.listToyByPriceRange(minPrice, maxPrice);
           break;
       case 5:
           System.out.print("Enter age group: ");
           int age = scanner.nextInt();
           stock.listToysByAge(age);
           break;
     
       default:
           System.out.println("Invalid choice, please try again.");
   }

	}
	}
}
       



