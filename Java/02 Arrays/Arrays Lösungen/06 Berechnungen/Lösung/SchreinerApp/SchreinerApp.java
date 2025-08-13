import console.*;

/*
 * Hauptklasse für die Verwaltung von Geldbeträgen
 * C. Pothmann, 28.01.2022
 */
public class SchreinerApp
{
    private Geldbeträge gb;
    
    public SchreinerApp()
    {
        gb = new Geldbeträge();
    }
    
    public void main()
    {
        Console.println("\n\n=== Berechnungen für ein Array ===");
        Console.println("\nDas Array wird mit Zufallszahlen gefüllt.");        
        gb.fuellenZufall();
        gb.ausgeben();

        Console.println("\nDie Summe ist " + gb.summe() + ".");
        Console.println("Der Mittelwert ist " + gb.mittelwert() + ".");
        Console.println("Das Minimum ist " + gb.minimum() + " und das Maximum ist " + gb.maximum() + ".");
        Console.println("Die zweitgrößte Zahl ist " + gb.zweitgroesste() + ".");
        Console.println("Das Array enthält " + gb.anzahlNullen() + " mal den Wert 0.");        
    }
}