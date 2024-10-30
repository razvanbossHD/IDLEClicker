package clicker.Afisare;
import graphics.Ui;

public class Test {
    static int i=0;

    public static void increment() {
        i++;
        System.out.println(Ui.pane.getBoundsInLocal());
    }
}
