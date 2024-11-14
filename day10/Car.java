package day10;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Car {
	private final String make;
	private final String model;
	private final Date mandate;
	private final List<String> colors;
	public Car(String make, String model, Date mandate, List<String> colors) {
		super();
		this.make = make;
		this.model = model;
		this.mandate = new Date(mandate.getDay(), mandate.getMonth(), mandate.getYear());;
		
		List<String> temp = new ArrayList();
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext())
		{
			temp.add(itr.next());
		}
		
		this.colors = temp;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public Date getMandate() {
		return mandate;
	}
	public List<String> getColors() {
		return colors;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", mandate=" + mandate + ", colors=" + colors + "]";
	}
	
	
	

}
