import console.*;
/*
 * Algorithmen für Arrays:
 * Summe, Mittelwert, Min/Max, Zählen von Werten
 */
public class Zahlenliste
{   
    private int[] liste;

    public Zahlenliste()
    {
        liste = new int[20];
    }

    // Programmiere die folgenden Methoden: /////////////////////////////////////////////////
    
    /*
     * Gibt die Summe aller Elemente der Liste zurück.
     */
    public int summe()
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
    public int minimum()
    {
    }

    /*
     * Gibt das Maximum aller Werte der Liste zurÃ¼ck.
     */
    public int maximum()
    {
    }
   
    /*
     * Gibt die Anzahl der Elemente zurÃ¼ck, die den Wert 0 haben.
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
}