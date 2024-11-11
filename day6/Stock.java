package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import day4.Employee;

public class Stock {
	
	
	private List<Toy> toylist;
	
	public Stock()
	{
		toylist = new ArrayList<>();
	}
	
	
	public void addToy(Toy toy)
	{
		toylist.add(toy);
	}
	
	public void liststock()
	{
		for(Toy toy : toylist)
		{
			System.out.println(toy);
		}
	}
	
	
	public void filterByCategory(String category)
	{
		
		
		List<Toy> toysInRange = new ArrayList();
		
		for(Toy toy : toylist)
		{
			if(toy.getCategory().equals(category))
			{
				toysInRange.add(toy);
			}
		}
		
		for(Toy toy : toysInRange)
		{
			System.out.println(toy);
		}
		
		
	}
	
	
	public void searchToy(int id)
	{
		List<Toy>  idList= new ArrayList();
		
		for	(Toy toy : toylist)
		{
			if(toy.getId() == id)
			{
				idList.add(toy);
			}
		}
		
		
		for(Toy toy : idList)
		{
			System.out.println(toy);
		}
	
		
		
	}
	
	
	public void listToyByPriceRange(double minPrice,double maxPrice)
	{
		
		
		List<Toy> toysInRange = new ArrayList();
		
			for(Toy toy : toylist)
			{
				if(toy.getPrice() >= minPrice && toy.getPrice()<=maxPrice)
				{
					toysInRange.add(toy);
				}
			}
			
			
			for(Toy toy : toysInRange)
			{
				System.out.println(toy);
			}
		
	}
	
	
	public void listToysByAge(int age)
	{
		
		
		List<Toy> toysByAge = new ArrayList();
		
			for(Toy toy : toylist)
			{
				if(toy.getAge() == age)
				{
					 toysByAge.add(toy);
				}
			}
			
			
			for(Toy toy :  toysByAge)
			{
				System.out.println(toy);
			}
		
	}
	
	public void sortByPriceRatingId(float price,int rating,int id)
	{
		List<Toy> toys = new ArrayList();
		
		for(Toy toy:toylist)
		{
			if(toy.getPrice()== price && toy.getRating()==rating && toy.getId()==id)
			{
				toys.add(toy);
			}
		}
		
		for(Toy toy :  toys)
		{
			System.out.println(toy);
		}
	}
	


}


