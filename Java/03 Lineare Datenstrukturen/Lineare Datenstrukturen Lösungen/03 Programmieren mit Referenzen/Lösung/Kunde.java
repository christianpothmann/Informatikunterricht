public class Kunde
{
    private String name;
    private Konto kto;
    private Depot dep;
    
    public Kunde(String pn)
    {
        name = pn;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setKonto(Konto pk)
    {
        kto = pk;
    }
    
    public Konto getKonto()
    {
        return kto;
    }
    
    public void setDepot(Depot pd)
    {
        dep = pd;
    }
    
    public Depot getDepot()
    {
        return dep;
    }
    
    public boolean hatDepot()
    {
        return (dep != null);
    }
}
