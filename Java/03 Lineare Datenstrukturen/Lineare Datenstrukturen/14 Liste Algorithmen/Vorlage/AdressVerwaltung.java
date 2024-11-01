import console.*;

/*
 * Benutzerschnittstelle für das Adressbuch mit der Konsole
 * C. Pothmann, 30.06.2021
 */
public class AdressVerwaltung
{
    private Adressbuch aBuch;

    public AdressVerwaltung()
    {
        aBuch = new Adressbuch();
    }

    /*
     * Der Benutzer gibt die Daten für einen neuen Kontakt ein. 
     * Dieser wird am Ende der Liste eingefügt.
     */
    public void kontaktAnlegen()
    {
        String n, v, t, e;
        Kontakt k;

        Console.println("\n== Neuen Kontakt hinzufügen ==");
        Console.print("Nachname: ");
        n = Console.readln();
        Console.print("Vorname:  ");
        v = Console.readln();
        Console.print("Telefon:  ");
        t = Console.readln();
        Console.print("Email:    ");
        e = Console.readln();
        
        k = new Kontakt(n, v, t, e);
        aBuch.einfügen(k);

        Console.println("Kontakt hinzugefügt.");
        Console.readln();
    }

    /*
     * Der Benutzer wird nach einem Namen gefragt.
     * Falls vorhanden, werden die Kontaktdaten zu diesem Namen ausgegeben.
     */
    public void kontaktDetails()
    {
        String name;
        Kontakt k;

        Console.println("\n== Kontaktdetails ==");
        Console.print("Nachname: ");
        name = Console.readln();

        k = aBuch.suchen(name);
        
        if (k != null)
        {
            Console.println(k.getNachname() + ", " + k.getVorname());
            Console.println("Telefon: " + k.getTelefon());
            Console.println("Email:   " + k.getEmail());
        }
        else
        {
            Console.println("Es gibt keinen Kontakt mit diesem Namen.");
        }
        Console.readln();
    }

    /*
     * Der Benutzer wird nach einem Namen gefragt.
     * Falls vorhanden, wird der entsprechende Kontakt aus dem Adressbuch gelöscht.
     */
    public void kontaktLöschen()
    {
        String name;

        Console.println("\n== Kontakt löschen ==");
        Console.print("Nachname: ");
        name = Console.readln();

        if (aBuch.löschen(name) == true)
        {
            Console.println("Kontakt " + name + " gelöscht.");
        }
        else
        {
            Console.println("Es gibt keinen Kontakt mit diesem Namen.");
        }
        Console.readln();
    }

    /*
     * Gibt das Hauptmenü aus
     */
    public void main()
    {
        int wahl;
        do
        {
            Console.clear();
            Console.println("== Adressbuch - Hauptmenü ==");
            Console.println("Wählen Sie einen der folgenden Punkte:");
            Console.println("1. Neuer Kontakt");
            Console.println("2. Kontakte auflisten");
            Console.println("3. Kontaktdetails");
            Console.println("4. Kontakt löschen");
            Console.println("5. Programm beenden");
            wahl = Console.readInt();
            
            if (wahl == 1)
            {
                kontaktAnlegen();
            }
            else if (wahl == 2)
            {
                aBuch.namenAusgeben();
            }
            else if (wahl == 3)
            {
                kontaktDetails();
            }
            else if (wahl == 4)
            {
                kontaktLöschen();
            }
            else if (wahl != 5)
            {
                Console.println("Falsche Eingabe"); 
            }
        } while (wahl != 5);

        Console.println("Auf Wiedersehen!");
    }
}
