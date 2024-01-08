package Controller;

import Model.Author;
import Model.Book;
import Model.Genres;
import View.AddBookView;
import javafx.application.Platform;

public class ButtonAdd_Controller {
    private AddBookView view = new AddBookView();

    public ButtonAdd_Controller(AddBookView view) {
        this.view = view;
        this.view.getAddBookButton().setOnAction(e -> addBook());
    }

    private void addBook() {
        try {
            String isbn = view.getIsbnField().getText();
            String title = view.getTitleField().getText();
            String authorFirstName = view.getAuthorFirstNameField().getText();
            String authorLastName = view.getAuthorLastNameField().getText();
            int pages = Integer.parseInt(view.getPagesField().getText());
            int quantity = Integer.parseInt(view.getQuantityField().getText());
            String description = view.getDescriptionField().getText();

            String selectedGenreText = view.getGenreMenuButton().getText();
            Genres genre = getGenreFromText(selectedGenreText);

            Author author = new Author(authorFirstName, authorLastName);
            Book newBook = new Book(isbn, title, author, pages, quantity, genre, description);
            Book.getListbook().add(newBook);

            Platform.runLater(() -> {
                view.getBookTableView().getItems().setAll(Book.getListbook());
                view.getBookTableView().refresh();
            });

            clearFields();
            System.out.println("Book added: " + newBook);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private Genres getGenreFromText(String genreText) {
        for (Genres genre : Genres.values()) {
            if (genre.toString().replace("_", " ").equals(genreText)) {
                return genre;
            }
        }
        return null;
        

    }

    private void clearFields() {
        view.getIsbnField().clear();
        view.getTitleField().clear();
        view.getAuthorFirstNameField().clear();
        view.getAuthorLastNameField().clear();
        view.getPagesField().clear();
        view.getQuantityField().clear();
        view.getGenreMenuButton().setText("Select Genre");
        view.getDescriptionField().clear();
    }
}
