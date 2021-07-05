public class Patient
{
    private String name;
    private int ankunft;
    
    public Patient(String pName, int pAnkunft)
    {
        name = pName;
        ankunft = pAnkunft;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAnkunft()
    {
        return ankunft;
    }
}
