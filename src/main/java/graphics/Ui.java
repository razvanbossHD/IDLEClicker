package graphics;
import input.Key;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class Ui extends Application{
    public static Pane pane = new Pane();
    @Override
    public void start(Stage stage)
    {
    pane.setPrefSize(1920, 1080);
    pane.setStyle("-fx-background-color: #000000;");
    Scene scene = new Scene(pane, 1920, 1080);
    Select.selecter();
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
