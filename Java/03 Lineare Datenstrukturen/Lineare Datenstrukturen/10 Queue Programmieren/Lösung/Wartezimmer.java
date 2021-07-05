import console.*;

/*
 * Anwendung fuer Sprechstundenhilfe einer Arztpraxis zur Verwaltung der wartenden Patienten.
 * C. Pothmann, 22.01.2020
 */
public class Wartezimmer
{
    private Queue<Patient> queue;
    private int nummer;

    public Wartezimmer()
    {
        queue  = new Queue();
        nummer = 0;
    }

    /*
     * Ein neuer Patient steht am Empfang.
     * Sein Name wird erfragt und in die Konsole eingegeben,
     * dann wird der Patient in die Warteschlange eingefuegt.
     * Die Ankunfts-Nummer wird automatisch hochgezaehlt.
     */
    public void anstellen()
    {
        String name;
        Patient pat;

        Console.println("Neuer Patient: Wie ist der Name?");
        name = Console.readln();
        nummer = nummer + 1;

        pat = new Patient(name, nummer);
        queue.enqueue(pat);

        Console.println("Patient " + name + " steht in der Schlange mit Nummer " + nummer + ".");
    }

    /*
     * Der naechste Patient kann vom Arzt behandelt werden.
     * Gibt den Namen des Patient am Anfang der Warteschlange aus entfernt ihn.
     */
    public void aufrufen()
    {
        Patient pat;

        Console.println("Patient aufrufen:");
        if (queue.isEmpty())
        {
            Console.println("Kein Patient in der Warteschlange.");
        }
        else
        {
            pat = queue.front();
            Console.println("Der naechste Patient ist " + pat.getName());
            queue.dequeue();
        }
    }

    /*
     * Hauptprogramm:
     * Zeigt in einer Endlosschleife ein Men? mit den M?glichkeiten des Programms an.
     * Der Benutzer (Sprechstundenhilfe) kann jeweils eine M?glichkeit auswaehlen.
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
            Console.println("3: Programm beenden");
            Console.println();

            wahl = Console.readInt();
            Console.clear();

            if (wahl == 1)
            {
                anstellen();
            }
            else if (wahl == 2)
            {
                aufrufen();
            }
            else if (wahl == 3)
            {
                Console.println("Programm beendet. Bitte schliessen Sie die Konsole.");
            }
            else
            {
                Console.println("Ungueltige Eingabe.");
            }

            Console.readln();
        } while (wahl != 6);
    }
}