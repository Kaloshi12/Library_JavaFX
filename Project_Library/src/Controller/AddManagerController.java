package Controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Model.AccessLevel;
import Model.Manager;
import View.AddManagerView;

public class AddManagerController {
    private AddManagerView view;

    public AddManagerController(AddManagerView view) {
        this.view = view;
        view.getAddButton().setOnAction(e -> addManager());
    }

    public void addManager() {
        String name = view.getNameField().getText();
        String surname = view.getSurnameField().getText();
        LocalDate birthday = view.getBirthdayPicker().getValue();  
        String phoneNumber = view.getPhoneNumberField().getText();
        double salary;

        try {
            salary = Double.parseDouble(view.getSalaryField().getText());
        } catch (NumberFormatException e) {
            showWrongAlert("Error", "Invalid salary format. Please enter a valid number.");
            return;
        }

        String userId = view.getUserIdField().getText();
        String password = view.getPasswordField().getText();

        for (Manager existingManager : Manager.getManagers()) {
            if (existingManager.getName().equals(name) && existingManager.getSurname().equals(surname)) {
                showWrongAlert("Error", "Manager with the same name and surname already exists. Please choose a different one.");
                return;
            }
            if (existingManager.getUserId().equals(userId)) {
                showWrongAlert("Error", "User ID already exists. Please choose a different one.");
                return;
            }
        }

        Manager manager = new Manager(name, surname, birthday, phoneNumber, salary, AccessLevel.MANAGER, userId, password);
        Manager.addManager(manager);
        Manager.addLogInManager(userId, password);

        view.getManagerTableView().setItems(Manager.getManagers());

        clearFields();

        showSuccessAlert("Success", "Manager added successfully: " + name +" "+ surname);
    }

    public void clearFields() {
        view.getNameField().clear();
        view.getSurnameField().clear();
        view.getBirthdayPicker().setValue(null); 
        view.getPhoneNumberField().clear();
        view.getSalaryField().clear();
        view.getUserIdField().clear();
        view.getPasswordField().clear();
    }
    
    private void showSuccessAlert(String title,String message) {
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle("Success");
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void showWrongAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
