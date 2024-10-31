package time;
import javafx.animation.AnimationTimer;
import battle.*;
public class Loop{
    public static AnimationTimer time = null;
    static double fps = 100.0;
    static double frame = 1000000000.0 / fps;
    public static int m = 0;
    public static void loop()
    {
    fps = 0;
         time = new AnimationTimer() {
            @Override
            public void handle(long now) {

            if(now - fps >= frame)
            {
            fps = now;
            switch(m){
            case 1:
            Battle.loop();
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
