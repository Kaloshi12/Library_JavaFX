package Controller;

import Model.Author;
import Model.Book;
import View.AddBook;

public class ButtonAdd_Controller {
private AddBook view = new AddBook();

public ButtonAdd_Controller(AddBook view) {
	
	this.view.getAddBookButton().setOnAction(e -> addBook());
}
private void addBook() {
    String isbn = view.getIsbnField().getText();
    String title = view.getTitleField().getText();
    String authorFirstName = view.getAuthorFirstNameField().getText();
    String authorLastName = view.getAuthorLastNameField().getText();
    int pages = Integer.parseInt(view.getPagesField().getText());
    int quantity = Integer.parseInt(view.getQuantityField().getText());
    String description = view.getDescriptionField().getText();

    Author author = new Author(authorFirstName, authorLastName);
    Book newBook = new Book(isbn, title, author, pages, quantity, description);

    Book.getListbook().add(newBook);

    clearFields();
}

private void clearFields() {
    view.getIsbnField().clear();
    view.getTitleField().clear();
    view.getAuthorFirstNameField().clear();
    view.getAuthorLastNameField().clear();
    view.getPagesField().clear();
    view.getQuantityField().clear();
    view.getDescriptionField().clear();
}

}
