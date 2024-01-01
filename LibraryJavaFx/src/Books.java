import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Books {
private String title ;
private String author;
private int pages;
private int quantity;
private String description;
private boolean disponible;
private static final ObservableList<Books> listbook = FXCollections.observableArrayList(
		new Books("Kein and Abel","Jeffrey Archer",732,5,"This book is the shocking story of two men, the son of a polish immigrant, and the other, the son of a privileged rich man from a family of wealthy Boston bankers. Abel Rosnovski, a poverty-stinging survivor, survives hardship, is persistent, emigrates to the United States and sets up a network of prestigious hotels."),
		new Books("The Da Vinci Code","Dan Brown",454,10,"The Da Vinci Code is a 2003 mystery thriller novel by Dan Brown. It is Brown's second novel to include the character Robert Langdon: the first was his 2000 novel Angels & Demons. The Da Vinci Code follows symbologist Robert Langdon and cryptologist Sophie Neveu after a murder in the Louvre Museum in Paris causes them to become involved in a battle between the Priory of Sion and Opus Dei over the possibility of Jesus Christ and Mary Magdalene having had a child together.\r\n"
				+ "\r\n"
				+ "The novel explores an alternative religious history, whose central plot point is that the Merovingian kings of France were descended from the bloodline of Jesus Christ and Mary Magdalene, ideas derived from Clive Prince's The Templar Revelation (1997) and books by Margaret Starbird. The book also refers to The Holy Blood and the Holy Grail (1982), though Dan Brown has stated that it was not used as research material."),
		new Books("The Lost Symbol","	Dan Brown",671,8,"In this stunning follow-up to the global phenomenon The Da Vinci Code, Dan Brown demonstrates once again why he is the world’s most popular thriller writer. The Lost Symbol is a masterstroke of storytelling–a deadly race through a real-world labyrinth of codes, secrets, and unseen truths… all under the watchful eye of Brown’s most terrifying villain to date. Set within the hidden chambers, tunnels, and temples of Washington, D.C., The Lost Symbol accelerates through a startling landscape toward an unthinkable finale.")
		);


	Books(String title,String author,int pages,int quantity,String description){		
	this.title = title;
	this.author = author;
	this.pages = pages;
	this.quantity = quantity;
	this.description = description;
	this.disponible = true;
	}

	public static ObservableList<Books> getListbook() {
		return listbook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
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
		this.description = description;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", quantity=" + quantity
				+ ", description=" + description + ", disponible=" + disponible + "]";
	}
	
	
}
