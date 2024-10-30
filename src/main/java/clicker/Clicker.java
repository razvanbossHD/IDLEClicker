package clicker;
import clicker.Afisare.Test;
import clicker.Metode.ButoaneEcran;
import graphics.Buttons;
import graphics.Ui;
public class Clicker{
    static void init()
    {
        ButoaneEcran butoane = new ButoaneEcran(Buttons.add(Test::increment,"Clicker",120,100,600,200));
        butoane.addButon(Buttons.add(Test::increment,"Clicker",120,100,600,400));
        butoane.addButon(Buttons.add(Test::increment,"Clicker",120,100,1260,780));
    }
    public static void start()
    {
    Ui.pane.getChildren().clear();
    init();

    }
}
