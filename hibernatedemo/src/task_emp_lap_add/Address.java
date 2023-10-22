package task_emp_lap_add;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private int addId;
	private String streetName;
	private String city;
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String streetName, String city) {
		super();
//		this.addId = addId;
		this.streetName = streetName;
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", streetName=" + streetName + ", city=" + city + "]";
	}
	
}
