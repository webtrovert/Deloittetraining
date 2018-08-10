package com;

public class Employee {
	private String employeeName;
	private Address address;
	
	
	public void dd() {
		employeeName = "NA";
		System.out.println("INIT METHOD CALLED");
	}
	
	public Employee() {
		System.out.println("Employee DEF Cons Called");
	}
	
	/**
	 * @param employeeName
	 */
	public Employee(String employeeName) {
		super();
		System.out.println("Employee constructor called");
		this.employeeName = employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	
	

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", address=" + address + "]";
	}
	
}
