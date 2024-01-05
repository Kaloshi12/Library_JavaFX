package Model;

import java.util.Date;
import java.util.HashMap;

public class Admin extends Employee {
    private HashMap<String, String> admin_logIn;

    public HashMap<String, String> getAdmin_logIn() {
        return admin_logIn;
    }

    public void setAdmin_logIn(HashMap<String, String> admin_logIn) {
        this.admin_logIn = admin_logIn;
    }

    public Admin(String name, String surname, Date birthday, String phoneNumber, Double salary, AccessLevel level,
                 String userId, String password) {
        super(name, surname, birthday, phoneNumber, salary, level, userId, password);
        this.admin_logIn = new HashMap<>();
        admin_logIn.put("Franko98", "12345678");
    }
}
