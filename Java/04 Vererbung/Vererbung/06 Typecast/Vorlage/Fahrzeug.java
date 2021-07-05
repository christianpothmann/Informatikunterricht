public abstract class Fahrzeug
{
    private String kennz;
    private double tagesPreis;
    private int tage;
    private double km;
    
    public Fahrzeug(String pk)
    {
        kennz = pk;
    }
    
    public String getKennzeichen()
    {
        return kennz;
    }

    public void setTagesPreis(double pp)
    {
        tagesPreis = pp;
    }
    
    public double getTagesPreis()
    {
        return tagesPreis;
    }
    
    public void mieten(int pt)
    {
        tage = pt;
    }
    
    public int getTage()
    {
        return tage;
    }
    
    public void fahren(double pk)
    {
        km = pk;
    }
    
    public double getKm()
    {
        return km;
    }
    
    public abstract double getGesamtPreis();
}
