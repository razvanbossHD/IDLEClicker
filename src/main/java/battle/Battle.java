package battle;
import graphics.Labels;
import graphics.Select;
import graphics.Ui;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import time.Loop;
public class Battle{
    public static double money = 0;
    static Label L = null;
    public static Upgrades up = new Upgrades();
    static Pane pane = Ui.pane;
    static double cd = 0;
    public static void start()
    {
    pane.getChildren().clear();
    BMenu.UPG();
    Select.selecter();
    Loop.minigame = 1;
    }
    public static void loop()
    {
    BMenu.cost();
    pane.getChildren().remove(L);
    L = Labels.add("Money: "+(int)money,50,10,32);
    cd++;
    if(cd >= 100/up.upSpd())
    {
    cd = 0;
    Fight.damage();
    if(Fight.hp <= 0)
    {money = money + up.upVal();
    Fight.hp = up.upHp();
    System.out.println(Fight.hp);
    }
    }
    }
}
