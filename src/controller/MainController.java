package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button playBtn;
   
    @FXML
	public void onClickIniciar() {
		playBtn.setOnAction(event->{	
			MainApp.changeLayout(1);
		});
	}
}
