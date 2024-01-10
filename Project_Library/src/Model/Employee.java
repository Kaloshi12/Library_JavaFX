package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
	private StringProperty name ;
	private StringProperty surname;
	private LocalDate birthday;
	private StringProperty phoneNumber;
	private DoubleProperty salary;
	protected AccessLevel level;
	private StringProperty userId;
	private StringProperty password;
	public String getUserId() {
		return (String)userId.get();
	}
	public void setUserId(String userId) {
		this.userId.set(userId);;
	}
	public String getPassword() {
		return password.get();
	}
	public void setPassword(String password) {
		this.password.set(password);;
	}
	public String getName() {
		return (String)name.get();
	}
	public void setName(String name) {
		this.name.set(name);;
	}
	public String getSurname() {
		return (String)surname.get();
	}
	public void setSurname(String surname) {
		this.surname.set(surname);;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return (String)phoneNumber.get();
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber.set(phoneNumber);;
	}
	public Double getSalary() {
		return salary.get();
	}
	public void setSalary(Double salary) {
		this.salary.set(salary);;
	}
	public AccessLevel getLevel() {
		return level;
	}
	public void setLevel(AccessLevel level) {
		this.level = level;
	}
	public Employee(String name, String surname, LocalDate birthday, String phoneNumber, Double salary, AccessLevel level,
			String userId, String password) {
		super();
		this.name = new SimpleStringProperty(name);
		this.surname = new SimpleStringProperty(surname);
		this.birthday = birthday;
		this.phoneNumber = new SimpleStringProperty(phoneNumber);
		this.salary = new SimpleDoubleProperty(salary);
		this.level = level;
		this.userId = new SimpleStringProperty(userId);
		this.password = new SimpleStringProperty(password);
	}
	
	

}
