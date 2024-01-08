package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.AccessLevel;
import Model.Librarian;
import Model.Manager;
import View.AddLibrarianView;

public class AddLibrarian_Controller {
private AddLibrarianView view = new AddLibrarianView();


public AddLibrarian_Controller(AddLibrarianView view) {
	
	this.view.getAddButton().setOnAction(null);
}
public void addManager() {
    String name = view.getNameField().getText();
    String surname = view.getSurnameField().getText();
    Date birthday = parseDate(view.getBirthdayField().getText());
    String phoneNumber = view.getPhoneNumberField().getText();
    double salary = Double.parseDouble(view.getSalaryField().getText());
    String userId = view.getUserIdField().getText();
    String password = view.getPasswordField().getText();

    for (Manager existingManager : Manager.getManagers()) {
        if (existingManager.getName().equals(name) && existingManager.getSurname().equals(surname)) {
            view.getMessageText().setText("Manager with the same name and surname already exists. Please choose a different one.");
            return;
        }
        if (existingManager.getUserId().equals(userId)) {
            view.getMessageText().setText("User ID already exists. Please choose a different one.");
            return;
        }
    }

    Librarian librarian = new Librarian(name, surname, birthday, phoneNumber, salary,
            AccessLevel.LIBRARIAN, userId, password);

    Librarian.getLibrarianList().add(librarian);
    
    view.getLibrarianTableView().getItems().add(librarian);

    clearFields();

    view.getMessageText().setText("Librarian added: " + librarian);
}

public Date parseDate(String dateString) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    try {
        return dateFormat.parse(dateString);
    } catch (ParseException e) {
        System.out.println("Error parsing date. Please enter the date in the format MM/dd/yyyy.");
        return null;
    }
}

public void clearFields() {
    view.getNameField().clear();
    view.getSurnameField().clear();
    view.getBirthdayField().clear();
    view.getPhoneNumberField().clear();
    view.getSalaryField().clear();
    view.getUserIdField().clear();
    view.getPasswordField().clear();
}


public AddLibrarianView getView() {
	return view;
}

public void setView(AddLibrarianView view) {
	this.view = view;
}

	
}
