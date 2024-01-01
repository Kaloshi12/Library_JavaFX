import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class LibraryView extends BorderPane {
private ListView<Books> listView;
private Text text;
private Button showBooks;
private Button addBooks;
private Button showBorrowedBooks;

	LibraryView(){
		listView = new ListView<>(Books.getListbook());
		
		
	}
}
