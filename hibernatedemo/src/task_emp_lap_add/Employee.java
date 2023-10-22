package task_emp_lap_add;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="emid")
	private int empId;
	private String empName;
	private String empCity;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Address> address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public Employee( String empName, String empCity, List<Address> address, Laptop laptop) {
		super();
//		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.address = address;
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", address=" + address
				+ ", laptop=" + laptop + "]";
	}
	
	
	
	
	
}
