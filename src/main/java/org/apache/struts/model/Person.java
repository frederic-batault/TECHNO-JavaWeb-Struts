package org.apache.struts.model;

import java.util.Arrays;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String sport;
	private String gender;
	private String state;
	private String[] carModels;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String[] getCarModels() {
		return carModels;
	}

	public void setCarModels(String[] carModels) {
		this.carModels = carModels;
	}

	public String toString() {
		return "First Name: " + getFirstName() + " | " +
		        " Last Name:  " + getLastName() + " | " +
		        " Favorite Sport: " + getSport() + " | " +
		        " Gender: " + getGender() + " | " +  
		        " Residency: " + getState() + " | " +
		        " Over 21: " + " | " +
		" Car models: " + Arrays.asList( getCarModels() );
	}
}
