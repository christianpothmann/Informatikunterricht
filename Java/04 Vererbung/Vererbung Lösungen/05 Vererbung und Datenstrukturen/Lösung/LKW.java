public class LKW extends Fahrzeug
{
    private double kmPreis;
    
    public LKW(String pk)
    {
        super(pk);
    }
    
    public void setKmPreis(double pk)
    {
        kmPreis = pk;
    }
    
    public double getKmPreis()
    {
        return kmPreis;
    }
    
    public double getGesamtPreis()
    {
        return getKm() * kmPreis + getTage() * getTagesPreis();
    }
}