package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda {
	public boolean operateOnNum(Predicate p, int n)
	{
		return p.test(n);
	}
	
	public List<Integer> operateOnNum(Predicate p, List<Integer> n)
	{
		List<Integer> filtered = new ArrayList<>();
		for(Integer i : n)
		{
			if(p.test(i))
			{
				filtered.add(i);
			}
		}
		return filtered;
	}
	
	
	public static String operateOnString(StringInterface si,String s)
	{
		
		 return si.apply(s);
			
	}

	

	public static void main(String[] args) {
		Integer [] nums = {12, -13, -14, 15, -16, 17, 18};
		List<Integer> vals = Arrays.asList(nums);
		
		DemoLambda demo = new DemoLambda();
		boolean ispositive = demo.operateOnNum((n) -> n>0, 12);
		System.out.println(ispositive);
		
		List<Integer> positives = demo.operateOnNum((n) -> n>0, vals);
		System.out.println(positives);
		
		boolean isDiv = demo.operateOnNum((n)-> n%100 == 0,1200);
		System.out.println(isDiv);
		
		
		String str="sonal";
		
		String name = demo.operateOnString((s) -> s.toUpperCase(),str);
		System.out.println(name);
		
		
		String reverse = operateOnString((s) -> {
			String rev = "";
			
			for(int i=s.length()-1;i>=0;i--)
			{
				rev += s.charAt(i);
				
			}
			return rev;
		},"sonal");
		System.out.println(reverse);
		
		
		String upper = operateOnString(String :: toUpperCase,"Lambda");
		System.out.println(upper);
		
		String lower = operateOnString(String :: toLowerCase,"LAMBDA");
		System.out.println(lower);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
