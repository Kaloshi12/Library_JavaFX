import javafx.scene.paint.Color;
import java.util.HashMap;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Menager_LogIn extends Pane {
	
	private Stage manager ;
	private Label Lusername;
	private Label Lpassword;
	private TextField username;
	private PasswordField password;
	private CheckBox  showPasswordCheckbox;
	private Label show ;
	private Button logIn;
	private Button back;
	private HashMap<String,String> man_logIn;
	private Text succes ;
	
	Menager_LogIn(){
		this.manager = new Stage();
		manager.setTitle("Manager LogIn");
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
        succes = new Text("");
        succes.setLayoutX(120);
        succes.setLayoutY(20);
        show.setFont(Font.font("Arial",15));
        
        logIn = new Button("Log In");
        logIn.setLayoutX(120);
        logIn.setLayoutY(220);
        logIn.setOnAction(e -> check_logIn());

        back = new Button("Back");
        back.setLayoutX(10);
        back.setLayoutY(10);
        back.setOnAction(e -> 
        manager.close());
        man_logIn = new HashMap<>();
        man_logIn.put("Franko", "12345678");
        man_logIn.put("Herion", "12345678");
        man_logIn.put("Enio", "12345678");
        getChildren().addAll(Lusername, Lpassword, username, password, showPasswordCheckbox, logIn, back,show,succes);
    
}	
	
	private void check_logIn() {
	    String user = username.getText();
	    String enteredPassword = password.getText();

	    if (man_logIn.containsKey(user)) {
	        String storedPassword = man_logIn.get(user);
	        if (storedPassword.equals(enteredPassword)) {
	            succes.setFill(Color.GREEN);
	            succes.setText("Successfully!");
	        } else {
	            succes.setFill(Color.RED);
	            succes.setText("Wrong Password!");
	        }
	    } else {
	        succes.setFill(Color.RED);
	        succes.setText("Wrong UserID!");
	    }
	}

	public Label getShow() {
		return show;
	}

	public void setShow(Label show) {
		this.show = show;
	}

	public Text getSucces() {
		return succes;
	}

	public void setSucces(Text succes) {
		this.succes = succes;
	}

	public Stage getManager() {
		return manager;
	}

	public void setManager(Stage manager) {
		this.manager = manager;
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

	public HashMap<String, String> getMan_logIn() {
		return man_logIn;
	}

	public void setMan_logIn(HashMap<String, String> man_logIn) {
		this.man_logIn = man_logIn;
	}

	public void showStage() {
        Scene scene = new Scene(this, 300, 280);
        manager.setScene(scene);
       manager.show();
    }


}




