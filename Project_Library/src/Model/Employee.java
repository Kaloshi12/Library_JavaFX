package Model;

import java.util.Date;

public class Employee {
	private String name ;
	private String surname;
	private Date birthday;
	private String phoneNumber;
	private Double salary;
	private AccessLevel level;
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public AccessLevel getLevel() {
		return level;
	}
	public void setLevel(AccessLevel level) {
		this.level = level;
	}
	public Employee(String name, String surname, Date birthday, String phoneNumber, Double salary, AccessLevel level,
			String userId, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.level = level;
		this.userId = userId;
		this.password = password;
	}
	

}
