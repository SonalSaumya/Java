package day3;

public class DemoString {

	public static void main(String[] args) {
		String s ="Java";
		String s1 = "Java";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
//		
//		s = s+ " 11";
//		System.out.println(s.hashCode());
//		
		
		String n1 = new String("hello");
		String n2 = new String("hello");
		
		if(s==s1)
			System.out.println("String are equal");
		if(n1.equals(n2))
			System.out.println("String are equal");
	}

}
