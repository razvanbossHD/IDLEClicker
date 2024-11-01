package graphics;
import battle.*;
import clicker.*;
import fishing.*;
import javafx.scene.control.Button;
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
    }
}
