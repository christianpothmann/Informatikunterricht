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

        Console.println("\nDas Array wird linear von 100 bis 1000 gefüllt.");
        zl.füllenLinear100();
        zl.ausgeben();

        Console.println("\nDas Array wird linear von -75 bis 150 gefüllt.");        
        zl.füllenLinear25();
        zl.ausgeben();

        Console.println("\nDas Array wird mit wachsenden Werten gefüllt.");
        zl.füllenWachsend();
        zl.ausgeben();

        Console.println("\nDas Array wird mit den 2er-Potenzen gefüllt.");
        zl.füllenPotenzen();
        zl.ausgeben();

        Console.println("\nDas Array wird mit den Fibonacci-Zahlen gefüllt.");
        zl.füllenFibonacci();
        zl.ausgeben();
    }
}