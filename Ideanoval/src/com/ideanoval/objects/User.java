package com.ideanoval.objects;

import java.util.Date;

public class User {

	private int id = -1;
	private String firstname = null;
	private String lastname = null;
	private String email= null;
	private String password = null;
	private Date birthDate = null;
	private int roadNumber = -1;
	private String road = null;
	private String postCode = null;
	private String city = null;
	private String country = null;
	private boolean isActive = false;


//constructors
	// WITH "id" field
	public User(int id, String firstname, String lastname, String email, String password, Date birthDate,
			int roadNumber, String road, String postCode, String city, String country, boolean isActive) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
		this.roadNumber = roadNumber;
		this.road = road;
		this.postCode = postCode;
		this.city = city;
		this.country = country;
		this.isActive = isActive;
	}

	// WITHOUT "id" field
	public User(String firstname, String lastname, String email, String password, Date birthDate, int roadNumber,
			String road, String postCode, String city, String country, boolean isActive) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
		this.roadNumber = roadNumber;
		this.road = road;
		this.postCode = postCode;
		this.city = city;
		this.country = country;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getRoadNumber() {
		return roadNumber;
	}
	public void setRoadNumber(int roadNumber) {
		this.roadNumber = roadNumber;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", birthDate=" + birthDate + ", roadNumber=" + roadNumber + ", road="
				+ road + ", postCode=" + postCode + ", city=" + city + ", country=" + country + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
	
	
}
