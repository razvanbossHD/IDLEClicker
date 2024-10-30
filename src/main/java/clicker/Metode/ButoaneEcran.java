package clicker.Metode;

import javafx.scene.control.Button;

public class ButoaneEcran {
    private Button[] buttons = new Button[5];
    private int nr=0;
    
    public ButoaneEcran() {
        nr=0;
    }
    public ButoaneEcran(Button buton) {
        nr=0;
        buttons[0] = buton;
        nr=1;
    }
    public ButoaneEcran(Button buton1, Button buton2) {
        nr=0;
        buttons[0] = buton1;
        buttons[1] = buton2;
        nr=2;
    }
    public ButoaneEcran(Button buton1, Button buton2, Button buton3) {
        nr=0;
        buttons[0] = buton1;
        buttons[1] = buton2;
        buttons[2] = buton3;
        nr=3;
    }
    public ButoaneEcran(Button buton1, Button buton2, Button buton3, Button buton4) {
        nr=0;
        buttons[0] = buton1;
        buttons[1] = buton2;
        buttons[2] = buton3;
        buttons[3] = buton4;
        nr=4;
    }
    public ButoaneEcran(Button buton1, Button buton2, Button buton3, Button buton4, Button buton5) {
        nr=0;
        buttons[0] = buton1;
        buttons[1] = buton2;
        buttons[2] = buton3;
        buttons[3] = buton4;
        buttons[3] = buton4;
        nr=5;
    }
    public void addButon(Button buton)
    {
        if(nr<5)
        {   
            buttons[nr] = buton;
            nr++;
        }
        return;
    }
    
    public Button getButton(int index) {
    
        return buttons[index];
    }
    public void setButton(int index, Button buton) {
        buttons[index] = buton;
    }
    public int getNr(){return nr;}
}
