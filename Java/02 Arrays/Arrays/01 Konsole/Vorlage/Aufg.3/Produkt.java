public class Produkt
{
    private String name;
    private double preis;
    private int anzahl;

    public Produkt(String pname)
    {
        name = pname;
        anzahl = 0;
    }

    public double getPreis()
    {
        return preis;
    }

    public void setPreis(double pp)
    {
        if (pp > 0.0)
        {
            preis = pp;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public void nachfuellen(int pa)
    {
        if (pa > 0)
        {
            anzahl += pa;
        }
    }

    public void verkaufen()
    {
        if (anzahl > 0)
        {
            anzahl--;
        }
    }
}