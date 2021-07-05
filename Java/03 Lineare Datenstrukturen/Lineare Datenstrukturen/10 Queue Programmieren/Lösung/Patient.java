public class Patient
{
    private String name;
    private int ankunft;
    
    public Patient(String pname, int pan)
    {
        name = pname;
        ankunft = pan;
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
