package View;

import Controller.Admin_View_Controller;
import Controller.ButtonAdd_Controller;
import javafx.scene.Scene;

public class StageAddBook extends OpenStage {
private AddBook add = new AddBook();
private ButtonAdd_Controller ctrl = new ButtonAdd_Controller(add);

	public AddBook getAdd() {
	return add;
}

public void setAdd(AddBook add) {
	this.add = add;
}

public ButtonAdd_Controller getCtrl() {
	return ctrl;
}

public void setCtrl(ButtonAdd_Controller ctrl) {
	this.ctrl = ctrl;
}

	@Override
	public	void open() {
	Scene scene = new Scene(add,300,300);
	add.getStage().setScene(scene);
	add.getStage().show();
	}

}
