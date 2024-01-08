package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.AccessLevel;
import Model.Librarian;
import Model.Manager;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


	public class AddLibrarianView extends GridPane {
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
	    private TableView<Librarian> librarianTableView;

		public AddLibrarianView() {
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

		        addButton = new Button("Add Librarian");
		 

		        messageText = new Text();
		        messageText.setStyle("-fx-fill: red;");

		        librarianTableView = createLibrarianTableView();

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
		        add(librarianTableView, 2, 0, 1, 9);
		        setColumnSpan(librarianTableView, 2);
		}







		@SuppressWarnings("unchecked")
		private TableView<Librarian> createLibrarianTableView() {
	        TableView<Librarian> tableView = new TableView<>();
	        TableColumn<Librarian, String> nameColumn = new TableColumn<>("Name");
	        nameColumn.setCellValueFactory(cellData ->
	                new SimpleStringProperty(cellData.getValue().getName()));

	        TableColumn<Librarian, String> surnameColumn = new TableColumn<>("Surname");
	        surnameColumn.setCellValueFactory(cellData ->
	                new SimpleStringProperty(cellData.getValue().getSurname()));

	        TableColumn<Librarian, Date> birthdayColumn = new TableColumn<>("Birthday");
	        birthdayColumn.setCellValueFactory(new PropertyValueFactory<>("birthday"));

	        TableColumn<Librarian, String> phoneNumberColumn = new TableColumn<>("Phone Number");
	        phoneNumberColumn.setCellValueFactory(cellData ->
	                new SimpleStringProperty(cellData.getValue().getPhoneNumber()));

	        TableColumn<Librarian, Double> salaryColumn = new TableColumn<>("Salary");
	        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));

	        TableColumn<Librarian, String> userIdColumn = new TableColumn<>("User ID");
	        userIdColumn.setCellValueFactory(cellData ->
	                new SimpleStringProperty(cellData.getValue().getUserId()));

	        tableView.getColumns().addAll(nameColumn, surnameColumn, birthdayColumn,
	                phoneNumberColumn, salaryColumn, userIdColumn);

	        return tableView;
	    }


			public TableView<Librarian> getLibrarianTableView() {
			return librarianTableView;
		}

		public void setlibrarianTableView(TableView<Librarian> librarianTableView) {
			this.librarianTableView = librarianTableView;
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



	}

