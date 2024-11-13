package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class EmployeeStream {
	
	public List<Employee> initializeData()
	{
		List<Employee> emplist = new ArrayList<>();
		Set<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("Python");
        emplist.add(new Employee(105, "Omkar", 85000, skills,"IT"));
        Set <String> skills1 = new HashSet<>();
        skills1.add("Java");
        skills1.add("C++");
        emplist.add(new Employee(102, "Daksh", 95000, skills1,"Sales"));
        Set <String> skills2 = new HashSet<>();
        skills2.add("Python");
        skills2.add("C++");
        emplist.add(new Employee(104, "Ram", 65000, skills2, "Marketing"));
        Set <String> skills3 = new HashSet<>();
        skills3.add("JavaScript");
        skills3.add("C");
        emplist.add(new Employee(103, "Dhruv", 80000, skills3,"Product"));
        Set <String> skills4 = new HashSet<>();
        skills4.add("Java");
        skills4.add("C#");
        emplist.add(new Employee(101, "Omen", 75000, skills4, "Analyst"));
        return emplist;
    }

		
		public static void main(String[] args) {
			EmployeeStream es = new EmployeeStream();
			List<Employee> stream = es.initializeData();
			Stream<Employee> stream = emplist.stream();
			
			Comparator<Employee> byname = Comparator.comparing(Employee::getName);
			System.out.println("---Sorting by name---");
			stream.sorted(byname).ForEach(System.out::println);
			
			stream= emplist.stream();
			Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
			System.out.println("---Sorting by name for dept---");
			stream.sorted(bydept).forEach(System.out::println);
				
			System.out.println("------Filter by salary range-----");
			stream = emplist.stream();
			Predicate<Employee> salrange = (emp) -> {
				if 
			}
			
			stream.filter(salrange).forEach((v) -> System.out.println(v));
			
			
			System.out.println("----Filter by Skill---");
			stream= emplist.stream();
			stream.filter((emp) -> emp.getSkillset().contains("Java")).forEach(System.out::println);
			
			
			System.out.println("----Group by Department-----");
			stream= emplist.stream();
			Map<String, List<Employee>> empsbydept=stream.collect(Collectors.groupingBy(Employee::getDepartment));
			empsbydept.forEach(k,v) -> System.out.println(k + "," + v);
			
			System.out.println("-------------------");
			stream = emplist.stream();
			stream.map((emp) -> new Department(emp.getEmpid(), emp.getDepartment())) ;
			
			System.out.println("----------------------");
			stream = emplist.stream();
			double totalsal = stream.mapToDouble(Employee::getSalary).reduce(0, (e1,e2) -> e1+e2);
			System.out.println(totalsal);
			
			
			
			
	
	
	
	

}
