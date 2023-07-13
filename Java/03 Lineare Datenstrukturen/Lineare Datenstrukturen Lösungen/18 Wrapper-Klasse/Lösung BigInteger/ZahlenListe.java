import java.math.*;
import console.*;

public class ZahlenListe
{
    private List<BigInteger> zlist;    

    public ZahlenListe()
    {
        zlist = new List();
    }

    /*
     * Füllt die Liste mit den Werten der Fibonacci-Folge.
     */
    public void fibonacci(int laenge)
    {
        int i;
        BigInteger a1, a2, a3;
        a1 = new BigInteger("1");
        a2 = new BigInteger("1");
        zlist.append(a1);
        zlist.append(a2);
        for (i = 2; i < laenge; i++)
        {
            a3 = a1.add(a2);
            zlist.append(a3);
            a1 = a2;
            a2 = a3;
        }
    }

    public void ausgabe()
    {
        int i = 1;
        int bits, bytes, total = 0;  // benötigter Speicherplatz
        BigInteger num;
        zlist.toFirst();
        while (zlist.hasAccess())
        {
            num   = zlist.getContent();
            bits  = num.bitLength();
            bytes = num.bitLength() / 8 + 1;
            total += bytes;
            Console.println(i + ": " + zlist.getContent() + "; " + zlist.getContent().bitLength() + " Bits");
            zlist.next();
            i++;
        }
        
        // Jedes Listenobjekt benötigt nach meiner Rechnung 88 Bytes Overhead:
        // 64 Bytes pro BigInteger, 24 Bytes pro ListNode.
        // Vgl. https://stackoverflow.com/questions/15301249/how-much-space-does-biginteger-use
        Console.println("Total: " + total + " bytes of data + " + (i-1) * 88 + " overhead");
    }
    
    public void main()
    {
        Console.clear();
        Console.println("Maximum Integer: " + Integer.MAX_VALUE);
        fibonacci(5000);
        ausgabe();
    }
}