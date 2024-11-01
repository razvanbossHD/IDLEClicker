package battle;
import graphics.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
public class BMenu{
    static Label L = null;
    static Label[] T = new Label[6];
    static Rectangle front;
    public static void UPG()
    {
    Buttons.add(Battle.up::VAL,"Value",200,100,50,50);
    Buttons.add(Battle.up::HP,"Difficulty",200,100,50,200);
    Buttons.add(Battle.up::DAM,"Damage",200,100,50,350);
    Buttons.add(Battle.up::SPD,"AtkSpd",200,100,50,500);
    Buttons.add(Battle.up::CHN,"CritChan",200,100,50,650);
    Buttons.add(Battle.up::CRI,"CritDam",200,100,50,800);
    }
    public static void HP()
    {
    Ui.pane.getChildren().remove(L);
    L = Labels.add(""+Fight.hp,800,300,64);
    double perc = Fight.hp/Battle.up.upHp();
    Ui.pane.getChildren().remove(front);
    front = Rectangles.rect(600,500,perc * 500,100);
    front.setFill(Color.web("#ff0000"));
    }
    public static void cost()
    {
    for(int i = 0;i<6; ++i)
    Ui.pane.getChildren().remove(T[i]);
    T[0] = Labels.add(""+Upgrades.upd(Battle.up.val),50,150,32);
    T[1] = Labels.add(""+Upgrades.upd(Battle.up.hp),50,300,32);
    T[2] = Labels.add(""+Upgrades.upd(Battle.up.dam),50,450,32);
    T[3] = Labels.add(""+Upgrades.upd(Battle.up.spd),50,600,32);
    T[4] = Labels.add(""+Upgrades.upd(Battle.up.chn),50,750,32);
    T[5] = Labels.add(""+Upgrades.upd(Battle.up.cri),50,900,32);
    }
}
