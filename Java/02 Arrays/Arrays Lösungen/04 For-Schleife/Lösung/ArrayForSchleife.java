import console.*;

/*
 * Verschiedene Methoden, ein Array mit der for-Schleife zu füllen.
 * C. Pothmann, 17.06.2019
 */
public class ArrayForSchleife
{
    private int[] liste;
    
    public ArrayForSchleife()
    {
        liste = new int[10];
    }

    /*
     * Gibt die Werte nebeneinander auf der Konsole aus.
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
     * List die Werte für das Array vom Benutzer ein.
     */
    public void eingeben()
    {
        int i;
        Console.println("Bitte geben Sie " + liste.length + " Zahlen ein.");
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = Console.readInt();
        }
    }

    /*
     * Füllt das Array mit Zufallszahlen zw. -100 und +100
     */
    public void füllenZufall()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = (int)(Math.random() * 201 - 100);
        }
    }

    /*
     * Füllt das Array linear von 0 in 10er-Schritten
     */
    public void füllenLinear10()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = i * 10;
        }
    }

    /*
     * Füllt das Array mit den Quadratzahlen (1, 4, 9 usw.)
     */
    public void füllenQuadrat()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = (i+1) * (i+1);
        }
    }

    /*
     * Füllt das Array von 100 in 100er-Schritten
     */
    public void füllenLinear100()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = (i+1) * 100;
        }
    }

    /*
     * Füllt das Array linear von -75 in 25er-Schritten
     */
    public void füllenLinear25()
    {
        int i, a;
        a = -75;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = a;
            a = a + 25;
        }
    }

    /*
     * Füllt das Array mit den Werten 1, 3, 6, 10 usw.
     */
    public void füllenWachsend()
    {
        int i, a;
        a = 1;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = a;
            a = a + i + 2;
        }
    }

    /*
     * Füllt das Array mit den 2er-Potenzen.
     */
    public void füllenPotenzen()
    {
        int i, a;
        a = 1;
        for (i = 0; i < liste.length; i++)
        {
            liste[i] = a;
            a = a * 2;
        }
    }

    /*
     * Füllt das Array mit der Fibonacci-Folge
     */
    public void füllenFibonacci()
    {
        int i;
        liste[0] = 1;
        liste[1] = 1;
        for (i = 2; i < liste.length; i++)
        {
            liste[i] = liste[i-1] + liste[i-2];
        }
    }

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

        Console.println("\nDas Array wird linear von 100 bis 900 gefüllt.");
        füllenLinear100();
        ausgeben();

        Console.println("\nDas Array wird linear von -75 bis 150 gefüllt.");        
        füllenLinear25();
        ausgeben();

        Console.println("\nDas Array wird mit wachsenden Werten gefüllt.");
        füllenWachsend();
        ausgeben();

        Console.println("\nDas Array wird mit den 2er-Potenzen gefüllt.");
        füllenPotenzen();
        ausgeben();

        Console.println("\nDas Array wird mit den Fibonacci-Zahlen gefüllt.");
        füllenFibonacci();
        ausgeben();
    }
}
