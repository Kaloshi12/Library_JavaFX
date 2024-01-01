import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Library_Client extends BorderPane {
    private Stage stageClient;
    private ListView<Books> list;
    private Button borrow;
    private Button back;
    private ObservableList<Books> borrowed_books;

    public Stage getStageClient() {
		return stageClient;
	}

	public void setStageClient(Stage stageClient) {
		this.stageClient = stageClient;
	}

	public ListView<Books> getList() {
		return list;
	}

	public void setList(ListView<Books> list) {
		this.list = list;
	}

	public Button getBorrow() {
		return borrow;
	}

	public void setBorrow(Button borrow) {
		this.borrow = borrow;
	}

	public Button getBack() {
		return back;
	}

	public void setBack(Button back) {
		this.back = back;
	}

	public ObservableList<Books> getBorrowed_books() {
		return borrowed_books;
	}

	public void setBorrowed_books(ObservableList<Books> borrowed_books) {
		this.borrowed_books = borrowed_books;
	}

	Library_Client() {
        stageClient = new Stage();
        list = new ListView<>(Books.getListbook());
        list.setCellFactory(param -> new ListCell<Books>() {
            @Override
            protected void updateItem(Books book, boolean empty) {
                super.updateItem(book, empty);

                if (empty || book == null) {
                    setText(null);
                } else {
                    
                    setText(String.format("%s by %s - Pages: %d, Quantity: %d",
                            book.getTitle(), book.getAuthor(), book.getPages(), book.getQuantity()));
                }
            }
        });
      HBox box = new HBox();
        borrow = new Button();
       borrow.setOnAction(e->borrowBooks());
        
    }

    private void borrowBooks() {
    	ObservableList<Books> selectedBooks = this.list.getSelectionModel().getSelectedItems();
    	 borrowed_books.addAll(selectedBooks);
		
	}

	public void openStage() {
    	Scene scene = new Scene(list,600,800);
    	
    	stageClient.setScene(scene);
    	stageClient.show();
    }
}

