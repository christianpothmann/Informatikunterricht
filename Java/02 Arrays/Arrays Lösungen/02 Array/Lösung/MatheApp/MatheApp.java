import console.*;

public class MatheApp
{
    private Zahlenliste zl;
    
    public MatheApp()
    {
        zl = new Zahlenliste();
    }
    
    public void main()
    {
        zl.füllenLinear();
        zl.ausgeben();
    }
}