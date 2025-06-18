import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResumeApp extends Application {
    public void start(Stage primaryStage) {
        // Create checkboxes for languages
        CheckBox lang1 = new CheckBox("English");
        CheckBox lang2 = new CheckBox("Spanish");
        CheckBox lang3 = new CheckBox("French");

        // Create a button for submitting the resume
        Button submitButton = new Button("Submit");

        // Create a Canvas to display the resume
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Action on clicking Submit button
        submitButton.setOnAction(e -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            gc.fillText("Resume", 10, 30);
            gc.fillText("Languages known:", 10, 50);

            if (lang1.isSelected()) gc.fillText("English", 10, 70);
            if (lang2.isSelected()) gc.fillText("Spanish", 10, 90);
            if (lang3.isSelected()) gc.fillText("French", 10, 110);
        });

        VBox vbox = new VBox(10, lang1, lang2, lang3, submitButton, canvas);
        Scene scene = new Scene(vbox, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Resume Builder");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
