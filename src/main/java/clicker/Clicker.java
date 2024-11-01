package clicker;
import clicker.Metode.ButoaneEcran;
import clicker.Metode.ButoaneIDLE;
import clicker.Metode.ButoaneUpgrade;
import graphics.Buttons;
import graphics.Ui;
public class Clicker{
    public static ButoaneEcran butoane;
    public static ButoaneUpgrade upgradelist= new ButoaneUpgrade();
    public static ButoaneIDLE idle;
    public static double bani;
    static void temp()
    {
        butoane.Aleator(0);
    }
    static void init()
    {   /*int nr=Read.Nrbutoanerandom();
        for (int i = 0; i < nr; i++) {
            
            butoane.Aleator(0);
        }*/ButoaneEcran butoane = new ButoaneEcran(Buttons.add(Clicker::temp,"Clicker",120,100,1260,200), Buttons.add(Clicker::temp,"Clicker",120,100,600,200));
        idle=new ButoaneIDLE();
<<<<<<< Updated upstream
        for (int i = 0; i < 10; i++) {
            upgradelist.addButton();
        }
        upgradelist.Sterge(2);
        
=======
        label= Labels.add("Bani:"+bani, 10, 10, 20);
>>>>>>> Stashed changes
    }
    public static void start()
    {
    Ui.pane.getChildren().clear();
    init();
    }
}
