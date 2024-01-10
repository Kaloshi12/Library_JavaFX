package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Book {
private StringProperty iSBN;
private StringProperty title;
private Author author;
private IntegerProperty pages;
private IntegerProperty quantity;
private Genres  genre;
private StringProperty description;
private static  ObservableList<Book> listbook = FXCollections.observableArrayList(
        new Book("978-1-234567-890", "Kein and Abel", new Author("Jeffrey", "Archer"), 732, 5,Genres.Biography_Autobiography ,"This book is the shocking story of two men, the son of a Polish immigrant, and the other, the son of a privileged rich man from a family of wealthy Boston bankers. Abel Rosnovski, a poverty-stinging survivor, survives hardship, is persistent, emigrates to the United States and sets up a network of prestigious hotels."),
        new Book("979-3-210987-654", "To Kill a Mockingbird", new Author("Harper", "Lee"), 281, 3,Genres.Adventure ,"Set in the American South during the Depression, To Kill a Mockingbird takes the reader to the roots of human behavior. Scout Finch lives with her brother Jem and their father Atticus, a lawyer, in a quiet town. The story deals with racial injustice and the destruction of innocence."),
        new Book("978-9-876543-210", "The Great Gatsby", new Author("F. Scott", "Fitzgerald"), 180, 8,Genres.History ,"The Great Gatsby is a classic novel that explores themes of decadence, idealism, and excess. Jay Gatsby, a mysterious millionaire, throws lavish parties to win the love of Daisy Buchanan, a woman who married another man while Gatsby served in World War I.")
);
public Book(String iSBN, String title, Author author, int pages, int quantity,Genres genre ,String description) {
	this.iSBN = new SimpleStringProperty(iSBN);
	this.title = new SimpleStringProperty(title);
	this.author = author;
	this.pages =new SimpleIntegerProperty(pages);
	this.quantity =new SimpleIntegerProperty(quantity) ;
	this.genre = genre;
	this.description = new SimpleStringProperty(description);
	
}
@Override
public String toString() {
	return "iSBN :" + iSBN +" "+ "title :" + title + " " + " author :" + author + " " +" pages :" + pages + " " + "quantity :"
			+ quantity +" "+ "genre :" + genre+" " + "description" + description ;
}
public String getiSBN() {
	return (String)this.iSBN.get();
}
public void setiSBN(String iSBN) {
	this.iSBN.set(iSBN);;
}
public Genres getGenre() {
	return genre;
}
public void setGenre(Genres genre) {
	this.genre = genre;
}

public String getTitle() {
	return (String)title.get();
}
public void setTitle(String title) {
	this.title.set(title);;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public int getPages() {
	return pages.get();
}
public void setPages(int pages) {
	this.pages.set(pages);;
}
public int getQuantity() {
	return quantity.get();
}
public void setQuantity(int quantity) {
	this.quantity.set(quantity);;
}
public String getDescription() {
	return (String)description.get();
}
public void setDescription(String description) {
	this.description.set(description);;
}
public static ObservableList<Book> getListBook(){
	return listbook;
}

public static void addBook(Book book) {
    listbook.add(book);
}

}
