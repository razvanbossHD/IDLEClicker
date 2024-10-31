package battle;
import graphics.Select;
import graphics.Ui;
import javafx.scene.layout.Pane;
import time.Loop;
public class Battle{
    public static double money = 0;
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    Select.selecter();
    Loop.minigame = 1;
    }
    public static void loop()
    {

    }
}
