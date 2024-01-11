package Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class Book {
private StringProperty iSBN;
private StringProperty title;
private Author author;
private IntegerProperty pages;
private IntegerProperty quantity;
private Genres  genre;
private DoubleProperty price;
private StringProperty description;
private static ObservableMap<Book, Integer> soldBooksMap = FXCollections.observableHashMap();;
private static  ObservableList<Book> listbook = FXCollections.observableArrayList(
        new Book("978-1-234567-890", "Kein and Abel", new Author("Jeffrey", "Archer"), 732, 5,Genres.Biography_Autobiography ,15.0,"This book is the shocking story of two men, the son of a Polish immigrant, and the other, the son of a privileged rich man from a family of wealthy Boston bankers. Abel Rosnovski, a poverty-stinging survivor, survives hardship, is persistent, emigrates to the United States and sets up a network of prestigious hotels."),
        new Book("979-3-210987-654", "To Kill a Mockingbird", new Author("Harper", "Lee"), 281, 3,Genres.Adventure,20.0 ,"Set in the American South during the Depression, To Kill a Mockingbird takes the reader to the roots of human behavior. Scout Finch lives with her brother Jem and their father Atticus, a lawyer, in a quiet town. The story deals with racial injustice and the destruction of innocence."),
        new Book("978-9-876543-210", "The Great Gatsby", new Author("F. Scott", "Fitzgerald"), 180, 8,Genres.History,13.0 ,"The Great Gatsby is a classic novel that explores themes of decadence, idealism, and excess. Jay Gatsby, a mysterious millionaire, throws lavish parties to win the love of Daisy Buchanan, a woman who married another man while Gatsby served in World War I.")
);

static {
	soldBooksMap.put(listbook.get(0), 1);
}

public Book(String iSBN, String title, Author author, int pages, int quantity,Genres genre,Double price ,String description) {
	this.iSBN = new SimpleStringProperty(iSBN);
	this.title = new SimpleStringProperty(title);
	this.author = author;
	this.pages =new SimpleIntegerProperty(pages);
	this.quantity =new SimpleIntegerProperty(quantity) ;
	this.genre = genre;
	this.price = new SimpleDoubleProperty(price);
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
public Double getPrice() {
	return price.get();
}
public void setPrice(Double price) {
	this.price.set(price);;
}

public static ObservableList<Book> getListBook(){
	return listbook;
}

public static void addBook(Book book) {
    listbook.add(book);
}
public static ObservableMap<Book, Integer> getSoldBooksMap(){
	return soldBooksMap;
}

public static void addSoldBook(Book book , int cnt) {
	soldBooksMap.put(book, cnt);
}

}
