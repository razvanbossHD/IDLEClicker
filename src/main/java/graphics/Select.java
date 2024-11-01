package graphics;
import battle.Battle;
import clicker.Clicker;
import fishing.Fishing;
import javafx.scene.control.Button;
import save.Write;
public class Select{
    static Button clickler = null;
    static Button roguelike = null;
    static Button fishing = null;

    static void select()
    {
        System.out.println("Merge");
    }


    public static void selecter()
    {
        clickler = Buttons.add(Clicker::start,"Clicker",200,100,600,0);
        roguelike = Buttons.add(Battle::start,"Battle",200,100,800,0);
        fishing = Buttons.add(Fishing::start,"Fishing",200,100,1000,0);
        fishing = Buttons.add(Write::save,"Save",200,100,1200,0);
    }
}
