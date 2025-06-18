package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollingTextApp extends Application {
    private boolean scrollLeft = true;
    public void start(Stage primaryStage) {
        // Create a Text node for the scrolling message
        Text message = new Text("Scrolling Message");

        // Create radio buttons for choosing the direction
        RadioButton leftToRight = new RadioButton("Left to Right");
        RadioButton rightToLeft = new RadioButton("Right to Left");

        // Group the radio buttons
        ToggleGroup group = new ToggleGroup();
        leftToRight.setToggleGroup(group);
        rightToLeft.setToggleGroup(group);

        // Set default selection
        leftToRight.setSelected(true);

        // Set the scrolling direction based on the selected RadioButton
        leftToRight.setOnAction(e -> scrollLeft = false);
        rightToLeft.setOnAction(e -> scrollLeft = true);

        // Create a thread for scrolling the text
        Thread scrollingThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(200);
                    if (scrollLeft) {
                        message.setX(message.getX() - 5);  // Scroll left
                        if (message.getX() < -200) message.setX(400); // Reset position
                    } else {
                        message.setX(message.getX() + 5);  // Scroll right
                        if (message.getX() > 400) message.setX(-200); // Reset position
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        scrollingThread.setDaemon(true); // Run in background
        scrollingThread.start();

        VBox vbox = new VBox(10, leftToRight, rightToLeft, message);
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scrolling Text App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
