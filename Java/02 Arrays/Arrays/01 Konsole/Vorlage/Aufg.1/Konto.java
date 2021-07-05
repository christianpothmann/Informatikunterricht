public class Konto
{
    private double stand;

    public double getStand()
    {
        return stand;
    }

    public void einzahlen(double pbetrag)
    {
        stand += pbetrag;
    }

    public void abheben(double pbetrag)
    {
        stand -= pbetrag;
    }
}