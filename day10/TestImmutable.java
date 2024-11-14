package day10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestImmutable {
	
	public static void main(String[] args)
	{
		List<String> colors = new ArrayList();
		colors.add("white");
		colors.add("Black");
		
		Date mdate = new Date();
		
		Car c = new Car("aaa","bbb",mdate,colors);
		System.out.println(c);
		
		System.out.println(mdate.getDay());
		System.out.println(mdate.getMonth());
		System.out.println(mdate.getDate());
	}

}
