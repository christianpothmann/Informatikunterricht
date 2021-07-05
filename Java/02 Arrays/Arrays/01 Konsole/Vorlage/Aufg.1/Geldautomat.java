import console.*;

public class Geldautomat
{
    private Konto kto;

    public Geldautomat()
    {
        kto = new Konto();
        kto.einzahlen(100.0);  // zu Beginn werden 100 Euro auf das Konto gebucht
    }

    public void conAbheben()
    {
        double betrag, stand;

        Console.clear();
        Console.println("=== Geldautomat ===");
        Console.println("Wie viel möchten Sie abheben?");
        
        betrag = Console.readDouble();        
        kto.abheben(betrag);
        Console.println(betrag + " Euro werden ausgegeben.");

        stand  = kto.getStand();
        Console.println("Ihr aktueller Kontostand beträgt " + stand);
    }
}
