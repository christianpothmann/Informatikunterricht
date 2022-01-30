import console.*;

/*
 * Typische Fehler im Umgang mit Arrays und for-Schleifen
 * C. Pothmann, 19.06.2019
 */
public class Zahlenliste
{
    private int[] liste;
    
    public Zahlenliste()
    {
        liste = new int[10];
    }

    // Fehler 1
    public void füllenZufall()
    {
        int i, z;
        
        z = (int)(Math.random() * 201 - 100);
        for (i = 0; i < 10; i++)
        {
            liste[i] = z;
        }
    }

    // Fehler 2
    public void füllenQuadrat()
    {
        int i, d;

        d = 1;
        for (i = 0; i < liste.length; i++)
        {
            d = d * d;
            liste[i] = d;
            d = d + 1;
        }
    }

    // Fehler 3
    public void füllenWachsend()
    {
        int i, a, k;
        
        a = 1;
        k = 1;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = a;
            k = k + 1;
        }
    }
    
    // Wie geht das?
    public void füllenFibonacci()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
        }
    }
}
