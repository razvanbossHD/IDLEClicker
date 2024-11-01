package battle;
public class Fight
{
    static double hp = Battle.up.upHp();
    public static void damage()
    {
    hp = hp - Battle.up.upDam();
    BMenu.HP();
    }
}
