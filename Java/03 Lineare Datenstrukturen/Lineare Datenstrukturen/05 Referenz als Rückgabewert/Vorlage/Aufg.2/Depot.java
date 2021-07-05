public class Depot
{
    private String aktie;
    private double kurs;
    private int anzahl;
    
    public Depot(String pa)
    {
        aktie = pa;
    }
    
    public String getAktie()
    {
        return aktie;
    }
    
    public void setKurs(double pk)
    {
        if (pk >= 0.0)
        {
            kurs = pk;
        }
    }
    
    public double getKurs()
    {
        return kurs;
    }
    
    public void kaufen(int pa)
    {
        if (pa >= 0)
        {
            anzahl += pa;
        }
    }
    
    public void verkaufen(int pa)
    {
        if (pa <= anzahl)
        {
            anzahl -= pa;
        }
    }

    public int getAnzahl()
    {
        return anzahl;
    }
}
