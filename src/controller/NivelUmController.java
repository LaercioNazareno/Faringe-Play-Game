package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class NivelUmController {
	
	@FXML
	private CheckBox erradoUm, erradoDois, erradoTres, erradoQuatro, erradoCinco, erradoSeis;
	
	@FXML
	private CheckBox cartigemLaringica, certoUm, epigloteChekBox;
	
	@FXML
	private Button nextLevelBtn, voltarBtn;
	
	@FXML
	public void voltar() {
		voltarBtn.setOnAction(event->{
			MainApp.changeLayout(0);
		});
	}

	@FXML
	public void nextDois() {
		nextLevelBtn.setOnAction(event->{
	   		if(verificar()) {
	   			MainApp.changeLayout(2);
	   		}else {
	   			cartigemLaringica.setSelected(false);
	   			certoUm.setSelected(false);
	   			epigloteChekBox.setSelected(false);
	   			erradoUm.setSelected(false);
	   			erradoDois.setSelected(false);
	   			erradoTres.setSelected(false);
	   			erradoQuatro.setSelected(false);
	   			erradoCinco.setSelected(false);
	   			erradoSeis.setSelected(false);
	   		}
	   	});
	}
	
	private boolean verificar() {
		if(cartigemLaringica.isSelected() && certoUm.isSelected() && epigloteChekBox.isSelected()) {
			if(erradoUm.isSelected() || erradoDois.isSelected() || erradoTres.isSelected() || erradoQuatro.isSelected() || erradoCinco.isSelected() || erradoSeis.isSelected()) {
				return false;
			}
			return true;
		}
		return false;
	}
}


















