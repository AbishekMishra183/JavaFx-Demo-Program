package cos.mos.socket.cosmosfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn = new Button("yo");
        btn.setMaxHeight(300);
        btn.setMaxWidth(500);
        Button btn1 = new Button("yoyo");
        btn1.setMaxHeight(300);
        btn1.setMaxWidth(500);
        Button btn2 = new Button("yo");
        btn2.setMaxHeight(300);
        btn2.setMaxWidth(500);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am your button");
            }
        });

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btn, btn1, btn2);
        Scene scene = new Scene(hBox, 320, 240);


        stage.setScene(scene);
        stage.setTitle("test javafx");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}