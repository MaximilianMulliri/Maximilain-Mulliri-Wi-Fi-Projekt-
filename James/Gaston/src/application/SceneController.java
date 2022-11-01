package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

	private Stage stage;
	private Scene scene;
	
	
	
	public void switchToStart(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		
	}
	public void switchToArchiveDienstplan(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("ArchivDienstplan.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	public void switchToArchiveFreiUrlaub(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("ArchivFreiUrlaub.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	public void switchToArchiveMitarbeiter(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("ArchivMitarbeiter.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	public void switchToDienstplanNeuBearbeiten(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("DienstplanNeuBearbeiten.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	public void switchToFreiUrlaubNeuBearbeiten(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("FreiUrlaubNeuBearbeiten.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	public void switchToMitarbeiterNeuBearbeiten(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("MitarbeiterNeuBearbeiten.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}

	
	
}
