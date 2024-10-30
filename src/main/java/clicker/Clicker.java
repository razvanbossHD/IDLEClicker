package clicker;
import graphics.Select;
import graphics.Ui;
import javafx.scene.layout.Pane;
public class Clicker{
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    Select.selecter();
    System.out.println("Clickerul");
    }
}
