import console.*;
/*
 * Algorithmen für Arrays:
 * Summe, Mittelwert, Min/Max, Zählen von Werten
 */
public class Geldbeträge
{   
    private double[] liste;

    public Geldbeträge()
    {
        liste = new double[20];
    }

    // Programmiere die folgenden Methoden: /////////////////////////////////////////////////
    
    /*
     * Gibt die Summe aller Elemente der Liste zurück.
     */
    public double summe()
    {
    }

    /*
     * Gibt den Mittelwert aller Elemente der Liste zurÃ¼ck.
     */
    public double mittelwert()
    {
    }

    /*
     * Gibt das Minimum aller Werte der Liste zurÃ¼ck.
     */
    public double minimum()
    {
    }

    /*
     * Gibt das Maximum aller Werte der Liste zurück.
     */
    public double maximum()
    {
    }
   
    /*
     * Gibt die Anzahl der Elemente zurück, die den Wert 0 haben.
     */
    public int anzahlNullen()
    {
    }
    
    // Bis hier... /////////////////////////////////////////////////////////////

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
     * Füllt die Liste mit Zufallszahlen zw. -100 und 100
     */
    public void fuellenZufall()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = Math.random() * 201.0;
        }
    }
}
