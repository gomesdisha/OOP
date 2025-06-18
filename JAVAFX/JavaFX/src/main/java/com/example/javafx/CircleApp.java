package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CircleApp extends Application {
    public void start(Stage primaryStage) {
        // Create input field for diameter
        TextField diameterField = new TextField();
        diameterField.setPromptText("Enter diameter");

        // Create a ListView for selecting calculation type
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Area", "Radius", "Circumference");
        listView.setPrefHeight(100);

        // Create a button for calculating
        Button calculateButton = new Button("Calculate");

        // Create a Canvas to display the result
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Action on clicking Calculate button
        calculateButton.setOnAction(e -> {
            try {
                double diameter = Double.parseDouble(diameterField.getText());
                double radius = diameter / 2;
                double area = Math.PI * radius * radius;
                double circumference = 2 * Math.PI * radius;

                String selectedOption = listView.getSelectionModel().getSelectedItem();

                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                if ("Area".equals(selectedOption)) {
                    gc.fillText("Area: " + area, 10, 50);
                } else if ("Radius".equals(selectedOption)) {
                    gc.fillText("Radius: " + radius, 10, 50);
                } else if ("Circumference".equals(selectedOption)) {
                    gc.fillText("Circumference: " + circumference, 10, 50);
                }
            } catch (NumberFormatException ex) {
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillText("Please enter a valid diameter.", 10, 50);
            }
        });

        VBox vbox = new VBox(10, diameterField, listView, calculateButton, canvas);
        Scene scene = new Scene(vbox, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Circle Information");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
