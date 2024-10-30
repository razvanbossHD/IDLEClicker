package battle;
import graphics.*;
import time.*;
import javafx.scene.layout.Pane;
public class Battle{
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    Select.selecter();
    Loop.m = 1;
    }
    public static void loop()
    {
    }
}
