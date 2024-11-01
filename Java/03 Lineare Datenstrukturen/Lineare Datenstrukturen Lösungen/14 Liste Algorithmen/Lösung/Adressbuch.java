import console.*;

/*
 * Alphabetisch sortiertes Adressbuch (Musterlösung)
 * C. Pothmann, 06.03.2017
 * überarbeitet 29.06.2021, 31.10.2024
 */
public class Adressbuch
{
    private List<Kontakt> aListe;

    public Adressbuch()
    {
        aListe = new List();
    }

    /*
     * Der Kontakt pk wird am Ende der Liste eingefügt.
     */
    public void einfügen(Kontakt pk)
    {
        aListe.append(pk);
    }

    /*
     * Der Kontakt pk wird am Ende der Liste eingefügt.
     */
    public void einfügenAlph(Kontakt pk)
    {
        Kontakt kAkt;
        aListe.toFirst();
        while (aListe.hasAccess())
        {
            kAkt = aListe.getContent();
            // falls der neue Name alphabetisch VOR dem aktuellen liegt, füge ein und beende die Methode
            if (pk.getNachname().compareTo(kAkt.getNachname()) < 0)
            {
                aListe.insert(pk);
                break;
            }
            aListe.next();
        }
        // falls der neue Name noch nicht eingefügt wurde, wird er ans Ende gehängt
        if (!aListe.hasAccess())
        {
            aListe.append(pk);
        }
    }

    /*
     * Sucht einen Kontakt anhand des Nachnames aus der Liste.
     * Falls der Kontakt existiert, wird er zurückgegeben, sonst null.
     */
    public Kontakt suchen(String pname)
    {
        Kontakt kAkt;

        // gehe die Liste von Anfang bis Ende durch
        aListe.toFirst();
        while (aListe.hasAccess())
        {
            kAkt = aListe.getContent();
            // vergleiche den aktuellen Namen der Liste mit dem gesuchten Namen
            if (pname.equals(kAkt.getNachname()))
            {
                // Name gefunden -> gib Kontakt zurück und beende die Methode
                return kAkt;
            }
            // falls der gesuchte Name alphabetisch VOR dem aktuellen liegt,
            // ist die Schleife "vorbeigelaufen", d.h. der Name ist nicht in der Liste.
            if (pname.compareTo(kAkt.getNachname()) < 0)
            { 
                return null;
            }
            aListe.next();
        }
        // wenn die Schleife endet, wurde der Name nicht gefunden
        return null;
    }

    /*
     * Sucht einen Kontakt anhand des Nachnames aus der Liste.
     * Falls der Kontakt existiert, wird er zurückgegeben, sonst null.
     */
    public boolean löschen(String pName)
    {
        Kontakt kAkt;
        // gehe die Liste von Anfang bis Ende durch
        aListe.toFirst();
        while (aListe.hasAccess())
        {
            kAkt = aListe.getContent();
            // vergleiche den aktuellen Namen der Liste mit dem gesuchten Namen
            if (pName.equals(kAkt.getNachname()))
            {
                // Name gefunden -> löschen den Kontakt und beende die Methode
                aListe.remove();
                return true;
            }
            aListe.next();
        }
        // wenn die Schleife endet, wurde der Name nicht gefunden
        return false;
    }

    /*
     * Gibt alle Namen der Liste auf der Konsole aus.
     */
    public void namenAusgeben()
    {
        Kontakt kAkt;
        int anzahl;

        anzahl = 0;
        aListe.toFirst();
        while (aListe.hasAccess())
        {
            kAkt = aListe.getContent();
            Console.println(kAkt.getNachname() + " " + kAkt.getVorname());
            aListe.next();
            anzahl++;
        }
        Console.println("(" + anzahl + " Kontakte im Adressbuch.)");
        Console.readln();
    }
    
    /*
     * Sortiert die Kontaktliste nach den Nachnamen
     * (mithilfe des Selection Sort)
     */
    public void sortieren()
    {
        int i, anfang;
        Kontakt kMin, kAkt;

        // anfang gibt an, wie viele Elemente schon richtig einsortiert sind
        anfang = 0;
        aListe.toFirst();
        
        // Die äußere Schleife führt die Suche nach dem Minimum mehrmals aus.
        while (aListe.hasAccess())
        {
            // Die Suche beginnt nach den schon sortierten Kontakten.
            // Am Ende der äußeren Schleife wird bis dort "vorgespult".
            // Der Kontakt an dieser Stelle wird als Minimum angenommen.
            kMin = aListe.getContent();

            // Die restliche Liste wird nach dem Minimum durchsucht.
            aListe.next();
            while (aListe.hasAccess())
            {
                kAkt = aListe.getContent();
                if (kAkt.getNachname().compareTo(kMin.getNachname()) < 0)
                {
                    kMin = kAkt;
                }
                aListe.next();
            }

            // Das Minimum wird erneut gesucht und aus der Liste entfernt.
            aListe.toFirst();
            while (kMin != aListe.getContent())
            {
                aListe.next();
            }
            aListe.remove();

            // füge das Minimum an der richtigen Stelle ein
            // beim nächsten Durchlauf der äußeren Schleife beginnt die Suche an dieser Stelle
            aListe.toFirst();
            for (i = 0; i < anfang; i++)
            {
                aListe.next();
            }
            if (aListe.hasAccess())
            {
                aListe.insert(kMin);
            }
            else
            {
                aListe.append(kMin);
            }

            // erhöhe die Anzahl der bereits sortierten Elemente
            anfang++;
        }
    }
}   
