import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    public void start(Stage primaryStage) {
        // Create input fields for two numbers
        TextField num1Field = new TextField();
        num1Field.setPromptText("Enter first number");
        TextField num2Field = new TextField();
        num2Field.setPromptText("Enter second number");

        // Create a button for computing the results
        Button computeButton = new Button("Compute");

        // Create a Canvas to display results
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Action on clicking Compute button
        computeButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());

                double sum = num1 + num2;
                double product = num1 * num2;
                double difference = num1 - num2;
                double quotient = num1 / num2;

                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillText("Sum: " + sum, 10, 50);
                gc.fillText("Product: " + product, 10, 70);
                gc.fillText("Difference: " + difference, 10, 90);
                gc.fillText("Quotient: " + quotient, 10, 110);
            } catch (NumberFormatException ex) {
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillText("Please enter valid numbers.", 10, 50);
            }
        });

        VBox vbox = new VBox(10, num1Field, num2Field, computeButton, canvas);
        Scene scene = new Scene(vbox, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
