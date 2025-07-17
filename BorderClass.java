package cos.mos.socket.cosmosfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderClass extends Application {

    @Override
    public void start(Stage stage) {
        // Create buttons with consistent width
        Button top = createStyledButton("Top");
        Button left = createStyledButton("Left");
        Button right = createStyledButton("Right");
        Button bottom = createStyledButton("Bottom");
        Button center = createStyledButton("Center");

        // Wrap top button in an HBox for centering
        HBox topContainer = new HBox(top);
        topContainer.setAlignment(Pos.CENTER);
        topContainer.setPadding(new Insets(10));

        // Bottom also centered using HBox
        HBox bottomContainer = new HBox(bottom);
        bottomContainer.setAlignment(Pos.CENTER);
        bottomContainer.setPadding(new Insets(10));

        // Create BorderPane and set regions
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topContainer);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setBottom(bottomContainer);
        borderPane.setCenter(center);

        // Add margins to side buttons
        BorderPane.setMargin(left, new Insets(10));
        BorderPane.setMargin(right, new Insets(10));
        BorderPane.setMargin(center, new Insets(10));

        // Scene setup
        Scene scene = new Scene(borderPane, 400, 400);
        stage.setTitle("Enhanced BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    // Helper method to style buttons uniformly
    private Button createStyledButton(String text) {
        Button button = new Button(text);
        button.setPrefWidth(80);
        button.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-weight: bold;");
        return button;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
