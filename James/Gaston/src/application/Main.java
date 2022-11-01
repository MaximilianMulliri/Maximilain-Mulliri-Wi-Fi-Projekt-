package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;



public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		SqlClass.getSqlClass();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setWidth(1200);
			stage.setHeight(800);
			stage.setTitle("GASTRO ASSISTENT");
			stage.getIcons().add(new Image(Main.class.getResourceAsStream("Goku kid.png")));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
			
		launch(args);

		
	}
	

}
