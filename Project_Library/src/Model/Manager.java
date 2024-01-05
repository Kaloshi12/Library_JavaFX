package Model;

import java.util.Date;
import java.util.HashMap;

public class Manager extends Employee{
	private HashMap<String,String> manager_loIn;
	public Manager(String name, String surname, Date birthday, String phoneNumber, Double salary, AccessLevel level,
			String userId, String password,HashMap<String,String> manager_loIn) {
		super(name, surname, birthday, phoneNumber, salary, level, userId, password);
	manager_loIn = manager_loIn;	
	}
	public HashMap<String, String> getManager_loIn() {
		return manager_loIn;
	}
	public void setManager_loIn(HashMap<String, String> manager_loIn) {
		this.manager_loIn = manager_loIn;
	}
	@Override
	public String toString() {
		return "Manager [manager_loIn=" + manager_loIn + ", getUserId()=" + getUserId() + ", getPassword()="
				+ getPassword() + ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getBirthday()="
				+ getBirthday() + ", getPhoneNumber()=" + getPhoneNumber() + ", getSalary()=" + getSalary()
				+ ", getLevel()=" + getLevel() + ", toString()=" + super.toString() + "]";
	}
	

	

}
