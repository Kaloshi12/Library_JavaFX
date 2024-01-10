package Controller;

import Model.Book;
import View.DeleteBooks;
import javafx.collections.ObservableList;

public class DeleteBook_Controller {
    private DeleteBooks view = new DeleteBooks();
    private Book book;

    public DeleteBook_Controller(DeleteBooks view){
        view.getDelete().setOnAction(e -> deleteBook());
    }

    private void deleteBook() {
    	 ObservableList<Book> selectedBook= (ObservableList<Book>) view.getList().getSelectionModel().getSelectedItem();
        for (Book book : selectedBook) {
        	if(book.getQuantity()>0) {
        		book.setQuantity(book.getQuantity()-1);
        	}else {
        		Book.getListBook().removeAll(book);
        	}
		}
    
    }
}

