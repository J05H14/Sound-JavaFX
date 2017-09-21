package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Button button = new Button("Totally School Aproperate Button");
			Button newBtn = new Button("For Real This Time");
			
			VBox buttons = new VBox(button);
			
			buttons.setAlignment(Pos.CENTER);
			
			button.setOnAction(e -> {
				String musicFileName = "media/fart.mp3"; 
			    Media sound = new Media(new File(musicFileName).toURI().toString());
			    MediaPlayer mediaPlayer = new MediaPlayer(sound);
			    button.setText("OOPS");
			    mediaPlayer.play();
			    
			    buttons.getChildren().add(newBtn);
			});
			
			
		    newBtn.setOnAction(e -> {
		    	String musicFileName = "media/fart.mp3"; 
			    Media sound = new Media(new File(musicFileName).toURI().toString());
			    MediaPlayer mediaPlayer = new MediaPlayer(sound);
			    button.setText("OOPS");
			    mediaPlayer.play();
			    
			    Label ha = new Label("HA HA!");
			    buttons.getChildren().add(ha);
		    });
			
			root.setCenter(buttons);
			
			primaryStage.setTitle("Sound Button");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
