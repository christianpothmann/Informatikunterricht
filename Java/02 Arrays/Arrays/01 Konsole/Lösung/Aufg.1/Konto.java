public class Konto
{
    private double stand;

    public double getStand()
    {
        return stand;
    }

    public void einzahlen(double pbetrag)
    {
        if (pbetrag > 0)
        {
            stand += pbetrag;
        }
    }

    public void abheben(double pbetrag)
    {
        if (pbetrag > 0 && stand - pbetrag >= 0)
        {
            stand -= pbetrag;
        }
    }
}