package clicker;
import static java.lang.Math.floor;

import clicker.Metode.ButoaneEcran;
import clicker.Metode.ButoaneIDLE;
import clicker.Metode.EfectButoane;
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
    public static double bps=0;
    public static double bpsmultiplier=1;
    public static double cp=1;
    public static int numarbutoane=1;
    static void initial()
    {   
        butoane = new ButoaneEcran(Buttons.add(EfectButoane::click,"Clicker",120,100,1260,200), Buttons.add(EfectButoane::click,"Clicker",120,100,1260,200), Buttons.add(EfectButoane::click,"Clicker",120,100,1260,200), Buttons.add(EfectButoane::click,"Clicker",120,100,1260,200), Buttons.add(EfectButoane::click,"Clicker",120,100,1260,200));
        for(int i=numarbutoane;i<5;++i)
            butoane.buttons[i].setVisible(false);
        idle=new ButoaneIDLE();
        label= Labels.add("Bani:"+((int)(floor(bani))), 10, 10, 20);
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
           label.setText("Bani:"+((int)(floor(bani))));
        if(frame==100)
           bani+=bps*bpsmultiplier;
        if(frame>100)
        {
            frame=0;
        }
        frame++;
    }
}
