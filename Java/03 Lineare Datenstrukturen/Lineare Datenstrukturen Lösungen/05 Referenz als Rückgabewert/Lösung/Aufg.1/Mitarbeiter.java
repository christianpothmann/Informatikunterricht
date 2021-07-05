public class Mitarbeiter
{
    private String name;
    private double gehalt;
    private Abteilung abt;
    private Mitarbeiter vorges;
    
    public void setName(String pn)
    {
        name = pn;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGehalt(double pg)
    {
        gehalt = pg;
    }
    
    public double getGehalt()
    {
        return gehalt;
    }
    
    public void setAbteilung(Abteilung pa)
    {
        abt = pa;
    }
    
    public Abteilung getAbteilung()
    {
        return abt;
    }

    public void setVorgesetzter(Mitarbeiter pv)
    {
        vorges = pv;
    }
    
    public Mitarbeiter getVorgesetzter()
    {
        return vorges;
    }
}
