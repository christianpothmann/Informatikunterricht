import console.*;

public class Zahlenliste
{
    private double[] liste;
    
    public Zahlenliste()
    {
        liste = new double[5];
    }
    
    public void füllenLinear()
    {
        liste[0] = 1.0;
        liste[1] = 1.2;
        liste[2] = 1.4;
        liste[3] = 1.6;
        liste[4] = 1.8;        
    }
    
    public void ausgeben()
    {
        Console.print  (liste[0] + " ");
        Console.print  (liste[1] + " ");
        Console.print  (liste[2] + " ");
        Console.print  (liste[3] + " ");
        Console.println(liste[4]);
    }
}
