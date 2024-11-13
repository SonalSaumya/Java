package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day7.Employee;

import java.util.ArrayList;


class ToyStream
{

	public List<Toy> initializeData()
	{
		ArrayList<Toy> toylist = new ArrayList();
		toylist.add(new Toy(1,"a",5.0,10,2,2024,"Educational"));
		toylist.add(new Toy(2,"a",5.0,1,2,2024,"Educational"));
		toylist.add(new Toy(3,"a",5.0,10,2,2024,"Battery Operated"));
		toylist.add(new Toy(4,"a",5.0,2,2,2024,"Educational"));
		toylist.add(new Toy(5,"a",5.0,0,2,2024,"Battery Operated"));
		
		return toylist;
		
	}
}


public class MyShop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ToyStream ts = new ToyStream();
		
		List<Toy> toylist = ts.initializeData();
		
		Stream<Toy> stream = toylist.stream();
		
		
		//1.List the Stock
		
		stream.forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		
		
		//2.Filter by category
		System.out.println("Enter category : ");
		String category = sc.nextLine();
		Stream<Toy> stream1 = toylist.stream();
		stream1.filter(toy -> toy.getCategory().equals(category)).forEach(System.out::println);
		System.out.println("______________________________________________________");
		

		//3.List Toys by price range
		System.out.println("Enter minimum and maximum : ");
		int min = sc.nextInt();
		int max = sc.nextInt();
		Stream<Toy> stream2 = toylist.stream();
		stream2.filter(toy ->  toy.getPrice() >= min && toy.getPrice() <=max).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		//4.Sort toys by price category wise
		Stream<Toy> stream3 = toylist.stream();
		Comparator<Toy> byprice = Comparator.comparing(Toy :: getPrice);
		Comparator<Toy> bycat = Comparator.comparing(Toy::getCategory).thenComparing(byprice);
		stream3.sorted(bycat).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		
		//5.Old stock older than 1 year
		Stream<Toy> stream4 = toylist.stream();
		stream4.filter(toy -> toy.getAge() >= 1).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		
		//6.Group of toys as per category and count
		Stream<Toy> stream5 = toylist.stream();
		long cnt = stream5.filter(toy -> toy.getCategory().equals(category)).collect(Collectors.counting());
		System.out.println(cnt);
		System.out.println("______________________________________________________");
		
		
		//7. Display the most expensive/least expensive toy
//		double most=0;
//		double least=0;
		
//		Stream<Toy> stream6 = toylist.stream();
//		stream6.filter(toy -> {
//			if(toy.getPrice() >= most)
//			{
//				most =toy.getPrice();
//			}
//			if(toy.getPrice() <= least)
//			{
//				least = toy.getPrice();
//			}
//			
//		});
		
//		stream6.max(Comaprator.comparing(Toy:: getPrice).forEach(System.out::println));
//		
//		.max(Comparator.comparing(Integer::valueOf)).get();
		
		
		//7. Display the most expensive/least expensive toy
		Stream<Toy> stream6 = toylist.stream();
		Toy most = stream6.max(Comparator.comparing(Toy :: getPrice)).get();
		
		Stream<Toy> stream7 = toylist.stream();
		Toy least = stream7.min(Comparator.comparing(Toy :: getPrice)).get();
		
		//8.Print total no of toys
		
		Stream<Toy> stream8 = toylist.stream();
		//stream8.filter(toy -> toy.getAge().collect(Collectors.counting())).forEach(System.out :: println);
		
		//long val = stream8.filter(toy -> toy.getAge().collect(Collectors.counting()).forEach(System.out :: println);
		
		
			
	      Map<Integer, Long> map = stream8.collect(Collectors.groupingBy(Toy :: getAge, Collectors.counting()));
	      System.out.println(map);
	      System.out.println("______________________________________________________");
		
		
		
		
		
		
		
		

		
			
	}
	
	
	

	
}
