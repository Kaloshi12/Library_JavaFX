import java.util.HashMap;

import javafx.collections.ObservableList;
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

public class Client_LogIn extends Pane{
	private Stage client ;
	private Label Lusername;
	private Label Lpassword;
	private TextField username;
	private PasswordField password;
	private CheckBox  showPasswordCheckbox;
	private Label show ;
	private Button logIn;
	private Button back;
	private HashMap<String,String> register_client;
	 Library_Client client2 = new Library_Client();
	
	Client_LogIn(){
		this.client = new Stage();
		client.setTitle("Client LogIn");
		Lusername = new Label("Username");
		Lusername.setLayoutX(20);
		Lusername.setLayoutY(55);
		Lusername.setFont(Font.font("Arial",14));
		Lpassword = new Label("Password");
		Lpassword.setLayoutX(20);
		Lpassword.setLayoutY(100);
		Lpassword.setFont(Font.font("Arial",14));
		username = new TextField();
		username.setLayoutX(120);
		username.setLayoutY(50);
		username.setFont(new Font("Arial",14));
		password = new PasswordField();
        password.setLayoutX(120);
        password.setLayoutY(100);
        password.setFont(Font.font("Arial", 14));
        show = new Label();
        show.setLayoutX(120);
        show.setLayoutY(150);
        show.setFont(Font.font("Arial",14));
        showPasswordCheckbox = new CheckBox("Show Password");
        showPasswordCheckbox.setLayoutX(120);
        showPasswordCheckbox.setLayoutY(180);
        showPasswordCheckbox.setOnAction(e -> {
        	 if (showPasswordCheckbox.isSelected()) {
        	        
        	        show.setText("Password: " + password.getText());
        	    } else {
        	       
        	        show.setText("");
        	    }
        });
   
        show.setFont(Font.font("Arial",15));
        
        logIn = new Button("Log In");
        logIn.setLayoutX(120);
        logIn.setLayoutY(220);
        logIn.setOnAction(e -> logIn());

        back = new Button("Back");
        back.setLayoutX(10);
        back.setLayoutY(10);
        back.setOnAction(e -> 
        client.close());
 
        this.getChildren().addAll(Lusername, Lpassword, username, password, showPasswordCheckbox, logIn, back,show);
        register_client = new HashMap<>();
         
    
}	
	
	

	private void logIn() {
		client2.openStage();
		String Cusername = username.getText();
		String Cpassword = password.getText();
		register_client.put(Cusername, Cpassword);
		
	}

	public void printBorrowed (){
	for ( Books book : client2.getBorrowed_books()) {
		System.out.println(book);
	}
	}

	public Label getShow() {
		return show;
	}

	public void setShow(Label show) {
		this.show = show;
	}

	public HashMap getregister_client(){
		return this.register_client;
	}

	public Stage getManager() {
		return client;
	}

	public void setManager(Stage manager) {
		this.client = manager;
	}

	public Label getLusername() {
		return Lusername;
	}

	public void setLusername(Label lusername) {
		Lusername = lusername;
	}

	public Label getLpassword() {
		return Lpassword;
	}

	public void setLpassword(Label lpassword) {
		Lpassword = lpassword;
	}

	public TextField getUsername() {
		return username;
	}

	public void setUsername(TextField username) {
		this.username = username;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public CheckBox getShowPasswordCheckbox() {
		return showPasswordCheckbox;
	}

	public void setShowPasswordCheckbox(CheckBox showPasswordCheckbox) {
		this.showPasswordCheckbox = showPasswordCheckbox;
	}

	public Button getLogIn() {
		return logIn;
	}

	public void setLogIn(Button logIn) {
		this.logIn = logIn;
	}

	public Button getBack() {
		return back;
	}

	public void setBack(Button back) {
		this.back = back;
	}

	
	public void showStage() {
        Scene scene = new Scene(this, 300, 280);
        client.setScene(scene);
       client.show();
    }


}
