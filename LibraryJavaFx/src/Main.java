
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        Menager_LogIn manager_logIn = new Menager_LogIn();
        Client_LogIn client_logIn = new Client_LogIn();
        Button manager = new Button("Manager");
        manager.setLayoutX(70);
        manager.setLayoutY(450);
        manager.setMinSize(60, 30);
        manager.setPrefSize(200, 70);
        manager.setOnAction(e -> manager_logIn.showStage());

        Button client = new Button("Client");
        client.setLayoutX(300);
        client.setLayoutY(450);
        client.setMinSize(60, 30);
        client.setPrefSize(200, 70);
        client.setOnAction(e -> client_logIn.showStage());
        
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
        pane.getChildren().addAll(manager, client,welcome,text);
        Scene sceneM = new Scene(pane, 600, 600);

        stage.setScene(sceneM);
        stage.show();
    }
}
