import console.*;

/*
 * Einfacher Geldautomat (zum Erarbeiten der Konsole)
 * C. Pothmann, 24.03.2020
 */
public class Geldautomat
{
    private Konto kto;

    /*
     * Konstruktor: erzeugt ein Konto und füllt es mit 100 Euro auf.
     */
    public Geldautomat()
    {
        kto = new Konto();
        kto.einzahlen(100.0);
    }

    /*
     * Benutzer-Dialog zum Abheben vom Konto 
     */
    public void conAbheben()
    {
        double betrag, stand;

        Console.clear();
        Console.println("=== Geldautomat ===");
        Console.println("Wie viel möchten Sie abheben?");
        
        betrag = Console.readDouble();
        stand  = kto.getStand();
        
        // Fehler 1: negativer Betrag
        if (betrag <= 0)
        {
            Console.println("Betrag muss größer als 0 sein.");
        }
        // Fehler 2: zu hoher Betrag
        else if (betrag > stand)
        {
            Console.println("Kontostand zu niedrig");
        }
        // Korrekte Eingabe
        else
        {
            kto.abheben(betrag);
            Console.println(betrag + " Euro werden ausgegeben.");
        }

        stand = kto.getStand();
        Console.println("Ihr aktueller Kontostand beträgt " + stand);
    }

    /*
     * Benutzer-Dialog zum Einzahlen auf das Konto
     */
    public void conEinzahlen()
    {
        double betrag, stand;

        Console.clear();
        Console.println("=== Geldautomat ===");
        Console.println("Wie viel möchten Sie einzahlen?");
        
        betrag = Console.readDouble();
        
        // Fehler: Betrag negativ
        if (betrag < 0)
        {
            Console.println("Negative Eingabe nicht möglich.");
        }
        // Korrekte Eingabe
        else
        {
            kto.einzahlen(betrag);
            Console.println(betrag + " Euro wurden eingezahlt.");
        }

        stand = kto.getStand();        
        Console.println("Ihr aktueller Kontostand beträgt " + stand);
    }    
}
