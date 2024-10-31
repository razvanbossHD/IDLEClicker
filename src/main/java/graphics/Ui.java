package graphics;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import input.*;
import time.*;
public class Ui extends Application{
    public static Pane pane = new Pane();
    @Override
    public void start(Stage stage)
    {
    pane.setPrefSize(1920, 1080);
    pane.setStyle("-fx-background-color: #000000;");
    Scene scene = new Scene(pane, 1920, 1080);
    Select.selecter();
    Loop.loop();
    Key.initiate(scene);
    stage.setScene(scene);
    stage.setTitle("IDLEClicker");
    stage.show();
    }
    public static void begin(String[] args)
    {
    launch(args);
    }
}
