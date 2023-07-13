/*
 * Implementiert Funktionen, um Patienten in einer Warteschlange zu verwalten.
 * (Autor, Datum)
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
        // Diese Methode implementieren.
    }

    /*
     * Entfernt den Patient am Anfang der Warteschlange und gibt ihn zurueck.
     */
    public Patient naechsterPatient()
    {
        // Diese Methode implementieren.
    }

    /*
     * Alle Patienten werden aus der Warteschlange entfernt.
     */
    public void alleLoeschen()
    {
        // Diese Methode implementieren.
    }
    
    /*
     * Gibt die Anzahl der in der Queue wartenden Patienten zurueck.
     */
    public int anzahl()
    {
        // Diese Methode implementieren.
    }
    
    /*
     * Der Patient mit Namen "pName" wird aus der Warteschlange entfernt.
     * Zur Vereinfachung wird angenommen, dass Namen nicht mehrfach vorkommen.
     * Falls der Patient gefunden und geloescht wurde, wird true zurueckgegeben, sonst false.
     */
    public boolean loeschen(String pName)
    {
        // Diese Methode implementieren.
    }
}