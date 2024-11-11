package day6;

public class Toy {
	
	private int id;
	private String name;
	private float price;
	private int age;
	private int pmonth;
	private int pyear;
	private String category;
	private int rating;
	
	
	public Toy(int id, String name, float price, int age, int pmonth, int pyear,String category,int rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.age = age;
		this.pmonth = pmonth;
		this.pyear = pyear;
		this.category = category;
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + ", price=" + price + ", age=" + age + ", pmonth=" + pmonth
				+ ", pyear=" + pyear + ", category=" + category + ", rating=" + rating + "]";
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


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
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


	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
