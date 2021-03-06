import console.*;

/*
 * Einfache Mitarbeiterverwaltung mit der Konsole
 * (Name, Datum)
 */
public class Firma
{
    private Mitarbeiter m1, m2, m3, m4, m5;
    private Abteilung ab1, ab2;
    
    public Firma()
    {
        m1 = new Mitarbeiter();
        m2 = new Mitarbeiter();
        m3 = new Mitarbeiter();
        m4 = new Mitarbeiter();
        m5 = new Mitarbeiter();
        ab1 = new Abteilung();
        ab2 = new Abteilung();
    }
    
    /*
     * Anfangswerte f?r die Abteilungen
     */
    public void werteAbteilung()
    {
        ab1.setBezeichnung("Fertigung");
        ab2.setBezeichnung("Verkauf");
        ab1.setRaum(1);
        ab2.setRaum(2);
    }

    /*
     * Anfangswerte f?r die Mitarbeiter
     */
    public void werteMitarbeiter()
    {
        m1.setName("Martini");
        m2.setName("?zdemir");
        m3.setName("Schmidt");
        m4.setName("Lehmann");
        m5.setName("Kaminski");
        m1.setGehalt(8000);
        m2.setGehalt(4000);
        m3.setGehalt(4000);
        m4.setGehalt(4000);
        m5.setGehalt(4000);
        
        m2.setAbteilung(ab1);
        m3.setAbteilung(ab1);
        m4.setAbteilung(ab2);
        m5.setAbteilung(ab2);

        m2.setVorgesetzter(m1);
        m3.setVorgesetzter(m2);
        m4.setVorgesetzter(m1);
        m5.setVorgesetzter(m4);
    }

    // Hier Methode ausgabeMitarbeiter() implementieren
    // ...

    /*
     * Hauptprogramm
     */
    public void main()
    {
        werteAbteilung();
        werteMitarbeiter();

        // Hier Mitarbeiterdaten ausgeben
        // ...
    }
}
