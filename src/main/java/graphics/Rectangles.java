package graphics;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;

public class Rectangles
{
    static Pane pane = Ui.pane;
public static Rectangle rect(double x,double y, double w, double h)
    { Rectangle r = new Rectangle(x,y,w,h);
    r.setFill(Color.web("#ffffff"));
    pane.getChildren().add(r);
    return r;
    }
}
