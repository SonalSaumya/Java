package day3;

public class ContractEmployee extends Employee {
	
	protected int remuneration;
	protected int hrs;

	public ContractEmployee(int empid, String name,int remuneration,int hrs)
	{
		super(empid, name);
		this.remuneration = remuneration;
		this.hrs = hrs;
	}
	
	
	@Override
	public double calculateGross()
	{
		
		return remuneration*hrs;
	}

}
