package clicker.Metode;

import javafx.scene.control.Button;

import java.util.LinkedList;

import clicker.Clicker;
import graphics.Buttons;
import clicker.Afisare.*;
import graphics.Ui;
import javafx.scene.control.skin.ButtonSkin;
import javafx.scene.layout.Pane;

public class ButoaneUpgrade {
    private LinkedList<Button> buttons = new LinkedList<Button>();
    public void addButton() {
        buttons.add(Buttons.add(Test::increment,"Clicker"+buttons.size(),250,100,1620, 30+(130*buttons.size())));
        int index=buttons.size()-1;
        buttons.get(index).setOnAction(event->{Sterge(index);});
    }

    public LinkedList<Button> getButtons() {
        return buttons;
    }
    public void Sterge(int index){
        Button but=buttons.get(index);
        Ui.pane.getChildren().remove(but);
        buttons.remove(index);
        int i;
        for(i=index; i<buttons.size()-1; ++i)
        {   
            buttons.get(i).setLayoutY((buttons.get(i).getLayoutY())-130);
        }
        System.out.println(buttons);
    }
    public int marime(){return buttons.size();}
}
