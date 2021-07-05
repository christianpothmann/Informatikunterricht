import console.*;
/*
 * Adressbuch (Musterlösung)
 * Zur Übung: Ändere die main-Methode so dass statt if-else ein switch-Befehl verwendet wird.
 * (Name, Datum)
 */
public class Adressbuch
{
    private List<Kontakt> adressListe;

    public Adressbuch()
    {
        adressListe = new List();
    }

    /*
     * Gibt das Hauptmenü aus
     */
    public void main()
    {
        int wahl = 0;
        while (wahl != 4)
        {
            Console.clear();
            Console.println("== Adressbuch - Hauptmenü ==");
            Console.println("Wählen Sie einen der folgenden Punkte:");
            Console.println("1. Neuer Kontakt");
            Console.println("2. Kontakte auflisten");
            Console.println("3. Kontaktdetails");
            Console.println("4. Programm beenden");
            wahl = Console.readInt();
            
            if (wahl == 1)
            {
                kontaktAnlegen();
            }
            else if (wahl == 2)
            {
                kontakteAuflisten();
            }
            else if (wahl == 3)
            {
                kontaktDetails();
            }
            else if (wahl != 4)
            {
                Console.println("Falsche Eingabe"); 
            }
        }
        Console.println("Auf Wiedersehen!");
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
        n = Console.readString();
        Console.print("Vorname:  ");
        v = Console.readString();
        Console.print("Telefon:  ");
        t = Console.readString();
        Console.print("Email:    ");
        e = Console.readString();
        
        k = new Kontakt(n, v, t, e);
        adressListe.append(k);

        Console.println("Kontakt hinzugefügt.");
        Console.readln();
    }

    /*
     * Gibt alle Namen der Liste auf der Konsole aus.
     */
    public void kontakteAuflisten()
    {
        int anzahl = 0;
        adressListe.toFirst();
        // gehe die Liste von Anfang bis Ende durch
        while (adressListe.hasAccess() == true)
        {
            Kontakt k = adressListe.getContent();
            Console.println(k.getNachname() + " " + k.getVorname());
            adressListe.next();
            anzahl++;
        }
        Console.println("(" + anzahl + " Kontakte im Adressbuch.)");
        Console.readln();
    }     

    /*
     * Der Benutzer wird nach einem Namen gefragt.
     * Die Methode gibt die Kontaktdaten für diesen Namen aus.
     */
    public void kontaktDetails()
    {
        String name;
        Kontakt k = null;

        Console.println("\n== Kontaktdetails ==");
        Console.print("Nachname: ");
        name = Console.readString();

        adressListe.toFirst();
        // gehe die Liste von Anfang bis Ende durch
        while (adressListe.hasAccess() == true)
        {
            k = adressListe.getContent();
            // vergleiche den aktuellen Namen der Liste mit dem gesuchten Namen
            if (name.equals(k.getNachname()))
            {
                break; // mit "break" wird die while-Schleife beendet
            }
            adressListe.next();
        }

        // nach der while-Schleife:
        // Falls ein Kontakt gefunden wurde, wird er ausgegeben, sonst eine Fehlermeldung.
        if (adressListe.hasAccess())
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
}   

