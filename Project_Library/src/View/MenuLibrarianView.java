package View;



import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuLibrarianView extends Pane {
	private Text text;
	private Button showBooks;
	
	private Button showSoldBooks;
	private Button back;
	private Button bill;
	private Stage Lstage;

		 public MenuLibrarianView(){
			Lstage = new Stage();
			Lstage.setTitle("Librarian");
			text = new Text();
			text.setText("Welcome Manager");
			text.setLayoutX(150);
			text.setLayoutY(100);
			text.setFont(Font.font("Arial", FontPosture.ITALIC, 50));
			bill = new Button();
			bill.setText("Bill");
			bill.setLayoutX(20);
			bill.setLayoutY(400);
			bill.setPrefWidth(120);
			bill.setPrefHeight(60);
			bill.setOnMouseEntered(e -> bill.setStyle("-fx-background-color: lightblue;"));
			bill.setOnMouseExited(e -> bill.setStyle(null));
			showBooks = new Button();
	        showBooks.setText("Books");
			showBooks.setLayoutX(160);
			showBooks.setLayoutY(400);
			showBooks.setPrefWidth(120);
			showBooks.setPrefHeight(60);
			showBooks.setOnMouseEntered(e -> showBooks.setStyle("-fx-background-color: lightblue;"));
			showBooks.setOnMouseExited(e -> showBooks.setStyle(null));
			showSoldBooks = new Button();
			showSoldBooks.setText("Sold Books");
			showSoldBooks.setLayoutX(300);
			showSoldBooks.setLayoutY(400);
			showSoldBooks.setPrefWidth(120);
			showSoldBooks.setPrefHeight(60);
			showSoldBooks.setOnMouseEntered(e -> showSoldBooks.setStyle("-fx-background-color: lightblue;"));
			showSoldBooks.setOnMouseExited(e -> showSoldBooks.setStyle(null));

			
			
			getChildren().addAll(text,bill,showBooks,showSoldBooks);
			
		}


	public Text getText() {
			return text;
		}


		public void setText(Text text) {
			this.text = text;
		}


		public Button getShowBooks() {
			return showBooks;
		}


		public void setShowBooks(Button showBooks) {
			this.showBooks = showBooks;
		}


		


		public Button getBill() {
			return bill;
		}


		public void setBill(Button bill) {
			this.bill = bill;
		}


		public Button getShowBorrowedBooks() {
			return showSoldBooks;
		}


		public void setShowBorrowedBooks(Button showSoldBooks) {
			this.showSoldBooks = showSoldBooks;
		}


		public Stage getLstage() {
			return Lstage;
		}


		public void setLstage(Stage lstage) {
			Lstage = lstage;
		}


		

		
		



		public Button getBack() {
			return back;
		}


		public void setBack(Button back) {
			this.back = back;
		}


		

		public Button getShowSoldBooks() {
			return showSoldBooks;
		}


		public void setShowSoldBooks(Button showSoldBooks) {
			this.showSoldBooks = showSoldBooks;
		}

		


}
