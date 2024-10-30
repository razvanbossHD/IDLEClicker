package clicker;
import clicker.Metode.ButoaneEcran;
import clicker.Metode.Read;
import graphics.Buttons;
import graphics.Ui;
public class Clicker{
    public static ButoaneEcran butoane;

    static void temp()
    {
        butoane.Aleator(0);
    }
    static void init()
    {   int nr=Read.Nrbutoanerandom();
        for (int i = 0; i < nr; i++) {
            ButoaneEcran butoane = new ButoaneEcran(Buttons.add(Clicker::temp,"Clicker",120,100,600,200));
            butoane.Aleator(0);
        }
        
    }
    public static void start()
    {
    Ui.pane.getChildren().clear();
    init();
    }
}
