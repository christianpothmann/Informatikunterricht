import console.*;

/*
 * Hauptklasse für die Zahlenliste
 * C. Pothmann, 28.01.2022
 */
public class MatheApp
{
    private Zahlenliste zl;
    
    public MatheApp()
    {
        zl = new Zahlenliste();
    }
    
    public void main()
    {
        Console.println("\n\n=== Berechnungen für ein Array ===");
        Console.println("\nDas Array wird mit Zufallszahlen gefüllt.");        
        zl.fuellenZufall();
        zl.ausgeben();

        Console.println("\nDie Summe ist " + zl.summe());
        Console.println("Der Mittelwert ist " + zl.mittelwert());
        Console.println("Das Minimum ist " + zl.minimum() + " und das Maximum ist " + zl.maximum());
        Console.println("Die zweitgrößte Zahl ist " + zl.zweitgroesste());
        Console.println("Das Array enthält " + zl.anzahlNullen() + " mal den Wert 0.");        
    }
}