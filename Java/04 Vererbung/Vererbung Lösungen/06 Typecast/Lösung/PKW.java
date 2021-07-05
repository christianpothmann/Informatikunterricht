public class PKW extends Fahrzeug
{
    private double wochenPreis;
    private boolean navi;
    
    public PKW(String pk)
    {
        super(pk);
    }
    
    public void setWochenPreis(double pp)
    {
        wochenPreis = pp;
    }
    
    public double getWochenPreis()
    {
        return wochenPreis;
    }
    
    public void setNavi(boolean pn)
    {
        navi = pn;
    }
    
    public boolean getNavi()
    {
        return navi;
    }
    
    public double getGesamtPreis()
    {
        int wochen, restTage;
        double gesamt;
        
        wochen = getTage() / 7;
        restTage = getTage() - wochen * 7;
        gesamt = wochen * wochenPreis + restTage * getTagesPreis();
        
        if (navi == true)
        {
            gesamt += 30;
        }
        
        return gesamt;
    }
}