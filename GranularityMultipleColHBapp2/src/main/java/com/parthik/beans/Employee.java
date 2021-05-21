package com.parthik.beans;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
	private String name;
	private int salary;
	
	@Embedded
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name="city",column = @Column(name="Office_city")),
		@AttributeOverride(name="state",column = @Column(name="Office_state")),
		@AttributeOverride(name="pin",column = @Column(name="Office_pin"))
		
	})
	private Address officeAddress;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Employee(int empno, String name, int salary, Address homeAddress, Address officeAddress) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", homeAddress=" + homeAddress
				+ ", officeAddress=" + officeAddress + "]";
	}

	
	
	
	
}
