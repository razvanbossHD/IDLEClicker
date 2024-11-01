package clicker.Metode;

import graphics.Buttons;
import javafx.scene.control.Button;

public class ButoaneIDLE {
    private Button[] idle = new Button[3];
    private Button[] buttons = new Button[4];
    public ButoaneIDLE() {
        idle[0] = Buttons.add(EfectButoane::Idle1,"Clicker",350,150,30,200);
        idle[1] = Buttons.add(EfectButoane::Idle2,"Clicker",350,150,30,400);
        idle[2] = Buttons.add(EfectButoane::Idle3,"Clicker",350,150,30,600);
        
        buttons[0]=Buttons.add(EfectButoane::Upgrade1,"Multiplicare",250,100,1620, 30+130);
        buttons[1]=Buttons.add(EfectButoane::Upgrade2,"Timp",250,100,1620, 30+260);
        buttons[2]=Buttons.add(EfectButoane::Upgrade3,"Clicker 2",250,100,1620, 30+390);
        buttons[3]=Buttons.add(EfectButoane::Upgrade4,"Butoane++",250,100,1620, 30+520);
    }
}
