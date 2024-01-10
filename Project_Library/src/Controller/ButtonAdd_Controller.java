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

    public void addBook() {
        
            String isbn = view.getIsbnField().getText();
            System.out.println("1");
            String title = view.getTitleField().getText();
            String authorFirstName = view.getAuthorFirstNameField().getText();
            System.out.println("2");
            String authorLastName = view.getAuthorLastNameField().getText();
            System.out.println("3");
            int pages = Integer.parseInt(view.getPagesField().getText());
            System.out.println("4");
            int quantity = Integer.parseInt(view.getQuantityField().getText());
            System.out.println("5");
            String description = view.getDescriptionField().getText();
            System.out.println("6");
            String selectedGenreText = view.getGenreMenuButton().getText();
            System.out.println("7");
            Genres genre = getGenreFromText(selectedGenreText);
            System.out.println("8");

            Author author = new Author(authorFirstName, authorLastName);
            System.out.println("9");
            Book newBook = new Book(isbn, title, author, pages, quantity, genre, description);
            System.out.println("10");
            Book.addBook(newBook);

           
                view.getBookTableView().setItems(Book.getListBook());
             
       

            clearFields();
        

   
    }

    private Genres getGenreFromText(String genreText) {
        for (Genres genre : Genres.values()) {
            if (genre.toString().replace("_", " ").equals(genreText)) {
                return genre;
            }
        }
        return null;
        

    }

   public void clearFields() {
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
