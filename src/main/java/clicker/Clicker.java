package clicker;
import clicker.Metode.ButoaneEcran;
import clicker.Metode.ButoaneIDLE;
import graphics.Buttons;
import graphics.Labels;
import graphics.Select;
import graphics.Ui;
import javafx.scene.control.Label;
import time.Loop;
public class Clicker{
    public static ButoaneEcran butoane;
    public static ButoaneIDLE idle;
    public static double bani=0;
    public static Label label;
    public static int frame=0;
    public static double secunda=0;
    static void temp()
    {
        butoane.Aleator(0);
    }
    static void initial()
    {   /*int nr=Read.Nrbutoanerandom();
        for (int i = 0; i < nr; i++) {
            
            butoane.Aleator(0);
        }*/ButoaneEcran butoane = new ButoaneEcran(Buttons.add(Clicker::temp,"Clicker",120,100,1260,200), Buttons.add(Clicker::temp,"Clicker",120,100,600,200));
        idle=new ButoaneIDLE();
        label= Labels.add("Bani:"+bani, 10, 10, 20);
    }
    public static void start()
    {
    Ui.pane.getChildren().clear();
    Select.selecter();
    Loop.minigame=2;
    initial();
    }
    public static void loop() {
        

        if(frame%10==0)
           label.setText("Bani:"+bani);
        if(frame>100)
        {
            frame=0;
        }
        frame++;
    }
}
