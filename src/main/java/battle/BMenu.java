package battle;
import graphics.*;
public class BMenu{
    public static void UPG()
    {
    Buttons.add(Battle.up::VAL,"Value",200,100,50,50);
    Buttons.add(Battle.up::HP,"Difficulty",200,100,50,200);
    Buttons.add(Battle.up::DAM,"Damage",200,100,50,350);
    Buttons.add(Battle.up::SPD,"AtkSpd",200,100,50,500);
    Buttons.add(Battle.up::CHN,"CritChan",200,100,50,650);
    Buttons.add(Battle.up::CHN,"CritDam",200,100,50,800);
    }

}
