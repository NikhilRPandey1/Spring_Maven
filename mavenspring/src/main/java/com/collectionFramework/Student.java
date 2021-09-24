package com.collectionFramework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int Id;
	private String Name;
	private List<String > PhoneNo;
	private Set<String >  Address;
	private Map<String , String> courses;
	
	public Student() {
		super();
	}
	public Student(int id, String name, List<String> phoneNo, Set<String> address, Map<String, String> courses) {
		super();
		Id = id;
		Name = name;
		PhoneNo = phoneNo;
		Address = address;
		this.courses = courses;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		PhoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}
