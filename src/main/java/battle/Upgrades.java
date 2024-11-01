package battle;
import java.util.Random;

import clicker.Clicker;
import graphics.Labels;
import graphics.Ui;
import javafx.scene.control.Label;
public class Upgrades
{
    Label L = new Label();
    double val = 1;
    double hp = 1;
    double dam = 1;
    double spd = 1;
    double chn = 0;
    double cri = 0;
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
    double x = (val * (10 + (val/5)));
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
    double x = (hp * (10 + (hp/10)));
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
    double x =  (dam * (10 + (dam / 10)));
    if(Clicker.bani > x)
    {dam++;
    Battle.money -=x;
    x =  (dam * (10 + (dam / 10)));
    Ui.pane.getChildren().remove(L);
    L = Labels.add(""+x,50,450,32);
    }
    }
    public void SPD()
    {
    double x = (spd * (10 + (spd / 10)));
    if(Clicker.bani > x)
    {spd++;
    Battle.money -=x;
    x = (spd * (10 + (spd / 10)));
    Ui.pane.getChildren().remove(L);
    L = Labels.add(""+x,50,600,32);
    }
    }
    public void CHN()
    {
    chn++;
    }
    public void CRI()
    {
    cri ++;
    }

}
