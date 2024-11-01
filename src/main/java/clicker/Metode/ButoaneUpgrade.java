package clicker.Metode;

import clicker.Afisare.Test;
import clicker.Clicker;
import graphics.Buttons;
import graphics.Ui;
import javafx.scene.control.Button;

public class ButoaneUpgrade {
    private Button[] buttons = new Button[1000];
    private int max=1000;
    private int size=0;
    public void addButton() {
        buttons[size]=Buttons.add(Test::increment,"Clicker"+size,250,100,1620, 30+(130*size), Integer.toString(size));
        buttons[size].setOnAction(event->{Sterge(Integer.parseInt(buttons[size].getId()));});
        size++;
    }

    public Button getButtons(int index) {
        return buttons[index];
    }
    public void Sterge(int index){
        size--;
        int i;
        for(i=index;i<size;i++){
            buttons[i]=buttons[i+1];
        }
        Clicker.label.setText(buttons.toString());
        Ui.pane.getChildren().remove(buttons[0]);
    }
    public int marime(){return size;}
    public Boolean isNotFull(){return size<5;}
    public Boolean isFull(){return size>=5;}
}
