package day2;



public class Car {
	
	private String make;
	private String model;
	private Date pdate;
	
	
	public Car(String make,String model,Date pdate)
	{
		this.make = make;
		this.model = model;
		this.pdate = pdate;
	}
	
	
	public String toString()
	{
		return "make :"+make+" model :" + model + " pdate : "+pdate;
	}
	
	
	public static void main(String[] args)
	{
		Car c = new Car("honda","city",new Date(1,"JAN",2022));
		System.out.println(c);
	}
	
	
	

}
