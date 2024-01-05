package Model;

import java.util.Date;
import java.util.HashMap;

public class Librarian extends Employee {
	private HashMap<String,String> librarian_logIn;
	public Librarian(String name, String surname, Date birthday, String phoneNumber, Double salary, AccessLevel level,
			String userId, String password,HashMap<String,String> librarian_logIn) {
		super(name, surname, birthday, phoneNumber, salary, level, userId, password);
		 librarian_logIn = librarian_logIn;
	}
	public HashMap<String, String> getLibrarian_logIn() {
		return librarian_logIn;
	}
	public void setLibrarian_logIn(HashMap<String, String> librarian_logIn) {
		this.librarian_logIn = librarian_logIn;
	}
	@Override
	public String toString() {
		return "Librarian [librarian_logIn=" + librarian_logIn + ", getUserId()=" + getUserId() + ", getPassword()="
				+ getPassword() + ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getBirthday()="
				+ getBirthday() + ", getPhoneNumber()=" + getPhoneNumber() + ", getSalary()=" + getSalary()
				+ ", getLevel()=" + getLevel() + ", toString()=" + super.toString() + "]";
	}

	

	

	

}
