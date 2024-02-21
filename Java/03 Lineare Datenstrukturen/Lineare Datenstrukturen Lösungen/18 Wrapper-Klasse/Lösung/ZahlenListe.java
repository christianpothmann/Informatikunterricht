import console.*;

public class ZahlenListe
{
    private List<Integer> zl;    

    public ZahlenListe()
    {
        zl = new List();
    }

    /*
     * Füllt die Liste mit den Werten der Fibonacci-Folge.
     * pLänge <= 46 (da Integer keine größeren Werte speichern kann).
     */
    public void fibonacci(int pLänge)
    {
        int i, a1, a2, a3;
        a1 = 1;
        a2 = 1;
        zl.append(a1);
        zl.append(a2);
        for (i = 2; i < pLänge; i++)
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
        fibonacci(40);
        ausgabe();
    }
}