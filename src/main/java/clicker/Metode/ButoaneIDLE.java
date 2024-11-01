package clicker.Metode;

import clicker.Clicker;
import fishing.Fishing;
import graphics.Buttons;
import graphics.Labels;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ButoaneIDLE {
    public Button[] idle = new Button[3];
    public Button[] buttons = new Button[4];
    public Label[] idlelable = new Label[3];
    public Label[] buttonslable = new Label[4];
    public ButoaneIDLE() {
        idle[0] = Buttons.add(EfectButoane::Idle1,"Clicker",350,150,30,200);
        idlelable[0] = Labels.add("Cost:"+(Clicker.bpsbani+1)*50+"Bani",30,200, 20);
        idlelable[0].setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
        idle[1] = Buttons.add(EfectButoane::Idle2,"Clicker",350,150,30,400);
        idlelable[1] = Labels.add("Cost:"+(Clicker.bpsmoney+1)*50+"Bani", 30,400, 20);
        idlelable[1].setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
        idle[2] = Buttons.add(EfectButoane::Idle3,"Clicker",350,150,30,600);
        idlelable[1] = Labels.add("Cost:"+(Clicker.bpsscore+1)*50+"Bani", 30,600, 20);
        idlelable[1].setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
        
        buttons[0]=Buttons.add(EfectButoane::Upgrade1,"Butoane+",350,150,1520, 200);
        idlelable[0] = Labels.add("Cost:"+(Clicker.numarbutoane)*50+"Bani",1520, 200, 20);
        idlelable[0].setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
        buttons[1]=Buttons.add(EfectButoane::Upgrade2,"Bps+",350,150,1520, 400);
        buttonslable[1] = Labels.add("Cost:"+(Clicker.cp)*50+"Bani",1520, 400, 20);
        buttonslable[1].setStyle("-fx-text-fill: red; -fx-font-size: 16px;");
        buttons[2]=Buttons.add(EfectButoane::Upgrade3,"Clickuri+",350,150,1520, 600);
        buttonslable[2] = Labels.add("Cost:"+(Fishing.score-=Clicker.cp)*50+"Bani", 1520, 600, 20);
    }
    
}
