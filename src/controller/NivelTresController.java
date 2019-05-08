package controller;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;

public class NivelTresController {
	
	private	static Paint corErro = Paint.valueOf("#FF6347");
	
	@FXML
    private Button nextLevelTwoBtn, voltarBtn;
	
	@FXML
    private TextField epigloteField, cartilagemTireoide, cartilagemArytenoid, cartilagemCricoid, cartilagemConicular;
    
	@FXML
	public void voltar() {
		voltarBtn.setOnAction(event->{
			MainApp.changeLayout(1);
		});
	}
    
	@FXML
	public void nextLevelTwo() {
	   	nextLevelTwoBtn.setOnAction(event->{
	   		if(verificar()) {
	   			MainApp.changeLayout(4);
	   		}
	   	});
	}
	    
	    public boolean verificar() {
	    	boolean next = true;
	    	
	    	if(!(epigloteField.getText().equals("epiglote")||cartilagemArytenoid.getText().equals("Epiglote")||cartilagemArytenoid.getText().equals("Cartilagem Epiglote"))) {
	    		epigloteField.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
	    		next = false; 
	    	}
	    	
	    	if(!(cartilagemArytenoid.getText().equals("cartilagens aritenóides")||cartilagemArytenoid.getText().equals("Cartilagens Aritenóides"))) {
	    		cartilagemArytenoid.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
	    		next = false; 
	    	}
	    	if(!(cartilagemTireoide.getText().equals("cartilagem tireóide")||cartilagemTireoide.getText().equals("Cartilagem Tireoidea"))) {
	    		cartilagemTireoide.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
	    		next = false;
	    	}
	    	
	    	if(!(cartilagemCricoid.getText().equals("cartilagem cricóide")||cartilagemCricoid.getText().equals("cartilagem cricoide"))) {
	    		cartilagemCricoid.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
	    		next = false;
	    	}	    	
	    	if(!(cartilagemConicular.getText().equals("cartilagens corniculadas")||cartilagemConicular.getText().equals("Cartilagens Corniculadas"))) {
	    		cartilagemConicular.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
	    		next = false;
	    	}
	    	return next;
	    }
}
