package cos.mos.socket.cosmosfx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Label timeLabel;

    @FXML
    private TextField nameField;

    @FXML
    private Button greetButton;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @FXML
    public void initialize() {
        startClock();
    }

    @FXML
    protected void onHelloButtonClick() {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            welcomeText.setText("Hello, Stranger!");
        } else {
            welcomeText.setText("Welcome, " + name + "!");
        }
    }

    private void startClock() {
        Timeline clock = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timeLabel.setText("Current Time: " + LocalDateTime.now().format(formatter));
        }));
        clock.setCycleCount(Timeline.INDEFINITE);
        clock.play();
    }
}
