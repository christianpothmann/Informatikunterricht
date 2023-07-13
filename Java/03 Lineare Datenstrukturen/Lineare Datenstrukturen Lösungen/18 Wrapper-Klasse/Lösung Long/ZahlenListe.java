import console.*;

public class ZahlenListe
{
    private List<Long> zl;    

    public ZahlenListe()
    {
        zl = new List();
    }

    /*
     * Füllt die Liste mit den Werten der Fibonacci-Folge.
     * laenge <= 92 (da Long keine größeren Werte speichern kann).
     */
    public void fibonacci(int laenge)
    {
        int i;
        long a1, a2, a3;
        a1 = 1;
        a2 = 1;
        zl.append(a1);
        zl.append(a2);
        for (i = 2; i < laenge; i++)
        {
            a3 = a1 + a2;
            zl.append(a3);
            a1 = a2;
            a2 = a3;
        }
    }

    public void ausgabe()
    {
        int i = 1;
        zl.toFirst();
        while (zl.hasAccess())
        {
            Console.println(i + ": " + zl.getContent());
            zl.next();
            i++;
        }
    }
    
    public void main()
    {
        Console.clear();
        fibonacci(92);
        ausgabe();
    }
}