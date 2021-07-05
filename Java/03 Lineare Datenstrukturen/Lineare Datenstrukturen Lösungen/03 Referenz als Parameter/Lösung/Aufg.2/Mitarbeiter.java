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
    
    public void setGehalt(double pg)
    {
        gehalt = pg;
    }
    
    public void setAbteilung(Abteilung pa)
    {
        abt = pa;
    }
    
    public void setVorgesetzter(Mitarbeiter pv)
    {
        vorges = pv;
    }
}
