import console.*;

/*
 * Übungsaufgabe für das switch-Statement:
 * berechnet den Wochentag anhand eines gegebenen Datums.
 * C. Pothmann, 10.02.2017
 */
public class Wochentage
{
    /*
     * Berechnet den Wochentag (als String) anhand eines gegebenen Datums.
     * Das Datum muss nach dem 14.10.1582 liegen (ab da beginnt der Gregorianische Kalender).
     */
    public String wochentag(int tag, int monat, int jahr)
    {
        String ergebnis;
        int h, c, y;
        
        if (monat <= 2)
        {
            monat += 10;
            jahr -= 1;
        }
        else
        {
            monat -= 2;
        }

        c = jahr / 100;
        y = jahr % 100;
        h = ( ( (26*monat - 2) / 10 ) + tag + y + y/4 + c/4 - 2*c ) % 7;
        
        if (h < 0)
        {
            h += 7;
        }
        
        switch (h)
        {
            case 0:  ergebnis = "Sonntag";    break;
            case 1:  ergebnis = "Montag";     break;
            case 2:  ergebnis = "Dienstag";   break;
            case 3:  ergebnis = "Mittwoch";   break;
            case 4:  ergebnis = "Donnerstag"; break;
            case 5:  ergebnis = "Freitag";    break;
            case 6:  ergebnis = "Samstag";    break;
            default: ergebnis = "";           break;
        }
        
        return ergebnis;
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
