package day7;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class DemoIntegerStream {
	
	public static void main(String[] args) {
		Integer [] nums = {12,4,7,10,23,18,13,26,17,2,24,15,55,54,34,78,7,2,24,15,55,54
	};
		List<Integer> lst = Arrays.asList(nums);
		System.out.println("---------------");
		Stream<Integer> stream = lst.parallelStream();
		stream.map((n) -> Math.sqrt(n)).forEach(System.out::println);
		System.out.println("---------------");
		stream = lst.parallelStream();
		List<Integer> primes = stream.filter(Maths::isPrime).collect(Collectors.toList());
		System.out.println(primes);
		
		System.out.println("---------------");
		stream = lst.stream();
		stream.distinct().sorted(Integer::compareTo).forEach(System.out::println);
		
		System.out.println("---------------");
		stream = lst.stream();
		Optional<Integer> total= stream.reduce((n1,n2) -> n1+n2);
		if(total.isPresent())
			System.out.println(total.get());
		
		stream = lst.parallelStream();
		long sum= stream.reduce(1, (n1,n2) -> n1+n2);
		System.out.println(sum);
		
		System.out.println("---------------");
		stream = lst.stream();
		Optional<Integer> min= stream.min(Integer::compareTo);
		if(min.isPrresent())
			System.out.println(min.get());
		
		stream = lst.stream();
		OptionalDouble ave= stream.mapToDouble(Double::valueOf).average();
		if(ave.ispresent())
			System.out.println(ave.getAsDouble());
}

