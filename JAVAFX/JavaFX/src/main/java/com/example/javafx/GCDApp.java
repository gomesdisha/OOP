package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GCDApp extends Application {
    public void start(Stage primaryStage) {
        // Create text fields and a label to show result
        TextField num1Field = new TextField();
        num1Field.setPromptText("Enter first number");
        TextField num2Field = new TextField();
        num2Field.setPromptText("Enter second number");
        Label resultLabel = new Label();
        Button calculateButton = new Button("Calculate GCD");

        // Calculate the GCD when button is clicked
        calculateButton.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int gcd = findGCD(num1, num2);
                resultLabel.setText("GCD of " + num1 + " and " + num2 + " is " + gcd);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        // Add elements to layout
        VBox vbox = new VBox(10, num1Field, num2Field, calculateButton, resultLabel);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("GCD Calculator");
        primaryStage.show();
    }

    // Helper method to find GCD
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
