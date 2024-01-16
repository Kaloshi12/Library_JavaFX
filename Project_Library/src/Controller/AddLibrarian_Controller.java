package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;
import Files.Files_User;
import Model.AccessLevel;
import Model.Employee;
import View.AddLibrarianView;
import View.AddManagerView;

public class AddLibrarian_Controller {
    private  AddLibrarianView view = new AddLibrarianView();
    private Files_User file;
    private ObservableList<Employee> libList = FXCollections.observableArrayList();
    public AddLibrarian_Controller(AddLibrarianView view) {
        this.view = view;
        file = new Files_User();
        AccessLevel level = AccessLevel.LIBRARIAN;
        for(Employee user : file.getAll()) {
        	AccessLevel userLevel = user.getLevel();
        	if(level.equals(userLevel)) {
        		libList.add(user);
        	}
        }
        view.getLibrarianTableView().setItems(libList);
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
//        if (!validInput(name, "Name") ||
//                !validInput(surname, "Surname") ||
//                !validInput(userId, "UserId") ||
//                !validInput(password, "Password")) {
//                return;
//            }
        for (Employee existingUser: libList) {
            if (existingUser.getName().equals(name) && existingUser.getSurname().equals(surname)) {
                showWrongAlert("Error", "Manager with the same name and surname already exists. Please choose a different one.");
                return;
            }
            if (existingUser.getUserId().equals(userId)) {
                showWrongAlert("Error", "User ID already exists. Please choose a different one.");
                return;
            }
        }

        Employee librarian= new Employee(name, surname, birthday, phoneNumber, salary, AccessLevel.MANAGER, userId, password);
        
        	file.create(librarian);
            
        	System.out.println("Saved successfully");
            clearFields();
            
            view.getLibrarianTableView().getItems().add(librarian);
        
            
            file.loadEmployeesFromFile();

        

        clearFields();

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
    public boolean validInput(String input , String fieldName) {
 	   String regex = "\\b[a-zA-Z]+\\b[a-zA-Z]+.*";
 	   if (!input.matches(regex)) {
 	        showWrongAlert("Failed", fieldName + " must contain 2 or more words.");
 	        return false;
 	    }
 	   return true;

    }
    
//    private void showSuccessAlert(String title,String message) {
//        Alert alert = new Alert(AlertType.NONE);
//        alert.setTitle("Success");
//        alert.setHeaderText(title);
//        alert.setContentText(message);
//        alert.showAndWait();
//    }

    public void showWrongAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
