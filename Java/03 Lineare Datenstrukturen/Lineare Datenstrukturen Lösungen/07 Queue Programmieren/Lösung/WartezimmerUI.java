import console.*;

/*
 * Anwendung fuer Sprechstundenhilfe einer Arztpraxis zur Verwaltung der wartenden Patienten.
 * C. Pothmann, 08.05.2023
 */
public class WartezimmerUI
{
    private Wartezimmer wz;

    public WartezimmerUI()
    {
        wz = new Wartezimmer();
    }

    /*
     * Ein neuer Patient steht am Empfang.
     * Seine Daten werden ueber die Konsole eingegeben,
     * dann wird der Patient in die Warteschlange eingefuegt.
     */
    public void aufnehmen()
    {
        String name, kasse;
        Patient pat;

        Console.println("Neuen Patient aufnehmen");
        Console.print("Wie ist der Name? ");
        name = Console.readln();
        Console.print("Welche Krankenkasse hat " + name + " ? ");
        kasse = Console.readln();

        pat = new Patient(name, kasse);
        wz.einfuegen(pat);

        Console.println(name + " ins Wartezimmer aufgenommen.");
    }

    /*
     * Der naechste Patient kann vom Arzt behandelt werden.
     * Gibt den Namen des Patient am Anfang der Warteschlange aus entfernt ihn.
     */
    public void aufrufen()
    {
        Patient pat;

        Console.println("Patient aufrufen:");
        pat = wz.naechsterPatient();
        if (pat == null)
        {
            Console.println("Kein Patient in der Warteschlange.");
        }
        else
        {
            Console.println("Der naechste Patient ist " + pat.getName());
        }
    }

    /*
     * Gibt die Zahl der wartenden Patienten aus.
     */
    public void status()
    {
        int a;
        
        Console.println("Status des Wartezimmers:");
        a = wz.anzahl();
        if (a == 0)
        {
            Console.println("Das Wartezimmer ist leer.");
        }
        else
        {
            Console.println("Es warten " + a + " Patienten.");
        }
    }

    /*
     * Ermoeglicht, einen Patienten vor der Behandlung aus der Warteschlange zu entfernen
     */
    public void entfernen()
    {
        String name;
        
        Console.println("Patient aus der Warteschlange entfernen:");
        Console.println("Geben Sie den Namen des Patienten ein.");
        name = Console.readln();
        
        if (wz.loeschen(name) == true)
        {
            Console.println("Patient " + name + " wurde aus der Warteschlange entfernt.");
        }
        else
        {
            Console.println("Der Patient " + name + " konnte nicht gefunden werden.");
        }
    }

    /*
     * Leert die Warteschlange
     */
    public void beenden()
    {
        wz.alleLoeschen();
        Console.println("Programm beendet. Bitte schliessen Sie die Konsole.");        
    }

    /*
     * Hauptprogramm:
     * Zeigt in einer Endlosschleife ein Menue mit den Moeglichkeiten des Programms an.
     * Der Benutzer (Sprechstundenhilfe) kann jeweils eine Moeglichkeit auswaehlen.
     */
    public void main()
    {
        int wahl;

        do
        {
            Console.clear();
            Console.println("===========================");
            Console.println("=== Wartezimmer - Menue ===");
            Console.println("===========================");
            Console.println("Bitte waehlen Sie:");
            Console.println("1: Neuen Patienten aufnehmen");
            Console.println("2: Patient zum Behandeln aufrufen");
            Console.println("3: Status des Wartezimmers");
            Console.println("4: Patient vorzeitig entlassen");
            Console.println("5: Programm beenden");
            Console.println();

            wahl = Console.readInt();
            Console.clear();

            if (wahl == 1)
            {
                aufnehmen();
            }
            else if (wahl == 2)
            {
                aufrufen();
            }
            else if (wahl == 3)
            {
                status();
            }
            else if (wahl == 4)
            {
                entfernen();
            }
            else if (wahl == 5)
            {
                beenden();
            }
            else
            {
                Console.println("Ungueltige Eingabe.");
            }
            Console.readln();
            
        } while (wahl != 5);
    }
}