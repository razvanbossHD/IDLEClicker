package battle;
import graphics.*;
import javafx.scene.layout.Pane;
public class Battle{
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    Select.selecter();
    System.out.println("Battle");
    }
}
