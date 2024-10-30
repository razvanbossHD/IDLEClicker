package graphics;
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
        clickler = Buttons.add(Select::select,"test",200,100,800,0);
        roguelike = Buttons.add(Select::selectroguelike,"test",200,100,800,0);
        fishing = Buttons.add(Select::select,"test",200,100,800,0);
    }
}
