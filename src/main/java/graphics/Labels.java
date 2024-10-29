package graphics;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
public class Labels{
    static Pane pane = Ui.pane;
    static Label label = null;
public static Label add(String text, double x, double y,int s)
    {
    label = new Label();
    label.setText(text);
    label.setTextFill(Color.web("#ffffff"));
    label.setFont(new Font("Hack",s));
    label.setLayoutX(x);
    label.setLayoutY(y);
    pane.getChildren().add(label);
    return label;
    }
}
