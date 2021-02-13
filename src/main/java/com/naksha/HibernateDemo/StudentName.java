package com.naksha.HibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String firstName;
	private String lastName;
	
	protected StudentName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "StudentName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	protected StudentName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
