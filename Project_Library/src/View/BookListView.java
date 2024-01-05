package View;

import javafx.scene.Scene;

public class BookListView extends OpenStage {
private ShowAllBooks view = new ShowAllBooks();
	@Override
	public void open() {
		Scene scene = new Scene(view,600,700);
		view.getStageBook().setScene(scene);
		view.getStageBook().show();
	}

}
