package Controller;

import Model.Book;
import View.DeleteBooks;

public class DeleteBook_Controller {
    private DeleteBooks view = new DeleteBooks();
    private Book book;

    public DeleteBook_Controller(DeleteBooks view){
        view.getDelete().setOnAction(e -> deleteBook());
    }

    private void deleteBook() {
        Book selectedBook = view.getList().getSelectionModel().getSelectedItem();
        if (selectedBook != null) {
            if (selectedBook.getQuantity() > 0) {
                selectedBook.setQuantity(selectedBook.getQuantity() - 1);
                view.updateBookList();
            } else {
                view.getList().getItems().remove(selectedBook);
                Book.getListbook().remove(selectedBook);
            }
        }
    }
}

