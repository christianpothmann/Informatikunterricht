import console.*;

public class Fragespiel
{
    Textliste tl;
    
    public Fragespiel()
    {
        tl = new Textliste();
    }
    
    public void main()
    {
        tl.fragen();
        tl.ausgeben();
    }
}