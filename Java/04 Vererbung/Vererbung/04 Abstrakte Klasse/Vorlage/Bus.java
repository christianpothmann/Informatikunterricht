public class Bus extends Fahrzeug
{
    private int pl�tze;
    private boolean gereinigt;
    
    public Bus(String pk, int pp)
    {
        super(pk);
        pl�tze = pp;
    }
    
    public int getPl�tze()
    {
        return pl�tze;
    }
    
    public void setGereinigt(boolean pr)
    {
        gereinigt = pr;
    }
    
    public boolean getGereinigt()
    {
        return gereinigt;
    }
    
    public double getGesamtPreis()
    {
        double gesamt;

        gesamt = getTage() * getTagesPreis();
        
        if (gereinigt == false)
        {
            gesamt += pl�tze * 1.5;
        }
        
        return gesamt;
    }
}