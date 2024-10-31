package battle;
import graphics.*;
import time.*;
import javafx.scene.layout.Pane;
public class Battle{
    public static double money = 0;
    public static Upgrades up = new Upgrades();
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    BMenu.UPG();
    Select.selecter();
    Loop.m = 1;
    }
    public static void loop()
    {
    System.out.println(up.val);
    }
}
