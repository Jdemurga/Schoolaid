package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Main extends Application {
	private Pane mypane;

	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/praticaFx.fxml"));
		mypane = (Pane) loader.load();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		stage.setTitle("PracticaFX");
		stage.setScene(new Scene(mypane));
		stage.setX(screenSize.getWidth() / 3);
		stage.setY(screenSize.getHeight() / 3);
		stage.show();
	}

	public void comenzar(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/imagen.fxml"));
		mypane = (Pane) loader.load();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		stage.setTitle("PracticaFX");
		stage.setScene(new Scene(mypane));
		stage.setX(screenSize.getWidth() / 3);
		stage.setY(screenSize.getHeight() / 3);
		stage.show();
	}

	

	public static void main(String[] args) {
		launch(args);
	}
}
