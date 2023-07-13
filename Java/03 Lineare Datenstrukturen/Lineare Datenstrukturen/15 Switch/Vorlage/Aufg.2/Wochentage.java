import console.*;

/*
 * Übungsaufgabe für das switch-Statement:
 * Berechnet den Wochentag anhand eines gegebenen Datums.
 * (Name, Datum)
 */
public class Wochentage
{
    /*
     * Berechnet den Wochentag (als String) anhand eines gegebenen Datums.
     * Das Datum muss nach dem 14.10.1582 liegen (ab da beginnt der Gregorianische Kalender).
     */
    public String wochentag(int tag, int monat, int jahr)
    {
        // ...
    }
    
    /*
     * Fragt den Benutzer nach einem Datum und gibt den Wochentag aus.
     */
    public void main()
    {
        int t, m, j;
        String wt;
        
        Console.clear();
        Console.println("Berechnen des Wochentags. Geben Sie ein Datum ein.");
        Console.print("Tag: ");
        t = Console.readInt();
        Console.print("Monat: ");
        m = Console.readInt();
        Console.print("Jahr: ");
        j = Console.readInt();
        
        wt = wochentag(t, m, j);
        
        Console.println("Der " + t + "." + m + "." + j + " ist ein " + wt + ".");
    }
}
