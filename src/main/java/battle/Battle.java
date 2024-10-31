package battle;
import graphics.Select;
import graphics.Ui;
import javafx.scene.layout.Pane;
import time.Loop;
public class Battle{
    public static double money = 0;
    public static Upgrades up = new Upgrades();
    static Pane pane = Ui.pane;
    public static void start()
    {
    pane.getChildren().clear();
    BMenu.UPG();
    Select.selecter();
    Loop.minigame = 1;
    }
    public static void loop()
    {
    System.out.println(up.val);
    }
}
