package battle;
import java.util.*;
public class Upgrades
{
    double val = 1;
    double hp = 1;
    double dam = 1;
    double spd = 1;
    double chn = 0;
    double cri = 0;
    public double upVal(double Val)
    {
    Val = (val * hp) * (hp / 50);
    return Val;
    }
    public double upHp(double Hp)
    {
    Hp = (hp * 10) * (hp / 50);
    return Hp;
    }
    public  double upDam(double Dam)
    {
    Random R = new Random();
    boolean t = false;
    if (R.nextInt(100)<chn)
    t = true;
    if (t)
    Dam = (dam * 10) * ((cri + 100)/ 100);
    return Dam;
    }
    public double upSpd(double Spd)
    {
    Spd = spd * 10;
    return Spd;
    }
    public double upChn(double Chn)
    {
    Chn = chn;
    return Chn;
    }
    public double upCri(double Cri)
    {
    Cri =  cri * 10;
    return Cri;
    }
    public void VAL()
    {
    if(Battle.money > (val * (10 + (val/5))))
    val++;
    }
    public void HP()
    {
    double x = ;
    if(Battle.money > (hp * (10 + (hp/10))))
    hp++;
    }
    public void DMG()
    {
    //if(Clicker.bani > (dam * (10 + (dam / 10))))
    dam++;
    }
    public void SPD()
    {
    if(Clicker.bani > (spd * (10 + (spd / 10)))
    spd++;
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