package View;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import Model.Author;
import Model.Book;

public class AddBook extends GridPane {

    private TextField isbnField;
    private TextField titleField;
    private TextField authorFirstNameField;
    private TextField authorLastNameField;
    private TextField pagesField;
    private TextField quantityField;
    private TextField descriptionField;
    private Button addBookButton;
    private Stage stage;

    public TextField getIsbnField() {
		return isbnField;
	}

	public void setIsbnField(TextField isbnField) {
		this.isbnField = isbnField;
	}

	public TextField getTitleField() {
		return titleField;
	}

	public void setTitleField(TextField titleField) {
		this.titleField = titleField;
	}

	public TextField getAuthorFirstNameField() {
		return authorFirstNameField;
	}

	public void setAuthorFirstNameField(TextField authorFirstNameField) {
		this.authorFirstNameField = authorFirstNameField;
	}

	public TextField getAuthorLastNameField() {
		return authorLastNameField;
	}

	public void setAuthorLastNameField(TextField authorLastNameField) {
		this.authorLastNameField = authorLastNameField;
	}

	public TextField getPagesField() {
		return pagesField;
	}

	public void setPagesField(TextField pagesField) {
		this.pagesField = pagesField;
	}

	public TextField getQuantityField() {
		return quantityField;
	}

	public void setQuantityField(TextField quantityField) {
		this.quantityField = quantityField;
	}

	public TextField getDescriptionField() {
		return descriptionField;
	}

	public void setDescriptionField(TextField descriptionField) {
		this.descriptionField = descriptionField;
	}

	public Button getAddBookButton() {
		return addBookButton;
	}

	public void setAddBookButton(Button addBookButton) {
		this.addBookButton = addBookButton;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public AddBook() {
        
        setPadding(new Insets(10));
        setHgap(10);
        setVgap(10);

        stage = new Stage();
        stage.setTitle("Add Books");
        
        Label isbnLabel = new Label("ISBN:");
        isbnField = new TextField();

        Label titleLabel = new Label("Title:");
        titleField = new TextField();

        Label authorFirstNameLabel = new Label("Author First Name:");
        authorFirstNameField = new TextField();

        Label authorLastNameLabel = new Label("Author Last Name:");
        authorLastNameField = new TextField();

        Label pagesLabel = new Label("Number of Pages:");
        pagesField = new TextField();

        Label quantityLabel = new Label("Quantity:");
        quantityField = new TextField();

        Label descriptionLabel = new Label("Description:");
        descriptionField = new TextField();

        addBookButton = new Button("Add Book");

        add(isbnLabel, 0, 0);
        add(isbnField, 1, 0);
        add(titleLabel, 0, 1);
        add(titleField, 1, 1);
        add(authorFirstNameLabel, 0, 2);
        add(authorFirstNameField, 1, 2);
        add(authorLastNameLabel, 0, 3);
        add(authorLastNameField, 1, 3);
        add(pagesLabel, 0, 4);
        add(pagesField, 1, 4);
        add(quantityLabel, 0, 5);
        add(quantityField, 1, 5);
        add(descriptionLabel, 0, 6);
        add(descriptionField, 1, 6);
        add(addBookButton, 0, 7, 2, 1);
    }

   
}

