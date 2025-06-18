package com.example.javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class HelloWorld extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello cuties");
        Label label = new Label("Hello people\n\n");
        //Button button = new Button("Hello World");
        Button b1= new Button("click here");

        VBox  root = new VBox();  // all the nodes are set in a single horizontal row
        root.getChildren().add(label);
        root.getChildren().add(b1);  //Retrieving the observable list of the Hbox Pane


        Scene  sc = new Scene(root);

        primaryStage.setScene(sc);
        primaryStage.show();


    }
}
