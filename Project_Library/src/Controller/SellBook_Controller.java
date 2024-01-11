package Controller;

import Model.Book;
import View.SellBookView;
import javafx.collections.ObservableList;

public class SellBook_Controller {
private SellBookView view = new SellBookView();

public SellBook_Controller(SellBookView view) {
	this.view = view;
	view.getBuyButton().setOnAction(e ->handleBuyButton() );
}
public void handleBuyButton() {
    ObservableList<Book> selectedBooks = view.getList().getSelectionModel().getSelectedItems();
    for (Book book : selectedBooks) {
		if(Book.getSoldBooksMap().containsKey(book)) {
			Book.addSoldBook(book, Book.getSoldBooksMap().get(book) + 1);
		}else {
			Book.addSoldBook(book, 1);
		}
	}
}

}
