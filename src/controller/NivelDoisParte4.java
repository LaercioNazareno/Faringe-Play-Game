package controller;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;

public class NivelDoisParte4 {
private	static Paint corErro = Paint.valueOf("#FF6347");
	
	@FXML
	private Button voltarDois,nextLevelTres;
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private TextField respostaField;
		
	@FXML
	public void voltar() {
		voltarDois.setOnAction(event->{
	   		MainApp.changeLayout(1);
	   	});
	}
	
	@FXML
	public void finalizar() {
		nextLevelTres.setOnAction(event->{
	   		if(respostaField.getText().equals("Cartilagem Tireoide")|| respostaField.getText().equals("cartilagem tireoide")) {
	   			MainApp.changeLayout(3);
	   		}else {
	   			respostaField.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
	   		}
	   	});
	}
	
}
