import console.*;

/*
 * Verschiedene Methoden, ein Array mit der for-Schleife zu füllen.
 * (Name, Datum)
 */
public class ArrayForSchleife
{
    private int[] liste;
    
    public ArrayForSchleife()
    {
        liste = new int[10];
    }

    // Aufgabe 2: while-Schleife durch for-Schleife ersetzen
	// ...

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

    // Aufgabe 3: Weitere Methoden
    // ...


    public void main()
    {
        Console.clear();
        Console.println("=== Verschiedene Füllmethoden für ein Array ===");
        eingeben();
        Console.println("Sie haben folgende Zahlen eingegeben:");
        ausgeben();
        
        Console.println("\nDas Array wird mit Zufallszahlen gefüllt.");        
        füllenZufall();
        ausgeben();
        
        Console.println("\nDas Array wird linear von 0 bis 90 gefüllt.");
        füllenLinear10();
        ausgeben();
        
        Console.println("\nDas Array wird mit den Quadratzahlen gefüllt.");
        füllenQuadrat();
        ausgeben();
        
        // Fortsetzen mit den weiteren Methoden
        // ...
    }
}
