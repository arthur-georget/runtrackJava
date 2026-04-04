package javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Mon application JavaFX du jour 05");


        Label name = new Label("Nom: ");
        TextField nameInput = new TextField();
        Button sendButton = new Button("Envoyer");
        sendButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println(nameInput.getText());
            }
        });
        FlowPane flowPane = new FlowPane(20.0, 20.0,name,nameInput,sendButton);

        Button exitButton = new Button("Quitter");
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(flowPane);
        borderPane.setBottom(exitButton);

        scene = new Scene(borderPane, 640, 480);
        scene.getStylesheets().add("styles.css");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}