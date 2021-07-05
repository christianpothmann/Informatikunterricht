import console.*;

public class ZahlenListe
{
    private double[] liste;
    
    public ZahlenListe()
    {
        liste = new double[5];
    }
    
    public void main()
    {
        double summe;

        liste[0] = 1.0;
        liste[1] = 1.2;
        liste[2] = 1.4;
        liste[3] = 1.6;
        liste[4] = 1.8;
        
        Console.print  (liste[0] + " ");
        Console.print  (liste[1] + " ");
        Console.print  (liste[2] + " ");
        Console.print  (liste[3] + " ");
        Console.println(liste[4]);
        
        summe = liste[0] + liste[1] + liste[2] + liste[3] + liste[4];
        Console.println("Summe: " + summe);
    }
}
