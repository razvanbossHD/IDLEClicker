package graphics;
import javafx.scene.control.Button;
public class Select{
    static Button b = null;

    static void select()
    {
        System.out.println("Merge");
    }


    public static void selecter()
    {
    b = Buttons.add(Select::select,"test",200,100,800,0);
    }
}
