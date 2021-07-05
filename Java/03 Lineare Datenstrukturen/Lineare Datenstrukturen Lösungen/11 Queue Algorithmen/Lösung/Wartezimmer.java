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
     * Alle Patienten werden aus der Warteschlange entfernt.
     * Die Ankunftsnummer wird auf 0 zurueckgesetzt.
     */
    public void leeren()
    {
        while (!queue.isEmpty())
        {
            queue.dequeue();
        }
        nummer = 0;
        Console.println("Alle Patienten wurden aus der Warteschlange entfernt.");
    }

    /*
     * Alle Patienten und deren Anzahl werden auf der Konsole ausgegeben.
     */
    public void ausgeben()
    {
        Patient pat, erster;
        int anzahl;

        Console.println("Warteschlange ausgeben:");
        if (queue.isEmpty())
        {
            Console.println("Kein Patient in der Warteschlange.");
        }
        else
        {
            erster = queue.front();
            anzahl = 0;

            do {
                pat = queue.front();
                Console.println(pat.getName() + ", " + pat.getAnkunft());
                queue.enqueue(pat);
                queue.dequeue();
                anzahl++;
            }  while (queue.front() != erster);

            Console.println("Anzahl: " + anzahl + " Patienten");
        }
    }

    /*
     * Ein Patient wird aus der Warteschlange entfernt.
     * Zunaechst muss der Name eingegeben werden. 
     * Vereinfachende Annahme: Jeder Name max. 1x in der Queue.
     */
    public void loeschen()
    {
        String name;
        Patient pat, erster;
        boolean geloescht = false;  // ggf. f?r Ausgabe "nicht enthalten"

        Console.println("Patient l?schen:");

        // Sonderfall 1: Schlange leer
        if (queue.isEmpty())
        {
            Console.println("Kein Patient in der Warteschlange.");
        }
        else
        {
            Console.println("Welcher Patient soll gel?scht werden?");
            name = Console.readln();

            // Sonderfall 2: der erste Patient ist der gesuchte
            if (queue.front().getName().equals(name))
            {
                queue.dequeue();
                geloescht = true;
            }
            else
            {
                erster = queue.front();
                do
                {
                    pat = queue.front();
                    queue.dequeue();

                    // Patient nur wieder einf?gen, wenn's nicht der zu l?schende ist
                    if (pat.getName().equals(name))
                    {
                        geloescht = true;
                    }
                    else
                    {
                        queue.enqueue(pat);
                    }
                } while (queue.front() != erster);
            }

            // Sonderfall 3: Patient nicht in der Warteschlange
            if (geloescht == true)
            {
                Console.println(name + " aus der Warteschlange entfernt.");
            }
            else
            {
                Console.println(name + " nicht in der Warteschlange.");
            }
        }  // Queue nicht leer
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
            Console.println("3: Warteschlange leeren");
            Console.println("4: Alle Patienten ausgeben");
            Console.println("5: Einzelnen Patienten entfernen");
            Console.println("6: Programm beenden");
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
                leeren();
            }
            else if (wahl == 4)
            {
                ausgeben();
            }
            else if (wahl == 5)
            {
                loeschen();
            }
            else if (wahl == 6)
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