package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
    private static Stage primaryStage;
    private static BorderPane rootLayout;
    private static final int start = 0;    

	@Override
	public void start(Stage primaryStage) {
		
		MainApp.primaryStage = primaryStage;
        MainApp.primaryStage.setTitle("Laringe Play Game");
        initRootLayout();
        changeLayout(start);
        
	}
		
	public static void changeLayout(int layoutId) {
			try {
				FXMLLoader loader = new FXMLLoader();
				switch(layoutId) {
					case 0:
						loader.setLocation(MainApp.class.getResource("../view/PrimaryLayout.fxml"));
						AnchorPane primaryLayout = (AnchorPane) loader.load();
						rootLayout.setCenter(primaryLayout);
						break;
					case 1:
						loader.setLocation(NivelUmController.class.getResource("../view/NivelUm.fxml"));
						AnchorPane nivelUmLayout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelUmLayout);
						break;
					case 2:
						loader.setLocation(NivelDoisController.class.getResource("../view/NivelDois.fxml"));
						AnchorPane nivelDoisLayout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelDoisLayout);
						break;
					case 3:
						loader.setLocation(NivelTresController.class.getResource("../view/NivelTres.fxml"));
						AnchorPane nivelTresLayout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelTresLayout);
						break;
					case 4:
						loader.setLocation(NivelQuatroController.class.getResource("../view/NivelQuatro.fxml"));
						AnchorPane nivelQuatroLayout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelQuatroLayout);
						break;
					case 5:
						loader.setLocation(NivelDoisController.class.getResource("../view/nivelDoisParte2.fxml"));
						AnchorPane nivelDoisParte2Layout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelDoisParte2Layout);
						break;
					case 6:
						loader.setLocation(NivelDoisController.class.getResource("../view/nivelDoisParte3.fxml"));
						AnchorPane nivelDoisParte3Layout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelDoisParte3Layout);
						break;
					case 7:
						loader.setLocation(NivelDoisController.class.getResource("../view/nivelDoisParte4.fxml"));
						AnchorPane nivelDoisParte4Layout = (AnchorPane) loader.load();
						rootLayout.setCenter(nivelDoisParte4Layout);
						break;
						
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    
	}
	
	public static void modifyScene(Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void initRootLayout() {
	        try {
	        	FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("../view/RootLayout.fxml"));
	            rootLayout = (BorderPane) loader.load();
	            Scene scene = new Scene(rootLayout);
	            modifyScene(scene);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	public static void main(String[] args) {
		launch(args);
	}
}
