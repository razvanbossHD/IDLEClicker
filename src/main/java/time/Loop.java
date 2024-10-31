package time;
import battle.Battle;
import clicker.Clicker;
import javafx.animation.AnimationTimer;
public class Loop{
    public static AnimationTimer time = null;
    static double fps = 100.0;
    static double frame = 1000000000.0 / fps;
    public static int minigame = 0;
    public static void loop()
    {
    fps = 0;
         time = new AnimationTimer() {
            @Override
            public void handle(long now) {

            if(now - fps >= frame)
            {
            fps = now;
            switch(minigame){
            case 1:
            Battle.loop();
            break;
            case 2:
            Clicker.loop();
            break;
            default:
            break;
            }
            }
        }
    };
    time.start();
    }
    }
