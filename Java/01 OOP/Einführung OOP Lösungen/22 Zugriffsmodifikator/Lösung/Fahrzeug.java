public class Fahrzeug
{
    private double tankGröße, füllstand, kmStand;

    public Fahrzeug(double pt)
    {
        if (pt >= 0)
        {
            tankGröße = pt;
        }
    }

    public void tanken(double pt)
    {
        if (pt > 0 && füllstand + pt <= tankGröße)
        {
            füllstand += pt;
        }
    }

    public void fahren(double pkm)
    {
        if (pkm > 0 && füllstand - pkm * 0.1 >= 0)
        {
            kmStand += pkm;
            füllstand -= pkm * 0.1;
        }
    }

    public double getTankGröße()
    {
        return tankGröße;
    }

    public double getFüllstand()
    {
        return füllstand;
    }

    public double getkmStand()
    {
        return kmStand;
    }
}
