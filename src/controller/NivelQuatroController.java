package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class NivelQuatroController{
	
	private List<String> epiglote = new ArrayList<>();
	private List<String> cartilagemArytenoid = new ArrayList<>();
	private List<String> cartilagemTireoide = new ArrayList<>();
	private List<String> cartilagemCricoid = new ArrayList<>();
	private List<String> cartilagemConicular = new ArrayList<>();
	
	private List<Integer> respostas = new ArrayList<>();
	
	private	static Paint corErro = Paint.valueOf("#FF6347");
	
	@FXML
	private Text campoUm, campoDois, campoTres, campoQuatro, campoCinco, 
				 campoSeis, campoSete, campoOito, campoNove, campoDez;
	
	@FXML
	private TextField textFieldUm, textFieldDois, textFieldTres, textFieldQuatro, textFieldCinco, textFieldSeis,
					  textFieldSete, textFieldOito, textFieldNove, textFieldDez;
	
	@FXML 
	private Button lastBtn,voltarBtn;
		
	@FXML
	public void initialize() {
		setList();
		setCampos();
	}
	
	@FXML
	public void finalizar() {
		lastBtn.setOnAction(event->{
	   		if(verificar()) {
	   			MainApp.changeLayout(0);
	   		}
	   	});
	}
	
	@FXML
	public void voltar() {
		voltarBtn.setOnAction(event->{
			MainApp.changeLayout(3);
		});
	}
	
	private void setCampos() {
		
		Random rand = new Random();
		int resposta = (rand.nextInt(4))+1;
		
		for(int i = 0 ; i < 10; i++) {
			resposta = (rand.nextInt(4)+1);
			escolher(i,escolherResposta(resposta));	
			respostas.add(resposta);
		}		
	}
	
	private boolean verificar() {
		
		boolean next = true;
		
		if(!(textFieldUm.getText().equals(respostas.get(0).toString()))) {
			textFieldUm.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false; 
		}
		
		if(!(textFieldDois.getText().equals(respostas.get(1).toString()))) {
			textFieldDois.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldTres.getText().equals(respostas.get(2).toString()))) {
			textFieldTres.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldQuatro.getText().equals(respostas.get(3).toString()))) {
			textFieldQuatro.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldCinco.getText().equals(respostas.get(4).toString()))) {
			textFieldCinco.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldSeis.getText().equals(respostas.get(5).toString()))) {
			textFieldSeis.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldSete.getText().equals(respostas.get(6).toString()))) {
			textFieldSete.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldOito.getText().equals(respostas.get(7).toString()))) {
			textFieldOito.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldNove.getText().equals(respostas.get(8).toString()))) {
			textFieldNove.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		if(!(textFieldDez.getText().equals(respostas.get(9).toString()))) {
			textFieldDez.setBackground(new Background(new BackgroundFill(corErro, CornerRadii.EMPTY, Insets.EMPTY)));
			next = false;
		}
		
		return next;
	}
		
	private String escolherResposta(int campo) {
		
		Random rand = new Random();
		int caracteristica;
		String resposta = "Erro ao carregar";
		switch(campo){
			case 1:
				caracteristica = rand.nextInt(epiglote.size());
				resposta = epiglote.get(caracteristica).toString();
				epiglote.remove(caracteristica);
				break;
			case 2:
				caracteristica = rand.nextInt(cartilagemArytenoid.size());
				resposta = cartilagemArytenoid.get(caracteristica).toString();
				cartilagemArytenoid.remove(caracteristica);
				break;
			case 3:
				caracteristica = rand.nextInt(cartilagemTireoide.size());
				resposta = cartilagemTireoide.get(caracteristica).toString();
				cartilagemTireoide.remove(caracteristica);
				break;
			case 4:
				caracteristica = rand.nextInt(cartilagemCricoid.size());
				resposta = cartilagemCricoid.get(caracteristica).toString();
				cartilagemCricoid.remove(caracteristica);
				break;
			case 5:
				caracteristica = rand.nextInt(cartilagemConicular.size());
				resposta = cartilagemConicular.get(caracteristica).toString();
				cartilagemConicular.remove(caracteristica);
				break;
		}
		
		return resposta;
	}
	

	
	private void escolher(int escolha, String resposta) {
		switch (escolha){
			case 0:
				campoUm.setText("Fixa-se através de um ligamento na superfície mesial da cartilagem tireóide, chamado de pecíolo");
				break;
			case 1:
				campoDois.setText("É a maior cartilagem da laringe");
				break;
			case 2:
				campoTres.setText("Podem ser vistas como duas pequenas elevações esbranquiçadas");
				break;
			case 3:
				campoQuatro.setText("Possuem for geométrica piramidal com um ápice, três fases verticais e uma horizontal");
				break;
			case 4:
				campoCinco.setText("Tem formato circular de anel completo ");
				break;
			case 5:
				campoSeis.setText("Faz conexão com as cartilagens aritenóideas na região póstero-superior");
				break;
			case 6:
				campoSete.setText("Possui formato de um escudo");
				break;
			case 7:
				campoOito.setText("São consideradas a unidade funcional da laringe");
				break;
			case 8:
				campoNove.setText("Fixa-se através de um ligamento na superfície mesial da cartilagem tireóide, chamado de pecíolo ");
				break;
			case 9:
				campoDez.setText("Age na aproximação e afastamento das pregas vocais");
				break;
		}
	}
	
	private void setList() {
		
		epiglote.add("É uma cartilagem única em formato de folha ");
		epiglote.add("Fixa-se através de um ligamento na superfície mesial da cartilagem tireóide, chamado de pecíolo ");
		epiglote.add("Conecta às cartilagens aritenóideas através das pregas ariepiglóticas ");
		epiglote.add("Sua função é proteger as vias aéreas inferiores, através do abaixamento e fechamento do ádito da laringe");
		
		cartilagemArytenoid.add("São um par de pequenas cartilagens móveis");
		cartilagemArytenoid.add("São consideradas a unidade funcional da laringe");
		cartilagemArytenoid.add("Possuem for geométrica piramidal com um ápice, três fases verticais e uma horizontal");
		cartilagemArytenoid.add("Possui processo vocal e processo muscular");
		cartilagemArytenoid.add("Age na aproximação e afastamento das pregas vocais");
		cartilagemArytenoid.add("Seu processo muscular fixa músculos como cricoaritenóideo posterior e cricoaritenóideo lateral");
		
		cartilagemTireoide.add("É a maior cartilagem da laringe");
		cartilagemTireoide.add("Possui formato de um escudo");
		cartilagemTireoide.add("Composta por duas lâminas laterais (de forma quadrangular) e dois pares de cornos posteriores");
		cartilagemTireoide.add("A junção de suas duas lâminas chama-se incisura tireóidea ");
		cartilagemTireoide.add("Os músculos tíreo-hióideo, esterno-hióideo e constritor inferior da faringe se inserem em sua linha oblíqua");
		cartilagemTireoide.add("Possui proeminência laríngea que varia de acordo com o sexo");
		cartilagemTireoide.add("Possui cornos posteriores e cornos inferiores");
		cartilagemTireoide.add("Seus cornos posteriores conectam-se ao osso hióide");
		
		cartilagemCricoid.add("É uma cartilagem única e é a segunda maior da laringe ");
		cartilagemCricoid.add("Tem formato circular de anel completo ");
		cartilagemCricoid.add("Possui uma região anterior mais estreita, o arco, e uma região posterior mais larga e elevada, a lâmina.");
		cartilagemCricoid.add("Tem formato ovóide nos homens e circular nas mulheres ");
		cartilagemCricoid.add("Articula com a cartilagem tireóide através dos cornos inferiores desta última");
		cartilagemCricoid.add("Faz conexão com as cartilagens aritenóideas na região póstero-superior");
		
		cartilagemConicular.add("Antes chamadas de cartilagens de Wrisberg");
		cartilagemConicular.add("Têm forma de haste");
		cartilagemConicular.add("Estão mergulhadas nas pregas ariepiglóticas");
		cartilagemConicular.add("Podem ser vistas como duas pequenas elevações esbranquiçadas");
		cartilagemConicular.add("localizadas em frente às cartilagens aritenóideas");
				
	}	
}