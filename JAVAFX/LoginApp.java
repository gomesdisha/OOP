import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginApp extends Application {
    public void start(Stage primaryStage) {
        // Create GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Create Labels, TextField, PasswordField and Button
        Label userLabel = new Label("User Name:");
        TextField userNameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button signInButton = new Button("Sign in");
        Label welcomeLabel = new Label();

        // Set action for button click
        signInButton.setOnAction(e -> {
            String userName = userNameField.getText();
            welcomeLabel.setText("Welcome " + userName);
        });

        // Add all nodes to the GridPane
        gridPane.add(userLabel, 0, 0);
        gridPane.add(userNameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(signInButton, 1, 2);
        gridPane.add(welcomeLabel, 1, 3);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
