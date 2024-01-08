package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.AccessLevel;
import Model.Manager;
import View.AddManagerView;

public class AddManagerController {
private AddManagerView view = new AddManagerView();
private SimpleDateFormat dateFormat;
	public AddManagerController(AddManagerView view){
	view.getAddButton().setOnAction(e -> addManager() );
}
	public AddManagerView getView() {
		return view;
	}
	public void setView(AddManagerView view) {
		this.view = view;
	}
	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
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

        Manager manager = new Manager(name, surname, birthday, phoneNumber, salary,
                AccessLevel.MANAGER, userId, password);

        view.getManagerTableView().getItems().add(manager);

        clearFields();

        view.getMessageText().setText("Manager added: " + manager);
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
}
