public class Konto
{
    private double stand;
    private int nummer;
    
    public Konto(int pn)
    {
        nummer = pn;
    }
    
    public int getNummer()
    {
        return nummer;
    }

    public void einzahlen(double pbetrag)
    {
        if (pbetrag > 0.0)
        {
            stand = stand + pbetrag;
        }
    }
    
    public void abheben(double pbetrag)
    {
        if (pbetrag <= stand)
        {
            stand = stand - pbetrag;
        }
    }
    
    public double getStand()
    {
        return stand;
    }
}
