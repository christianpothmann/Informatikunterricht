import console.*;

/*
 * Einfache Mitarbeiterverwaltung mit der Konsole
 * zur Übung von Referenzen
 * C. Pothmann, 07.05.2021
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
     * Anfangswerte für die Abteilungen
     */
    public void werteAbteilung()
    {
        ab1.setBezeichnung("Fertigung");
        ab2.setBezeichnung("Verkauf");
        ab1.setRaum(1);
        ab2.setRaum(2);
    }

    /*
     * Anfangswerte für die Mitarbeiter
     */
    public void werteMitarbeiter()
    {
        m1.setName("Martini");
        m2.setName("Özdemir");
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
    
    /*
     * Statt Anfangswerte für Mitarbeiter direkt zu setzen können diese auch vom Benutzer gesetzt werden
     * (als Zusatzaufgabe gedacht)
     */
    public void eingabeMitarbeiter(Mitarbeiter m)
    {
        String name, abt;
        double gehalt;
        Console.println("Wie heißt der Mitarbeiter?");
        name = Console.readln();
        m.setName(name);

        Console.println("Wie hoch ist sein Gehalt?");
        gehalt = Console.readDouble();
        m.setGehalt(gehalt);

        Console.println("In welcher Abteilung arbeitet " + m.getName() + "?");
        Console.println(ab1.getBezeichnung() + " oder " + ab2.getBezeichnung());
        Console.println("Falls er keiner Abteilung zugeordnet ist, drücken Sie Enter.");
        abt = Console.readln();

        if (abt.equals(ab1.getBezeichnung()))
        {
            m.setAbteilung(ab1);
        }
        if (abt.equals(ab2.getBezeichnung()))
        {
            m.setAbteilung(ab2);
        }
    }

    /*
     * Statt Vorgesetzte für Mitarbeiter direkt zu setzen können diese auch vom Benutzer gesetzt werden
     * (als Zusatzaufgabe gedacht)
     */
    public void zuordnungVorgesetzter(Mitarbeiter m)
    {
        String name;
        
        Console.println("Wer ist der Vorgesetzte von " + m.getName() + "?");
        if (m != m1) { Console.print(m1.getName() + ", "); }
        if (m != m2) { Console.print(m2.getName() + ", "); }
        if (m != m3) { Console.print(m3.getName() + ", "); }
        if (m != m4) { Console.print(m4.getName()); if (m != m5) Console.print(", "); }
        if (m != m5) { Console.print(m5.getName()); }
        Console.println();
        Console.println("Falls es keinen Vorgesetzten gibt, drücken Sie Enter.");

        name = Console.readln();
        if (name.equals(m1.getName()))
        {
            m.setVorgesetzter(m1);
        }
        if (name.equals(m2.getName()))
        {
            m.setVorgesetzter(m2);
        }
        if (name.equals(m3.getName()))
        {
            m.setVorgesetzter(m3);
        }
        if (name.equals(m4.getName()))
        {
            m.setVorgesetzter(m4);
        }
        if (name.equals(m5.getName()))
        {
            m.setVorgesetzter(m5);
        }        
    }

    /*
     * Gibt Daten zu einem Mitarbeiter (einschl. Abteilung und Vorgesetzter) aus
     */
    public void ausgabeMitarbeiter(Mitarbeiter m)
    {
        Abteilung abt;
        Mitarbeiter vg;

        Console.println("Mitarbeiterdaten");
        Console.println("Name: " + m.getName());
        Console.println("Gehalt: " + m.getGehalt());
        abt = m.getAbteilung();
        if (abt != null)
        {
            Console.println("Abteilung: " + abt.getBezeichnung());
            Console.println("Raum: " + abt.getRaum());
        }
        else
        {
            Console.println("Keiner Abteilung zugeordnet");
        }
        vg = m.getVorgesetzter();
        if (vg != null)
        {
            Console.println("Vorgesetzter: " + vg.getName());
        }
        else
        {
            Console.println("Hat keinen Vorgesetzten");
        }
    }

    /*
     * Hauptprogramm
     */
    public void main()
    {
        werteAbteilung();

        Console.clear();
        eingabeMitarbeiter(m1);
        eingabeMitarbeiter(m2);
        eingabeMitarbeiter(m3);
        eingabeMitarbeiter(m4);
        eingabeMitarbeiter(m5);
        
        Console.clear();
        zuordnungVorgesetzter(m1);
        zuordnungVorgesetzter(m2);
        zuordnungVorgesetzter(m3);
        zuordnungVorgesetzter(m4);
        zuordnungVorgesetzter(m5);
        
        Console.clear();
        ausgabeMitarbeiter(m1);
        ausgabeMitarbeiter(m2);
        ausgabeMitarbeiter(m3);
        ausgabeMitarbeiter(m4);
        ausgabeMitarbeiter(m5);
    }
}
