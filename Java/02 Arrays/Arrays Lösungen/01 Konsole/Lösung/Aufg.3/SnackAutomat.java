import console.*;

/*
 * Einfacher Snackautomat (zum Erarbeiten der Konsole)
 * C. Pothmann, 26.08.2020
 */
public class SnackAutomat
{
    private Produkt p1, p2;

    /*
     * Konstruktor: erzeugt ein Konto und füllt es mit 100 Euro auf.
     */
    public SnackAutomat()
    {
        p1 = new Produkt("Cola");
        p2 = new Produkt("Chips");
    }

    /*
     * Benutzerschnittstelle für Mitarbeiter
     * zum Nachfüllen und Setzen der Preise der Produkte
     */
    public void conWartung()
    {
        String name;
        int anzahl;
        double preis;

        Console.clear();

        name = p1.getName();
        Console.print("Wie viele Einheiten von " + name + " nachfüllen? ");
        anzahl = Console.readInt();
        Console.print("Neuer Preis von " + name + "? ");
        preis = Console.readDouble();
        
        p1.nachfuellen(anzahl);
        p1.setPreis(preis);

        name = p2.getName();
        Console.print("Wie viele Einheiten von " + name + " nachfüllen? ");
        anzahl = Console.readInt();
        Console.print("Neuer Preis von " + name + "? ");
        preis = Console.readDouble();
        
        p2.nachfuellen(anzahl);
        p2.setPreis(preis);        
    }
    
    /*
     * Benutzerschnitttstelle für Kunden
     * zur Wahl eines Produkts und zum Verkauf / Bezahlen
     */
    public void conVerkauf()
    {
        int wahl;
        double einwurf, rückgeld;

        Console.clear();
        Console.println("~~~~ Snack-Automat !! ~~~~");
        
        Console.println("Produkte:");
        Console.println("(1) " + p1.getName() + " zum Preis von " + p1.getPreis());
        Console.println("(2) " + p2.getName() + " zum Preis von " + p2.getPreis());
        
        Console.print("Was möchten Sie kaufen? ");
        wahl = Console.readInt();
        Console.print("Wieviel Geld haben Sie eingeworfen? ");
        einwurf = Console.readDouble();
        
        if (wahl == 1)
        {
            if (p1.getAnzahl() < 0)
            {
                Console.println(p1.getName() + " ist leider ausverkauft.");
            }
            else if (einwurf < p1.getPreis())
            {
                Console.println("Sie müssen mindestens " + p1.getPreis() + " einwerfen");
            }
            else
            {
                p1.verkaufen();
                rückgeld = einwurf - p1.getPreis();
                Console.println("Sie haben " + p1.getName() + " gekauft.");
                Console.println("Rückgeld: " + rückgeld);
            }
        }
        else if (wahl == 2)
        {
            if (p2.getAnzahl() < 0)
            {
                Console.println(p2.getName() + " ist leider ausverkauft.");
            }
            else if (einwurf < p2.getPreis())
            {
                Console.println("Sie müssen mindestens " + p2.getPreis() + " einwerfen");
            }
            else 
            {
                p2.verkaufen();
                rückgeld = einwurf - p2.getPreis();
                Console.println("Sie haben " + p2.getName() + " gekauft.");
                Console.println("Rückgeld: " + rückgeld);
            }
        }
        else
        {
            Console.println("Sie können nur 1 oder 2 wählen.");
        }
        
    } 
}
