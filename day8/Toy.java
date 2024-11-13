package day8;

public class Toy {
	
	private int id;
	private String name;
	private double price;
	private int age;
	private int pmonth;
	private int pyear;
	private String category;
	

	public Toy(int id, String name, double d, int age, int pmonth, int pyear,String category) {
	
		this.id = id;
		this.name = name;
		this.price = d;
		this.age = age;
		this.pmonth = pmonth;
		this.pyear = pyear;
		this.category = category;
	}
	

	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + ", price=" + price + ", age=" + age + ", pmonth=" + pmonth
				+ ", pyear=" + pyear + ", category=" + category + "]";
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getPmonth() {
		return pmonth;
	}


	public void setPmonth(int pmonth) {
		this.pmonth = pmonth;
	}


	public int getPyear() {
		return pyear;
	}


	public void setPyear(int pyear) {
		this.pyear = pyear;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	

}

