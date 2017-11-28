package view;


import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controlador {
	Main menu = new Main();
	
	
	@FXML
	Button closeButton;

	@FXML
	public void die() {
		System.exit(0);
	}

	@FXML
	public void live() throws IOException {
		Stage thisStage = (Stage) closeButton.getScene().getWindow();
		thisStage.close();
		menu.comenzar(new Stage());
	}

	@FXML
	public void volver() throws IOException {
		Stage thisStage = (Stage) closeButton.getScene().getWindow();
		thisStage.close();
		menu.start(new Stage());
	}
	

}
