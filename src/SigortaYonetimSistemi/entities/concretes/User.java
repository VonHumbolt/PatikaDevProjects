package SigortaYonetimSistemi.entities.concretes;

import java.util.Date;
import java.util.List;

import SigortaYonetimSistemi.entities.abstracts.Address;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String job;
	private int age;
	public List<Address> addressList;
	private Date lastEntry;
		
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public Date getLastEntry() {
		return lastEntry;
	}
	public void setLastEntry(Date lastEntry) {
		this.lastEntry = lastEntry;
	}
	
	
	
}
