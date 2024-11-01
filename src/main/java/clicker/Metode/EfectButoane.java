package clicker.Metode;

import battle.Battle;
import clicker.Clicker;
import fishing.Fishing;

public class EfectButoane {
    
    public static void Idle1()
    {
        Clicker.bps++;
    }
    public static void Idle2()
    {
        Clicker.bps++;
    }
    public static void Idle3()
    {
        Clicker.bps++;
    }
    public static void Upgrade1()
    {
        if(Clicker.numarbutoane<5&&(Clicker.bani>=Clicker.numarbutoane*50))
        {   Clicker.butoane.buttons[Clicker.numarbutoane].setVisible(true);
            Clicker.numarbutoane++;
            Clicker.bani-=Clicker.numarbutoane*50;
        }
        
    }
    public static void Upgrade2()
    {   
        if(Battle.money>=(Clicker.cp*50))
        {   Clicker.cp++;
            Battle.money-=Clicker.cp*50;
        }
    }
    public static void Upgrade3()
    {   if(Fishing.score>=(Clicker.bpsmultiplier*50))
        {   Clicker.bpsmultiplier++;
            Battle.money-=Clicker.cp*50;
        }
    }
    
    public static void click()
    {
        Clicker.butoane.Aleator(0);
    }


}
