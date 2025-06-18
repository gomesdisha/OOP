import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class WelcomeApp extends Application {
    public void start(Stage primaryStage) {
        // Create a label with the welcome message
        Label welcomeLabel = new Label("Welcome to JavaFX programming");
        
        // Create a FlowPane layout with horizontal and vertical gaps
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // Horizontal gap
        flowPane.setVgap(10); // Vertical gap

        // Add the label to the layout
        flowPane.getChildren().add(welcomeLabel);

        // Set the scene with size 500x200
        Scene scene = new Scene(flowPane, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
