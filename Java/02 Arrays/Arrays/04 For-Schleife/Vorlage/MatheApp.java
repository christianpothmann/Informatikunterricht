import console.*;

public class MatheApp
{
    private Zahlenliste zl;
    
    public MatheApp()
    {
        zl = new Zahlenliste();
    }
    
    public void main()
    {
        Console.clear();
        Console.println("=== Verschiedene Füllmethoden für ein Array ===");
        zl.eingeben();
        Console.println("Sie haben folgende Zahlen eingegeben:");
        zl.ausgeben();
        
        Console.println("\nDas Array wird mit Zufallszahlen gefüllt.");        
        zl.füllenZufall();
        zl.ausgeben();
        
        Console.println("\nDas Array wird linear von 0 bis 90 gefüllt.");
        zl.füllenLinear10();
        zl.ausgeben();
        
        Console.println("\nDas Array wird mit den Quadratzahlen gefüllt.");
        zl.füllenQuadrat();
        zl.ausgeben();
        
        // Weitere Methodenaufrufe (Aufgabe 3)
        // ...
    }
}