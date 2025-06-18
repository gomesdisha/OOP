package com.example.javafx;
import javafx.application.Application;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
//import javafx.scene.shape.Circle;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WelcomeApp extends Application {
    public void start(Stage primaryStage) {
        // Create a label with the welcome message

        Label welcomeLabel = new Label("Welcome to JavaFX programming");
        primaryStage.setTitle("JavaFX Welcome");
        // Create a FlowPane layout with horizontal and vertical gaps
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // Horizontal gap
        flowPane.setVgap(10); // Vertical gap

        //Group grp= new Group();
       // Label l1= new Label("Welcome");
        //Circle circle = new Circle();
        // Add the label to the layout
        ToggleGroup group = new ToggleGroup();
        RadioButton rb= new RadioButton("A");
        RadioButton rb2= new RadioButton("B");
        rb.setToggleGroup(group);
        rb2.setToggleGroup(group);
        VBox vbox = new VBox();
        flowPane.getChildren().addAll(welcomeLabel,rb,rb2);
        //VBox.getChildren().addAll(rb,rb2);
        // Set the scene with size 500x200
        Scene scene = new Scene(flowPane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.show();
    }

    //public static void main(String[] args) {
      //  launch(args);
   // }
}

