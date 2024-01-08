package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Librarian extends Employee {
	private static final ObservableList<Librarian> librarianList = FXCollections.observableArrayList();

    private HashMap<String, String> librarian_logIn;



    public Librarian(String name, String surname, Date birthday, String phoneNumber, double salary,
			AccessLevel level, String userId, String password) {
		super(name, surname, birthday, phoneNumber, salary, level, userId, password);
		this.librarian_logIn.put(userId, password);
	}

	public HashMap<String, String> getLibrarian_logIn() {
        return librarian_logIn;
    }

    public void setLibrarian_logIn(HashMap<String, String> librarian_logIn) {
        this.librarian_logIn = librarian_logIn;
    }

    public static ObservableList<Librarian> getLibrarianList() {
        return librarianList;
    }

    @Override
    public String toString() {
        return "Librarian [librarian_logIn=" + librarian_logIn + ", getUserId()=" + getUserId() + ", getPassword()="
                + getPassword() + ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getBirthday()="
                + getBirthday() + ", getPhoneNumber()=" + getPhoneNumber() + ", getSalary()=" + getSalary()
                + ", getLevel()=" + getLevel() + ", toString()=" + super.toString() + "]";
    }
}
