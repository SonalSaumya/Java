package day3;

public class EmployeePortal {
	
	public static void main(String[] args)
	{
		Payroll payroll = new Payroll();
		
		SalariedEmployee se = new SalariedEmployee(345,"aa",80000);
		payroll.displayGross(se);
		payroll.displayNet(se);
		
		Employee [] emps = new Employee[2];
		emps[0] = new SalariedEmployee(667,"pp",50000);
		emps[1] = new Manager(877,"ss",90000,10000);
		
		payroll.displayGross(emps[0]);
		
		SalariedEmployee ss = (SalariedEmployee)emps[0];
		payroll.displayNet(ss);
	}

}
