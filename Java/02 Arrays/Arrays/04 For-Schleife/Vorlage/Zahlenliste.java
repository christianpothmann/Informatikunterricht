import console.*;

/*
 * Verschiedene Methoden, ein Array mit der while-Schleife zu füllen.
 * (Name, Datum)
 */
public class Zahlenliste
{
    private int[] liste;
    
    public Zahlenliste()
    {
        liste = new int[10];
    }

    /*
     * Gibt die Werte nebeneinander auf der Konsole aus.
     */
    public void ausgeben()
    {
        int i;
        i = 0;
        while (i < liste.length)
        {
            Console.print(liste[i] + " ");
            i++;
        }
        Console.println();
    }

    /*
     * List die Werte für das Array vom Benutzer ein.
     */
    public void eingeben()
    {
        int i;
        Console.println("Bitte geben Sie " + liste.length + " Zahlen ein.");
        i = 0;
        while (i < liste.length)
        {
            liste[i] = Console.readInt();
            i++;
        }
    }

    /*
     * Füllt das Array mit Zufallszahlen zw. -100 und +100
     */
    public void füllenZufall()
    {
        int i;
        i = 0;
        while (i < liste.length)
        {
            liste[i] = (int)(Math.random() * 201 - 100);
            i++;
        }
    }

    /*
     * Füllt das Array linear von 0 in 10er-Schritten
     */
    public void füllenLinear10()
    {
        int i;
        i = 0;
        while (i < liste.length)
        {
            liste[i] = i * 10;
            i++;
        }
    }

    /*
     * Füllt das Array mit den Quadratzahlen (1, 4, 9 usw.)
     */
    public void füllenQuadrat()
    {
        int i;
        i = 0;
        while (i < liste.length)
        {
            liste[i] = (i+1) * (i+1);
            i++;
        }
    }
    
    // Weitere Methoden /Aufgabe 3)
    // ...
}
