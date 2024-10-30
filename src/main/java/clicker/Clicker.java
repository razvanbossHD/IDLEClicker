package clicker;
import graphics.*;
import javafx.scene.layout.Pane;
public class Clicker{
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    Select.selecter();
    System.out.println("Clicker");
    }
}
