package battle;
import java.util.Random;

import clicker.Clicker;
import graphics.Labels;
import graphics.Ui;
import fishing.*;
import clicker.*;
import javafx.scene.control.Label;
public class Upgrades
{
    Label L = new Label();
    public double val = 1;
    public double hp = 1;
    public double dam = 1;
    public double spd = 1;
    public double chn = 1;
    public double cri = 1;
    public double upVal()
    {
    double Val = (val * hp) * ((hp + 100)/100);
    return Val;
    }
    public double upHp()
    {
    double Hp = (hp * 10) * (((5*hp)+100)/100);
    return Hp;
    }
    public  double upDam()
    {
    double Dam = 0;
    Random R = new Random();
    boolean t = false;
    if (R.nextInt(100)<chn)
    t = true;
    if (t)
    Dam = (dam * 2) * (((cri *5) + 100)/ 100);
    else
    Dam = (dam * 2);
    return Dam;
    }
    public double upSpd()
    {
    double Spd = spd * 10;
    return Spd;
    }
    public double upChn()
    {
    double Chn = chn;
    return Chn;
    }
    public double upCri()
    {
    double Cri =  cri * 10;
    return Cri;
    }
    public void VAL()
    {
    double x = upd(val);
    if(Battle.money > x)
    {val++;
     Battle.money -=x;
     x = (val * (10 + (val/5)));
     Ui.pane.getChildren().remove(L);
     L = Labels.add(""+x,50,150,32);
    }
    }
    public void HP()
    {
    double x = upd(hp);
    if(Battle.money > x)
    {hp++;
    Battle.money -=x;
    x = (hp * (10 + (hp/10)));
    Ui.pane.getChildren().remove(L);
    L = Labels.add(""+x,50,300,32);
    }
    }
    public void DAM()
    {
    double x =  upd(dam);
    if(Clicker.bani > x)
    {dam++;
    Clicker.bani -=x;
    }
    }
    public void SPD()
    {
    double x = upd(spd);
    if(Clicker.bani > x)
    {spd++;
    Clicker.bani -=x;
    }
    }
    public void CHN()
    {
    double x = upd(chn);
    if(Fishing.score > x)
    Fishing.score -=x;
    chn++;
    }
    public void CRI()
    {
    double x = upd(cri);
    if(Fishing.score > x)
    Fishing.score -=x;
    cri ++;
    }
    public static double upd(double x)
    {
    return (x * (10 + x));
    }
}
