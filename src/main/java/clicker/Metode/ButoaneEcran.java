package clicker.Metode;

import java.util.Random;

import javafx.scene.control.Button;

public class ButoaneEcran {
    public Button[] buttons = new Button[5];
    private int nr=0;
    
    public ButoaneEcran() {
        nr=0;
    }
    public ButoaneEcran(Button buton) {
        nr=0;
        buttons[0] = buton;
        buttons[0].setOnAction(event->{Aleator(0);});
        nr=1;
    }
    public ButoaneEcran(Button buton1, Button buton2) {
        nr=0;
        buttons[0] = buton1;
        buttons[0].setOnAction(event->{Aleator(0);});
        buttons[1] = buton2;
        buttons[1].setOnAction(event->{Aleator(1);});
        nr=2;
    }
    public ButoaneEcran(Button buton1, Button buton2, Button buton3) {
        nr=0;
        buttons[0] = buton1;
        buttons[0].setOnAction(event->{Aleator(0);});
        buttons[1] = buton2;
        buttons[1].setOnAction(event->{Aleator(1);});
        buttons[2] = buton3;
        buttons[2].setOnAction(event->{Aleator(2);});
        nr=3;
    }
    public ButoaneEcran(Button buton1, Button buton2, Button buton3, Button buton4) {
        nr=0;
        buttons[0] = buton1;
        buttons[0].setOnAction(event->{Aleator(0);});
        buttons[1] = buton2;
        buttons[1].setOnAction(event->{Aleator(1);});
        buttons[2] = buton3;
        buttons[2].setOnAction(event->{Aleator(2);});
        buttons[3] = buton4;
        buttons[3].setOnAction(event->{Aleator(3);});
        nr=4;
    }
    public ButoaneEcran(Button buton1, Button buton2, Button buton3, Button buton4, Button buton5) {
        nr=0;
        buttons[0] = buton1;
        buttons[0].setOnAction(event->{Aleator(0);});
        buttons[1] = buton2;
        buttons[1].setOnAction(event->{Aleator(1);});
        buttons[2] = buton3;
        buttons[2].setOnAction(event->{Aleator(2);});
        buttons[3] = buton4;
        buttons[3].setOnAction(event->{Aleator(3);});
        buttons[4] = buton5;
        buttons[4].setOnAction(event->{Aleator(4);});
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

    public void Aleator(int index) {
        
        Random rand = new Random();

        buttons[index].setLayoutX(rand.nextInt(600, 1260));
        buttons[index].setLayoutY(rand.nextInt(200, 780));
        System.out.println("da");
    }

}
