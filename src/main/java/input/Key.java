package input;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
public class Key
{
    public static boolean[] detect = new boolean[256];
    public static void initiate(Scene scene)
    { scene.setOnKeyPressed(Key::press);
    scene.setOnKeyReleased(Key::release);
    }
    public static void press(KeyEvent e)
    {
      detect[e.getCode().getCode()] = true;
    }
    public static void release(KeyEvent e)
    {
      detect[e.getCode().getCode()] = false;
    }

}
