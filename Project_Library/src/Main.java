
import java.util.Date;
import java.util.HashMap;

import View.LogInLibrarianStage;
import View.LogInManagerStage;
import View.viewAdminLogIn;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
    	viewAdminLogIn logIn_admin = new viewAdminLogIn();
    	LogInManagerStage  logIn_manager = new LogInManagerStage();
    	LogInLibrarianStage logIn_librarian = new LogInLibrarianStage();
        Button manager = new Button("Manager");
        manager.setLayoutX(70);
        manager.setLayoutY(450);
        manager.setMinSize(60, 30);
        manager.setPrefSize(100, 50);
        manager.setOnAction(e -> logIn_manager.open());
        manager.setOnMouseEntered(e -> manager.setStyle("-fx-background-color: lightblue;"));
        manager.setOnMouseExited(e -> manager.setStyle(null));
       

        Button admin = new Button("Admin");
        admin.setLayoutX(200);
        admin.setLayoutY(350);
        admin.setMinSize(60, 30);
        admin.setPrefSize(100, 50);
        admin.setOnAction(e -> logIn_admin.open());
        admin.setOnMouseEntered(e -> admin.setStyle("-fx-background-color: lightblue;"));
        admin.setOnMouseExited(e -> admin.setStyle(null));
        
        Button librarian = new Button("Librarian");
        librarian.setLayoutX(380);
        librarian.setLayoutY(450);
        librarian.setMinSize(60, 30);
        librarian.setPrefSize(100, 50);
        librarian.setOnAction(e -> logIn_librarian.open());
        librarian.setOnMouseEntered(e -> librarian.setStyle("-fx-background-color: lightblue;"));
        librarian.setOnMouseExited(e -> librarian.setStyle(null));
        
        
        
        Text welcome = new Text();
        welcome.setText("Welcome to library");
        welcome.setTextAlignment(TextAlignment.CENTER);
        welcome.setFill(Color.BLACK);
        welcome.setFont(Font.font("Arial", 50));
        welcome.setLayoutX(100);
        welcome.setLayoutY(120);
        Text text = new Text();
        text.setText("You can LogIn as");
        text.setTextAlignment(TextAlignment.CENTER);
        text.setFill(Color.BLACK);
        text.setFont(Font.font("Arial", 50));
        text.setLayoutX(120);
        text.setLayoutY(200);
        
        

        Pane pane = new Pane();
        pane.getChildren().addAll(manager, librarian,admin,welcome,text);
        Scene sceneM = new Scene(pane, 600, 600);

        stage.setScene(sceneM);
        stage.show();
    }
    
}
