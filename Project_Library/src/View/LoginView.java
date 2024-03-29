package View;

import Controller.Admin_View_Controller;
import Files.Files_User;
import Model.AccessLevel;
import Model.Employee;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicBoolean;

public class LoginView extends Pane {
    private Files_User file = new Files_User();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
    private LocalDate date = LocalDate.parse("98-08-09", formatter);
    private LocalDate date1 = LocalDate.parse("03-08-05", formatter);
    private LocalDate date2 = LocalDate.parse("04-08-05", formatter);
    private TextField usernameTextField;
    private PasswordField passwordTextField;
    private Text success;
    private Scene scene;
    private Stage stage; 
    private AdminStage Astage = new AdminStage();
    private MenuManagerStage Mstage = new MenuManagerStage();
    private MenuLibrarianStage Lstage = new MenuLibrarianStage();
    private Employee librarian = new Employee("Enio", "Bica", date2, "+35569845185", 600.0, AccessLevel.LIBRARIAN, "Enio", "12345678");
    private Employee manager = new Employee("Herion", "Halilaj", date1, "+3558550090", 1000.0, AccessLevel.MANAGER, "Herion03", "12345678");
    private Employee admin = new Employee("Franko", "Kaloshi", date, "+355688459875", 5000.0, AccessLevel.ADMINISTRATOR, "Franko98", "12345678");

    public LoginView(Stage stage) {
        boolean adminExists = false;
        boolean managerExists = false;
        boolean librarianExists = false;

        for (Employee user : file.getAll()) {
            if (admin.getUserId().equals(user.getUserId())) {
                adminExists = true;
            }

            if (manager.getUserId().equals(user.getUserId())) {
                managerExists = true;
            }
            if (librarian.getUserId().equals(user.getUserId())) {
                librarianExists = true;
            }
        }

        if (!adminExists) {
            file.create(admin);
            System.out.println("Admin saved");
        }

        if (!managerExists) {
            file.create(manager);
            System.out.println("Manager saved");
        }
        if (!librarianExists) {
            file.create(librarian);
            System.out.println("Librarian saved");
        }

        stage.setTitle("LogIn");

        Label username = new Label("UserID");
        username.setLayoutX(20);
        username.setLayoutY(55);
        username.setFont(Font.font("Arial", 14));

        Label password = new Label("Password");
        password.setLayoutX(20);
        password.setLayoutY(100);
        password.setFont(Font.font("Arial", 14));

        usernameTextField = new TextField();
        usernameTextField.setLayoutX(120);
        usernameTextField.setLayoutY(50);
        usernameTextField.setFont(new Font("Arial", 14));

        passwordTextField = new PasswordField();
        passwordTextField.setLayoutX(120);
        passwordTextField.setLayoutY(100);
        passwordTextField.setFont(Font.font("Arial", 14));

        Label show = new Label();
        show.setLayoutX(120);
        show.setLayoutY(150);
        show.setFont(Font.font("Arial", 14));

        CheckBox showPasswordCheckbox = new CheckBox("Show Password");
        showPasswordCheckbox.setLayoutX(120);
        showPasswordCheckbox.setLayoutY(180);
        showPasswordCheckbox.setOnAction(e -> {
            if (showPasswordCheckbox.isSelected()) {
                show.setText("Password: " + passwordTextField.getText());
            } else {
                show.setText("");
            }
        });

        success = new Text("");
        success.setLayoutX(120);
        success.setLayoutY(20);
        success.setFont(Font.font("Arial", 15));

        Button logIn = new Button("Log In");
        logIn.setLayoutX(120);
        logIn.setLayoutY(220);
        logIn.setOnAction(e -> checkLogin());

        getChildren().addAll(username, password, usernameTextField, passwordTextField,
                showPasswordCheckbox, logIn, show, success);
        scene = new Scene(this, 300, 280);
    }

    public void checkLogin() {
        String userName = usernameTextField.getText();
        String password = passwordTextField.getText();
        AtomicBoolean loginSuccessful = new AtomicBoolean(false);

        for (Employee user : file.getAll()) {
            if (userName.equals(user.getUserId()) && password.equals(user.getPassword())) {
                loginSuccessful.set(true);

                if (user.getLevel().equals(AccessLevel.ADMINISTRATOR)) {
                    Platform.runLater(Astage::open);
                } else if (user.getLevel().equals(AccessLevel.MANAGER)) {
                    Platform.runLater(Mstage::open);
                } else if (user.getLevel().equals(AccessLevel.LIBRARIAN)) {
                    Platform.runLater(Lstage::open);
                }
                clearField();
                break;
            }
        }

        Platform.runLater(() -> {
            if (loginSuccessful.get()) {
                success.setFill(Color.GREEN);
                success.setText("Login Successful!");
                close(); 
            } else {
                success.setFill(Color.RED);
                success.setText("Wrong UserID or Password!");
            }
        });
    }
    public void clearField() {
    	usernameTextField.clear();
    	passwordTextField.clear();
    }
    public void close() {
        Stage stage = (Stage) getScene().getWindow();
        stage.close();
    }
}
