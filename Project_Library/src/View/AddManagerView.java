package View;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.AccessLevel;
import Model.Manager;

public class AddManagerView extends GridPane {
    private TextField nameField;
    private TextField surnameField;
    private TextField birthdayField;
    private TextField phoneNumberField;
    private TextField salaryField;
    private TextField userIdField;
    private TextField passwordField;
    private Button addButton;
    private Text messageText;
    private Stage stage;
    private TableView<Manager> managerTableView;

    public AddManagerView() {
        stage = new Stage();

        setPadding(new Insets(10));
        setHgap(10);
        setVgap(10);

        nameField = new TextField();
        surnameField = new TextField();
        birthdayField = new TextField();
        phoneNumberField = new TextField();
        salaryField = new TextField();
        userIdField = new TextField();
        passwordField = new TextField();

        addButton = new Button("Add Manager");
        addButton.setOnAction(e -> addManager());

        messageText = new Text();
        messageText.setStyle("-fx-fill: red;");

        managerTableView = createManagerTableView();

        add(new Label("Name:"), 0, 0);
        add(nameField, 1, 0);
        add(new Label("Surname:"), 0, 1);
        add(surnameField, 1, 1);
        add(new Label("Birthday:"), 0, 2);
        add(birthdayField, 1, 2);
        add(new Label("Phone Number:"), 0, 3);
        add(phoneNumberField, 1, 3);
        add(new Label("Salary:"), 0, 4);
        add(salaryField, 1, 4);
        add(new Label("User ID:"), 0, 5);
        add(userIdField, 1, 5);
        add(new Label("Password:"), 0, 6);
        add(passwordField, 1, 6);
        add(addButton, 0, 7, 2, 1);
        add(messageText, 0, 8, 2, 1);
        add(managerTableView, 2, 0, 1, 9);
        setColumnSpan(managerTableView, 2);
    }

    @SuppressWarnings("unchecked")
	private TableView<Manager> createManagerTableView() {
        TableView<Manager> tableView = new TableView<>();
        TableColumn<Manager, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getName()));

        TableColumn<Manager, String> surnameColumn = new TableColumn<>("Surname");
        surnameColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getSurname()));

        TableColumn<Manager, Date> birthdayColumn = new TableColumn<>("Birthday");
        birthdayColumn.setCellValueFactory(new PropertyValueFactory<>("birthday"));

        TableColumn<Manager, String> phoneNumberColumn = new TableColumn<>("Phone Number");
        phoneNumberColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getPhoneNumber()));

        TableColumn<Manager, Double> salaryColumn = new TableColumn<>("Salary");
        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));

        TableColumn<Manager, String> userIdColumn = new TableColumn<>("User ID");
        userIdColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getUserId()));

        tableView.getColumns().addAll(nameColumn, surnameColumn, birthdayColumn,
                phoneNumberColumn, salaryColumn, userIdColumn);

        return tableView;
    }

	    

	   



		public TableView<Manager> getManagerTableView() {
		return managerTableView;
	}

	public void setManagerTableView(TableView<Manager> managerTableView) {
		this.managerTableView = managerTableView;
	}

		public TextField getNameField() {
			return nameField;
		}







		public void setNameField(TextField nameField) {
			this.nameField = nameField;
		}







		public TextField getSurnameField() {
			return surnameField;
		}

		public void setSurnameField(TextField surnameField) {
			this.surnameField = surnameField;
		}


		public TextField getBirthdayField() {
			return birthdayField;
		}



		public void setBirthdayField(TextField birthdayField) {
			this.birthdayField = birthdayField;
		}

		public TextField getPhoneNumberField() {
			return phoneNumberField;
		}


		public void setPhoneNumberField(TextField phoneNumberField) {
			this.phoneNumberField = phoneNumberField;
		}
	


		public TextField getSalaryField() {
			return salaryField;
		}

		public void setSalaryField(TextField salaryField) {
			this.salaryField = salaryField;
		}

		public TextField getUserIdField() {
			return userIdField;
		}

		public void setUserIdField(TextField userIdField) {
			this.userIdField = userIdField;
		}

		public TextField getPasswordField() {
			return passwordField;
		}


		public void setPasswordField(TextField passwordField) {
			this.passwordField = passwordField;
		}

		public Button getAddButton() {
			return addButton;
		}


		public void setAddButton(Button addButton) {
			this.addButton = addButton;
		}

		public Text getMessageText() {
			return messageText;
		}


		public void setMessageText(Text messageText) {
			this.messageText = messageText;
		}

		public Stage getStage() {
			return stage;
		}

		public void setStage(Stage stage) {
			this.stage = stage;
		}



		private void addManager() {
	        String name = nameField.getText();
	        String surname = surnameField.getText();
	        Date birthday = parseDate(birthdayField.getText());
	        String phoneNumber = phoneNumberField.getText();
	        double salary = Double.parseDouble(salaryField.getText());
	        String userId = userIdField.getText();
	        String password = passwordField.getText();

	        for (Manager existingManager : Manager.getManagers()) {
	            if (existingManager.getName().equals(name) && existingManager.getSurname().equals(surname)) {
	                messageText.setText("Manager with the same name and surname already exists. Please choose a different one.");
	                return;
	            }
	            if (existingManager.getUserId().equals(userId)) {
		            messageText.setText("User ID already exists. Please choose a different one.");
		            return;
	        }

	        Manager manager = new Manager(name, surname, birthday, phoneNumber, salary,
	                AccessLevel.MANAGER, userId, password);

	        clearFields();

	        messageText.setText("Manager added: " + manager);
	    }
		}

    public Date parseDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Error parsing date. Please enter the date in the format dd/MM/yyyy.");
            return null; 
        }
    }

    public void clearFields() {
        nameField.clear();
        surnameField.clear();
        birthdayField.clear();
        phoneNumberField.clear();
        salaryField.clear();
        userIdField.clear();
        passwordField.clear();
    }
}