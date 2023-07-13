import console.*;

/*
 * Adressbuch (Musterlösung)
 * C. Pothmann, 06.03.2017
 * überarbeitet 29.06.2021
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
        Kontakt kAkt;
        aListe.toFirst();
        while (aListe.hasAccess())
        {
            kAkt = aListe.getContent();
            // falls der neue Name alphabetisch VOR dem aktuellen liegt, füge ein und beende die Methode
            if (pk.getNachname().compareTo(kAkt.getNachname()) < 0)
            {
                aListe.insert(pk);
                return;
            }
            aListe.next();
        }
        // falls der neue Name noch nicht eingefügt wurde, wird er ans Ende gehängt
        aListe.append(pk);
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
        while (aListe.hasAccess() == true)
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
