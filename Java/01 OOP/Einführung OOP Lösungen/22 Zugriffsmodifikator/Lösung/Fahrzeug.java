public class Fahrzeug
{
    private double tankGr��e, f�llstand, kmStand;

    public Fahrzeug(double pt)
    {
        if (pt >= 0)
        {
            tankGr��e = pt;
        }
    }

    public void tanken(double pt)
    {
        if (pt > 0 && f�llstand + pt <= tankGr��e)
        {
            f�llstand += pt;
        }
    }

    public void fahren(double pkm)
    {
        if (pkm > 0 && f�llstand - pkm * 0.1 >= 0)
        {
            kmStand += pkm;
            f�llstand -= pkm * 0.1;
        }
    }

    public double getTankGr��e()
    {
        return tankGr��e;
    }

    public double getF�llstand()
    {
        return f�llstand;
    }

    public double getkmStand()
    {
        return kmStand;
    }
}
