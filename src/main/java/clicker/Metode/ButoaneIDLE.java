package clicker.Metode;

import clicker.Afisare.Test;
import graphics.Buttons;
import javafx.scene.control.Button;

public class ButoaneIDLE {
    private Button[] buttons = new Button[3];
    public ButoaneIDLE() {
        buttons[0] = Buttons.add(Test::increment,"Clicker",350,150,30,200);
        buttons[1] = Buttons.add(Test::increment,"Clicker",350,150,30,400);
        buttons[2] = Buttons.add(Test::increment,"Clicker",350,150,30,600);
    }
}
