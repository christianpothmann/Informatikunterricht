import console.*;

/*
 * Benutzerschnittstelle für das Adressbuch mit der Konsole
 * C. Pothmann, 30.06.2021
 */
public class AdressVerwaltung
{
    private Adressbuch aBuch;        // das Adressbuch
    private List<Kontakt> sListe;    // Liste zum Speichern der Kontakte

    public AdressVerwaltung()
    {
        aBuch = new Adressbuch();
        sListe = new List();
    }

    /*
     * Fügt einige Namen als Grundstock ins Adressbuch ein
     * (nur, falls das Adressbuch leer ist)
     */
    public void beispielDaten()
    {
        int i;
        String[][] daten = { 
            { "Matisse", "Henri", "0171-234567", "matisse@mail.de" },
            { "Cézanne", "Paul", "0221-123456", "cezannes@gmail.com" },
            { "Renoir", "Auguste", "0221-345678", "renoir@gmx.net" },
            { "Beuys", "Joseph", "0177-765432", "beuys@web.de"},
            { "Marc", "Franz", "0221-827364", "marc@yahoo.de"},
            { "Monet", "Claude", "0151-987654", "monet@email.de"},
            { "Van Gogh", "Vincent", "0221-657483", "vangogh@gmx.de"},
            { "Gauguin", "Paul", "0163-135792", "gauguin@yahoo.fr"},
            { "Picasso", "Pablo", "0172-773388", "picasso@gmail.com"},
            { "Turner", "William", "0221-981274", "turner@yahoo.co.uk"}, 
            { "Dalí", "Salvatore", "0221-445566", "dali@web.de"},
            { "Kandinsky", "Wassily", "0175-123456", "kandinsky@email.de"},
            { "Klee", "Paul", "0221-654321", "klee@gmx.de"} };

        if (aBuch.istLeer())
        {
            for (i = 0; i < daten.length; i++)
            {
                Kontakt k = new Kontakt(daten[i][0], daten[i][1], daten[i][2], daten[i][3]);
                aBuch.einfügen(k);
            }
            Console.println("\nBeispieldaten ins Adressbuch geladen.");
        }
        else
        {
            Console.println("Nur möglich, wenn das Adressbuch leer ist.");
        }
        Console.readln();
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
     * Gibt Nachnamen und Vornamen aus sowie die Anzahl der Kontakte.
     */
    public void kontakteAusgeben()
    {
        aBuch.namenAusgeben();
        Console.println("Es sind " + aBuch.getAnzahl() + " Kontakte im Adressbuch enthalten.");
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
     * Fügt alle Kontakte des Adressbuch in eine Liste ein.
     */
    public void kontakteSpeichern()
    {
        Kontakt k;

        sListe = aBuch.listeSpeichern();

        Console.println("\nFolgende Kontakte wurde gespeichert:");
        if (sListe.isEmpty())
        {
            Console.println("(keine)");
        }
        else
        {
            sListe.toFirst();
            while (sListe.hasAccess())
            {
                k = sListe.getContent();
                Console.println(k.getNachname() + ", " + k.getVorname());
                sListe.next();
            }
        }
        Console.readln();
    }

    /*
     * Das Adressbuch wird aus der gespeicherten Liste neu aufgebaut.
     */
    public void kontakteLaden()
    {
        char wahl;
        
        Console.println();
        // Falls die Liste leer ist, kommt eine Sicherheitsabfrage
        // (vermutlich wurde das Adressbuch nicht in der Liste gespeichert)
        if (sListe.isEmpty())
        {
            Console.println("Die Liste ist leer. Falls das Adressbuch Kontakte enthält, werden diese gelöscht.");
            Console.println("Möchten Sie fortfahren? (j/n)");
            wahl = Console.readChar();
            if (wahl != 'j')
            {
                Console.println("Funktion abgebrochen.");
                Console.readln();
                return;
            }
        }
        
        aBuch.listeLaden(sListe);
        Console.println("Das Adressbuch wurde aus der Liste neu geladen.");
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
            Console.println("1. Beispieldaten einfügen");
            Console.println("2. Neuer Kontakt");
            Console.println("3. Kontakte auflisten");
            Console.println("4. Kontaktdetails");
            Console.println("5. In Liste speichern");
            Console.println("6. Aus Liste laden");
            Console.println("7. Programm beenden");
            wahl = Console.readInt();
            
            switch (wahl)
            {
                case 1: beispielDaten();     break;
                case 2: kontaktAnlegen();    break;
                case 3: kontakteAusgeben();  break;
                case 4: kontaktDetails();    break;
                case 5: kontakteSpeichern(); break;
                case 6: kontakteLaden();     break;
                case 7: break;
                default: Console.println("Falsche Eingabe");  break;
            }
        } while (wahl != 7);

        Console.println("Auf Wiedersehen!");
    }
}
