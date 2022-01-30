import console.*;

/*
 * Algorithmen f�r Arrays:
 * Summe, Mittelwert, Min/Max, Z�hlen von Werten
 * Christian Pothmann, 28.01.2022
 */
public class Zahlenliste
{   
    private int[] liste;

    public Zahlenliste()
    {
        liste = new int[20];
    }

    /*
     * Gibt die Liste auf der Konsole aus
     */
    public void ausgeben()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            Console.print(liste[i] + " ");
        }
        Console.println();
    }

    /*
     * F�llt die Liste mit Zufallszahlen zw. -10 und 10 
     */
    public void fuellenZufall()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = (int)(Math.random() * 21);
        }
    }

    /*
     * Gibt die Summe aller Elemente der Liste zur�ck.
     */
    public int summe()
    {
        int i, s;
        s = 0;
        for (i = 0; i < liste.length; i++)
        {
            s = s + liste[i];
        }
        return s;
    }

    /*
     * Gibt den Mittelwert aller Elemente der Liste zur�ck.
     */
    public double mittelwert()
    {
        double m;
        m = (double)summe() / liste.length;
        return m;
    }

    /*
     * Gibt das Minimum aller Werte der Liste zur�ck.
     */
    public int minimum()
    {
        int i, min;
        min = liste[0];
        for (i = 1; i < liste.length; i++)
        {
            if (liste[i] < min)
            {
                min = liste[i];
            }
        }
        return min;
    }

    /*
     * Gibt das Maximum aller Werte der Liste zur�ck.
     */
    public int maximum()
    {
        int i, max;
        max = liste[0];
        for (i = 1; i < liste.length; i++)
        {
            if (liste[i] > max)
            {
                max = liste[i];
            }
        }
        return max;
    }
   
    /*
     * Gibt die Anzahl der Elemente zur�ck, die den Wert 0 haben.
     */
    public int anzahlNullen()
    {
        int i, a;
        a = 0;
        for (i = 1; i < liste.length; i++)
        {
            if (liste[i] == 0)
            {
                a = a + 1;
            }
        }
        return a;
    }

    /*
     * Gibt die zweitgr��te Zahl zur�ck.
     * Im Sonderfall, dass alle Elemente des Arrays den gleichen Wert haben, wird eine Mitteilung auf der Konsole gemacht.
     */
    public int zweitgroesste()
    {
        int i;
        int max1, max2;

        // Setze anfangs erst- und zweitgr��te Zahl auf den Anfang des Arrays
        max1 = liste[0];
        max2 = liste[0];
        for (i = 1; i < liste.length; i++)
        {
            // Jedesmal wenn eine neue gr��te Zahl gefunden wird, 
            // wandert die bisherige gr��te zur zweitgr��ten.
            if (liste[i] > max1)
            {
                max2 = max1;
                max1 = liste[i];
            }
            
            // Falls eine Zahl zwischen aktueller zweitgr��ter und gr��ter gefunden wird,
            // ersetze die aktuelle zweitgr��te
            if (liste[i] > max2 && liste[i] < max1)
            {
                max2 = liste[i];
            }
        }
        
        // Sonderfall: alle Elemente der Liste sind gleich
        if (max1 == max2)
        {
            Console.println("Es gibt keine zweitgr��te Zahl.");
        }
        
        return max2;
    }
}