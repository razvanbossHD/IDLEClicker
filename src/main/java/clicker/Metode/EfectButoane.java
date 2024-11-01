package clicker.Metode;

import battle.Battle;
import clicker.Clicker;
import fishing.Fishing;

public class EfectButoane {
    
    public static void Idle1()
    {
        if(Clicker.bani>=((Clicker.bpsbani+1)*50))
        {   
            Clicker.bps++;
            Clicker.bani-=(Clicker.bpsbani+1)*50;
            Clicker.idle.idlelable[0].setText("Cost:"+(Clicker.bpsbani+1)*50+"Bani");

        }
        
    }
    public static void Idle2()
    {
        if(Battle.money>=((Clicker.bpsmoney+1)*50))
        {   
            Clicker.bps++;
            Battle.money-=(Clicker.bpsmoney+1)*50;
            Clicker.idle.idlelable[1].setText("Cost:"+(Clicker.bpsmoney+1)*50+"Money");
        }
    }
    public static void Idle3()
    {   if(Fishing.score>=((Clicker.bpsscore+1)*50))
        {   Clicker.bps++;
            Fishing.score-=(Clicker.bpsscore+1)*50;
            Clicker.idle.idlelable[2].setText("Cost:"+(Clicker.bpsscore+1)*50+"Scor");
        }
    }
    public static void Upgrade1()
    {
        if(Clicker.numarbutoane<5&&(Clicker.bani>=Clicker.numarbutoane*50))
        {   Clicker.butoane.buttons[Clicker.numarbutoane].setVisible(true);
            Clicker.numarbutoane++;
            Clicker.bani-=Clicker.numarbutoane*50;
            Clicker.idle.buttonslable[0].setText("Cost:"+((int)Clicker.numarbutoane*50)+"Bani");
        }
        
    }
    public static void Upgrade2()
    {   
        if(Battle.money>=(Clicker.cp*50))
        {   Clicker.cp++;
            Battle.money-=Clicker.cp*50;
            Clicker.idle.buttonslable[1].setText("Cost:"+((int)Clicker.cp*50)+"Money");
        }
    }
    public static void Upgrade3()
    {   if(Fishing.score>=(Clicker.bpsmultiplier*50))
        {   Clicker.bpsmultiplier++;
            Fishing.score-=Clicker.cp*50;
            Clicker.idle.buttonslable[2].setText("Cost:"+((int)Clicker.bpsmultiplier*50)+"Score");
        }
    }
    
    public static void click()
    {
        Clicker.butoane.Aleator(0);
    }


}
