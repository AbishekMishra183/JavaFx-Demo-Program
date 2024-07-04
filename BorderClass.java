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
        Button top = new Button("top");
        Button left = new Button("left");
        Button right = new Button("right");
        Button botton = new Button("botton");
        Button center = new Button("center");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(top);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setBottom(botton);
        borderPane.setCenter(center);
        HBox topCont = new HBox();
        topCont.setAlignment(Pos.TOP_CENTER);
        topCont.getChildren().add(top);

        Scene scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.show();


    }
}
