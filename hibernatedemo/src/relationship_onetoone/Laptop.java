package relationship_onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue
	private int laptopNo;
	private String model;
	private String price;
	public int getLaptopNo() {
		return laptopNo;
	}
	public void setLaptopNo(int laptopNo) {
		this.laptopNo = laptopNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Laptop(String model, String price) {
		super();
//		this.laptopNo = laptopNo;
		this.model = model;
		this.price = price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [laptopNo=" + laptopNo + ", model=" + model + ", price=" + price + "]";
	}
	
}
