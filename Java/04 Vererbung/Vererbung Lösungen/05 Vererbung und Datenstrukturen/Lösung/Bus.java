public class Bus extends Fahrzeug
{
    private int plätze;
    private boolean gereinigt;
    
    public Bus(String pk, int pp)
    {
        super(pk);
        plätze = pp;
    }
    
    public int getPlätze()
    {
        return plätze;
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
            gesamt += plätze * 1.5;
        }
        
        return gesamt;
    }
}