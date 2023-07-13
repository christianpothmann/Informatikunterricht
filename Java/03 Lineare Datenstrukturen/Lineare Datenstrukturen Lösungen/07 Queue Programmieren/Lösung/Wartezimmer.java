/*
 * Implementiert Funktionen, um Patienten in einer Warteschlange zu verwalten.
 * C. Pothmann, 08.05.2023
 */
public class Wartezimmer
{
    private Queue<Patient> queue;

    public Wartezimmer()
    {
        queue  = new Queue();
    }

    /*
     * Patient in die Warteschlange eingefuegt.
     */
    public void einfuegen(Patient pPat)
    {
        queue.enqueue(pPat);
    }

    /*
     * Entfernt den Patient am Anfang der Warteschlange und gibt ihn zurueck.
     */
    public Patient naechsterPatient()
    {
        Patient pat;

        if (queue.isEmpty())
        {
            return null;
        }
        else
        {
            pat = queue.front();
            queue.dequeue();
            return pat;
        }
    }

    /*
     * Alle Patienten werden aus der Warteschlange entfernt.
     */
    public void alleLoeschen()
    {
        while (!queue.isEmpty())
        {
            queue.dequeue();
        }
    }
    
    /*
     * Gibt die Anzahl der in der Queue wartenden Patienten zurueck.
     */
    public int anzahl()
    {
        Patient erster, pat;
        int anzahl;

        if (queue.isEmpty())
        {
            return 0;
        }
        else
        {
            erster = queue.front();
            anzahl = 0;

            do {
                pat = queue.front();
                queue.dequeue();
                queue.enqueue(pat);
                anzahl++;
            }  while (queue.front() != erster);
        }
        
        return anzahl;
    }
    
    /*
     * Der Patient mit Namen "pName" wird aus der Warteschlange entfernt.
     * Zur Vereinfachung wird angenommen, dass Namen nicht mehrfach vorkommen.
     * Falls der Patient gefunden und geloescht wurde, wird true zurueckgegeben, sonst false.
     */
    public boolean loeschen(String pName)
    {
        Patient pat, erster;
        boolean geloescht = false;

        // Sonderfall 1: Schlange leer
        if (queue.isEmpty())
        {
            return false;
        }
        else
        {
            // Sonderfall 2: der erste Patient ist der gesuchte
            if (queue.front().getName().equals(pName))
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

                    // Patient nur wieder einfuegen, wenn's nicht der zu loeschende ist
                    if (pat.getName().equals(pName))
                    {
                        geloescht = true;
                    }
                    else
                    {
                        queue.enqueue(pat);
                    }
                } while (queue.front() != erster);
            }
        }  // Queue nicht leer
        
        return geloescht;
    }
}