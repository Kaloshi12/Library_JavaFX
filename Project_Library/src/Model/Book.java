package Model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Book {
private String iSBN;
private String title;
private Author author;
private int pages;
private int quantity;
private String description;
private static final ObservableList<Book> listbook = FXCollections.observableArrayList(
        new Book("978-1-234567-890", "Kein and Abel", new Author("Jeffrey", "Archer"), 732, 5, "This book is the shocking story of two men, the son of a Polish immigrant, and the other, the son of a privileged rich man from a family of wealthy Boston bankers. Abel Rosnovski, a poverty-stinging survivor, survives hardship, is persistent, emigrates to the United States and sets up a network of prestigious hotels."),
        new Book("979-3-210987-654", "To Kill a Mockingbird", new Author("Harper", "Lee"), 281, 3, "Set in the American South during the Depression, To Kill a Mockingbird takes the reader to the roots of human behavior. Scout Finch lives with her brother Jem and their father Atticus, a lawyer, in a quiet town. The story deals with racial injustice and the destruction of innocence."),
        new Book("978-9-876543-210", "The Great Gatsby", new Author("F. Scott", "Fitzgerald"), 180, 8, "The Great Gatsby is a classic novel that explores themes of decadence, idealism, and excess. Jay Gatsby, a mysterious millionaire, throws lavish parties to win the love of Daisy Buchanan, a woman who married another man while Gatsby served in World War I.")
);
public Book(String iSBN, String title, Author author, int pages, int quantity, String description) {
	this.iSBN = iSBN;
	this.title = title;
	this.author = author;
	this.pages = pages;
	this.quantity = quantity;
	this.description = description;
}
public static List<Book> getListbook1() {
    return listbook;
}

public String getISBN() {
	return iSBN;
}
public void setISBN(String iSBN) {
	this.iSBN = iSBN;
}
public static ObservableList<Book> getListbook() {
	return listbook;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	title = title;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	description = description;
}



}
