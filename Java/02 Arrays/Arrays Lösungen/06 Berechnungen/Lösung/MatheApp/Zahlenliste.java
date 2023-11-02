import console.*;

/*
 * Algorithmen für Arrays:
 * Summe, Mittelwert, Min/Max, Zählen von Werten
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
     * Füllt die Liste mit Zufallszahlen zw. -10 und 10 
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
     * Gibt die Summe aller Elemente der Liste zurück.
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
     * Gibt den Mittelwert aller Elemente der Liste zurück.
     */
    public double mittelwert()
    {
        double m;
        m = (double)summe() / liste.length;
        return m;
    }

    /*
     * Gibt das Minimum aller Werte der Liste zurück.
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
     * Gibt das Maximum aller Werte der Liste zurück.
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
     * Gibt die Anzahl der Elemente zurück, die den Wert 0 haben.
     */
    public int anzahlNullen()
    {
        int i, a;
        a = 0;
        for (i = 0; i < liste.length; i++)
        {
            if (liste[i] == 0)
            {
                a = a + 1;
            }
        }
        return a;
    }

    /*
     * Gibt die (echt) zweitgrößte Zahl der Liste zurück.
     * Im Sonderfall, dass alle Elemente des Arrays den gleichen Wert haben, wird eine Mitteilung auf der Konsole gemacht.
     */
    public int zweitgroesste()
    {
        int i;
        int max1, max2;

        // Anfangswerte für max1 und max2:
        // Die ersten beiden unterschiedlichen Zahlen der Liste
        // (beachtet den Sonderfall, dass das Maximum am Anfang steht, auch ggf. mehrmals)
        max1 = liste[0];
        i = 1;
        while (i < liste.length && liste[i] == max1)
        {
            i++;
        }
        // Sonderfall: alle Zahlen gleich
        if (i == liste.length)
        {
            Console.println("Es gibt keine zweitgrößte Zahl.");
            return max1;
        }
        // setze max1 auf die größere, max2 auf die kleinere der beiden Zahlen
        if (liste[i] < max1)
        {
            max2 = liste[i];
        }
        else
        {
            max2 = max1;
            max1 = liste[i];
        }
        // Fahre mit der restlichen Liste fort
        for (; i < liste.length; i++)
        {
            // Jedesmal wenn eine neue größte Zahl gefunden wird, 
            // wandert die bisherige größte zur zweitgrößten.
            if (liste[i] > max1)
            {
                max2 = max1;
                max1 = liste[i];
            }
            
            // Falls eine Zahl zwischen aktueller zweitgrößter und größter gefunden wird,
            // ersetze die aktuelle zweitgrößte
            if (liste[i] > max2 && liste[i] < max1)
            {
                max2 = liste[i];
            }
        }
       
        return max2;
    }
}