package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Manager extends Employee {
    private static ArrayList<Manager> managers = new ArrayList<>();
    private static HashMap<String,String> man_LogIn = new HashMap<>();

    public Manager(String name, String surname, Date birthday, String phoneNumber, Double salary,
                   AccessLevel level, String userId, String password) {
        super(name, surname, birthday, phoneNumber, salary, level, userId, password);
        managers.add(this);
        man_LogIn.put(userId, password);
    }

    public static HashMap<String, String> getMan_LogIn() {
		return man_LogIn;
	}

	public static void setMan_LogIn(HashMap<String, String> man_LogIn) {
		Manager.man_LogIn = man_LogIn;
	}

	public static void setManagers(ArrayList<Manager> managers) {
		Manager.managers = managers;
	}

	public static ArrayList<Manager> getManagers() {
        return managers;
    }
}
