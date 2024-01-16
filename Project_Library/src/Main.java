

import Controller.Admin_View_Controller;
import Files.Files_Book;
import Files.Files_User;
import View.Admin_View;
import View.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
 
    public static void main(String[] args) {
    	Files_User.seedData();
    	Files_Book.seedData();
    	launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        LoginView view = new LoginView(stage);
        Admin_View_Controller adminController = new Admin_View_Controller(new Admin_View());
        adminController.setLoginView(view);

        stage.setScene(view.getScene());
        stage.show();
    }
}
	
