package Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import Files.BillFile;
import Files.FilesSoldBook;
import Files.Files_Book;
import Model.Bill;
import Model.Book;
import View.BillView;
import View.Bill_IdView;
import View.SellBookView;
import javafx.application.Platform;
import javafx.collections.ObservableList;

public class SellBook_Controller {
    private SellBookView view;
    private FilesSoldBook SoldBookfile = new FilesSoldBook();
    private BillFile billFile = new BillFile();
    private Bill_IdView IDFile = new Bill_IdView();
    private Files_Book bookFile = new Files_Book();
    private ObservableList<Book> selectedBooks;

    public SellBook_Controller(SellBookView view) {
    	selectedBooks = view.getList().getSelectionModel().getSelectedItems();
    	this.view = view;

        view.getBuyButton().setOnAction(e -> {
            handleBuyButton(selectedBooks);
            decrementQuantity(selectedBooks);
        });
    }

    private void decrementQuantity(ObservableList<Book> selectedBooks) {

        for (Book selectedBook : selectedBooks) {
           
            	Book newBook = new Book(selectedBook.getiSBN(), selectedBook.getTitle(), selectedBook.getAuthor(),
                        selectedBook.getPages(), selectedBook.getQuantity() - 1, selectedBook.getGenre(),
                        selectedBook.getPrice(), selectedBook.getDescription());
                bookFile.delete(selectedBook);
                bookFile.create(newBook);
             
        bookFile.loadBookFromFile();
    }
        for (Book book : bookFile.getAll()) {
			if(book.getQuantity() == 0) {
				bookFile.delete(book);
			}
		}
    }

	public void handleBuyButton(ObservableList<Book> selectedBook) {
        for (Book book : selectedBooks) {
                SoldBookfile.addSoldBook(book, 1);
        }

        Random random = new Random();
        int Id = 100000 + random.nextInt(900000);

        Bill bill = new Bill(Id, selectedBooks.toArray(new Book[0]), new Date(), calculateTotalPrice(selectedBooks));

        billFile.create(bill);

        Platform.runLater(() -> {
            IDFile.getBillIds().add(bill.getBillID());
        });

        BillView billView = new BillView(bill);
        billView.getStageBill().show();
    }

    private double calculateTotalPrice(ObservableList<Book> books) {
        double totalPrice = 0.0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }
}
