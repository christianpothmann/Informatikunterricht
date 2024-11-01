import console.*;

/*
 * Adressbuch
 * (Name, Datum)
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
     * Der Kontakt pk wird alphabetisch sortiert eingefügt.
     */
    public void einfügenAlph(Kontakt pk)
    {
        // ... hier implementieren ...
    }

    /*
     * ... Diese Methode verändern ...
     * 
     * Sucht einen Kontakt anhand des Nachnames aus der Liste.
     * Falls der Kontakt existiert, wird er zurückgegeben, sonst null.
     */
    public Kontakt suchen(String pName)
    {
        Kontakt kAkt;
        // gehe die Liste von Anfang bis Ende durch
        aListe.toFirst();
        while (aListe.hasAccess() == true)
        {
            kAkt = aListe.getContent();
            // vergleiche den aktuellen Namen der Liste mit dem gesuchten Namen
            if (pName.equals(kAkt.getNachname()))
            {
                // Name gefunden -> gib Kontakt zurück und beende die Methode
                return kAkt;
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
        while (aListe.hasAccess() == true)
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
        while (aListe.hasAccess() == true)
        {
            kAkt = aListe.getContent();
            Console.println(kAkt.getNachname() + " " + kAkt.getVorname());
            aListe.next();
            anzahl++;
        }
        Console.println("(" + anzahl + " Kontakte im Adressbuch.)");
        Console.readln();
    }     
}