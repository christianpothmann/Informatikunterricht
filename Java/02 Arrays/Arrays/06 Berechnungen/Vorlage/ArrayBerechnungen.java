import console.*;
/*
 * Algorithmen f�r Arrays:
 * Summe, Mittelwert, Min/Max, Z�hlen von Werten
 */
public class ArrayBerechnungen
{   
    private int[] liste;

    public ArrayBerechnungen()
    {
        liste = new int[20];
    }

    // Programmiere die folgenden Methoden: /////////////////////////////////////////////////
    
    /*
     * Gibt die Summe aller Elemente der Liste zur�ck.
     */
    public int summe()
    {
    }

    /*
     * Gibt den Mittelwert aller Elemente der Liste zurück.
     */
    public double mittelwert()
    {
    }

    /*
     * Gibt das Minimum aller Werte der Liste zurück.
     */
    public int minimum()
    {
    }

    /*
     * Gibt das Maximum aller Werte der Liste zurück.
     */
    public int maximum()
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
     * F�llt die Liste mit Zufallszahlen zw. -10 und 10 
     */
    public void f�llenZufall()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = (int)(Math.random() * 21);
        }
    }

    /*
     * Hauptmethode:
     * Testet alle Methoden der Klasse
     */
    public void main()
    {
        Console.println("\n\n=== Berechnungen f�r ein Array ===");
        Console.println("\nDas Array wird mit Zufallszahlen gef�llt.");        
        f�llenZufall();
        ausgeben();

        Console.println("\nDie Summe ist " + summe());
        Console.println("Der Mittelwert ist " + mittelwert());
        Console.println("Das Minimum ist " + minimum() + " und das Maximum ist " + maximum());
        Console.println("Das Array enth�lt " + anzahlNullen() + " mal den Wert 0.");        
    }
}