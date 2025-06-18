package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MultiplicationTableApp extends Application {
    public void start(Stage primaryStage) {
        // Create a FlowPane with gaps
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setPadding(new Insets(10));

        // Input field for the number
        TextField numberField = new TextField();
        numberField.setPromptText("Enter a number");

        // Label to show the multiplication table
        Label tableLabel = new Label();

        // When the user enters a number, show the multiplication table
        numberField.setOnAction(e -> {
            try {
                int number = Integer.parseInt(numberField.getText());
                StringBuilder table = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
                }
                tableLabel.setText(table.toString());
            } catch (NumberFormatException ex) {
                tableLabel.setText("Please enter a valid number.");
            }
        });

        flowPane.getChildren().addAll(numberField, tableLabel);

        Scene scene = new Scene(flowPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Multiplication Table");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
