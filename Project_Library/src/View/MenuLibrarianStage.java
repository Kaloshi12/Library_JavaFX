package View;

import javafx.scene.Scene;

public class MenuLibrarianStage extends OpenStage{
private MenuLibrarianView view = new MenuLibrarianView();
	@Override
	public void open() {
		Scene scene = new Scene(view,500,600);
		view.getLstage().setScene(scene);
		view.getLstage().show();
		
	}

}
