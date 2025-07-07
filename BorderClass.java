package cos.mos.socket.cosmosfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderClass extends Application {

    @Override
    public void start(Stage stage) {
        Button top = new Button("Top");
        Button left = new Button("Left");
        Button right = new Button("Right");
        Button bottom = new Button("Bottom");
        Button center = new Button("Center");

        // Wrap top button in HBox to center it
        HBox topCont = new HBox();
        topCont.setAlignment(Pos.CENTER);
        topCont.getChildren().add(top);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topCont);     // Use the HBox container
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setBottom(bottom);
        borderPane.setCenter(center);

        Scene scene = new Scene(borderPane, 400, 400);
        stage.setTitle("BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
