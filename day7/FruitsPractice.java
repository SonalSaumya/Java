package day7;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FruitsPractice {
	
	
	public static void main(String[] args)
	{
		String[] fruits = {"Mango","orange","Grapes","apple","Banana","strawberry","Watermelon"};
		List<String> lst = Arrays.asList(fruits);
		
		
		Stream<String> stream = lst.stream();
		stream.map((s) -> s.toUpperCase()).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		Stream<String> stream1 = lst.stream();
		stream1.map((s) -> s.toLowerCase()).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		Stream<String> stream3 = lst.stream();
		stream3.filter((str) ->  Character.isUpperCase(str.charAt(0))).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		
		int val = 'n';
		Stream<String> stream4 = lst.stream();
		stream4.filter((str) -> (int)str.toLowerCase().charAt(0) < val).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		int val1 = 'n';
		Stream<String> stream5 = lst.stream();
		stream5.filter((str) -> (int)str.toLowerCase().charAt(0) > val1).forEach(System.out::println);
		System.out.println("______________________________________________________");
		
		
		Stream<String> stream6 = lst.stream();
		stream6.filter((str) -> str.length() <= 6).forEach(System.out::println);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<String> stream = Arrays.asList(fruits);
//		
//		List<String> uppercase = new ArrayList();
//		
//		System.out.println(stream);
//		
//		
//		for(Object o : stream)
//		{
//			uppercase.add(o.toString().toUpperCase());
//		}
//		
//		System.out.println(uppercase);
//		
//		
//		
//		List<String> lowercase = new ArrayList();
//		for(Object o : stream)
//		{
//			lowercase.add(o.toString().toLowerCase());
//		}
//		System.out.println(lowercase);
//		
//		
//		List<String> withupper = new ArrayList();
//		for(Object o : stream)
//		{
//			String f = o.toString();
//			
//			if( Character.isUpperCase(f.charAt(0)))
//			{
//				
//			}
//		}
//		System.out.println(lowercase);
//		
//		
//		
//		
		
		
		
		
		
	}

	
	
}
