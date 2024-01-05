package Controller;

import View.Admin_View;
import View.BookListView;

public class Admin_View_Controller {
	private Admin_View view = new Admin_View();
	private BookListView stage = new BookListView();

	public Admin_View_Controller(Admin_View view) {
		
		view.getShowBooks().setOnAction(e -> stage.open());
	}

	public Admin_View getView() {
		return view;
	}

	public void setView(Admin_View view) {
		this.view = view;
	}
	
}
