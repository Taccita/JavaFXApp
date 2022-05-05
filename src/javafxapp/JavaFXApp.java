package javafxapp;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.*;

import javafx.stage.Stage;

public class JavaFXApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GridPane.fxml"));
        Scene scene = new Scene(root);
        

        stage.setTitle("Concurrency in JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
