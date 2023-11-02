import console.*;

public class Bank
{
    private Kunde kd1, kd2, kd3;
    private Konto kto1, kto2, kto3;
    private Depot dep1, dep2;

    public Bank()
    {
        kd1 = new Kunde("Dennis");
        kd2 = new Kunde("Kiara");
        kd3 = new Kunde("Salome");

        kto1 = new Konto(1001);
        kto2 = new Konto(1002);
        kto3 = new Konto(1003);

        dep1 = new Depot("Siemens");
        dep2 = new Depot("Bosch");
    }

    public void anfangsWerte()
    {
        kd1.setKonto(kto1);
        kd2.setKonto(kto2);
        kd3.setKonto(kto3);

        kd1.setDepot(dep1);
        kd3.setDepot(dep2);
        
        kto1.einzahlen(500.0);
        kto2.einzahlen(500.0);
        kto3.einzahlen(500.0);
        
        dep1.setKurs(100.0);
        dep2.setKurs(75.0);
    }

    public Kunde kundeWaehlen()
    {
        String name;
        boolean gefunden = false;
        
        Console.clear();
        
        while (!gefunden)
        {
            Console.println("Bitte geben Sie Ihren Namen ein:");
            name = Console.readString();
        
            if (name.equals(kd1.getName()))
            {
                return kd1;
            }
            else if (name.equals(kd2.getName()))
            {
                return kd2;
            }
            else if (name.equals(kd3.getName()))
            {
                return kd3;
            }
            else
            {
                Console.println("Kein Kunde mit diesem Namen");
            }
        }
        return null;
    }

    public void kontoBearbeiten(Kunde kd)
    {
        int wahl;
        double betrag;

        // Sonderfälle zur Sicherheit abfragen
        if (kd == null)
        {
            return;
        }

        Konto kto = kd.getKonto();
        if (kto == null)
        {
            Console.println("Kein Konto vorhanden.");
            Console.readln();
            return;
        }

        // Kontendaten ausgeben
        Console.println("Kunde: " + kd.getName());
        Console.println("Kontonummer: " + kto.getNummer() + " Kontostand: "  + kto.getStand());
        
        // Einzahlen oder Abheben
        Console.print("Möchten Sie einzahlen (1) oder abheben (2)? ");
        wahl = Console.readInt();
        if (wahl == 1)
        {
            Console.print("Welchen Betrag einzahlen? ");
            betrag = Console.readDouble();
            if (betrag <= 0.0)
            {
                Console.println("Kein negativer Betrag möglich.");
            }
            else
            {
                kto.einzahlen(betrag);
            }
        }
        else if (wahl == 2)
        {
            Console.print("Welchen Betrag abheben? ");
            betrag = Console.readDouble();
            if (betrag > kto.getStand())
            {
                Console.println("So viel Geld haben Sie nicht.");
            }
            else
            {
                kto.abheben(betrag);
            }
        }
        else
        {
            Console.println("Falsche Eingabe");
        }

        Console.println("Neuer Kontostand: " + kto.getStand());
        Console.readln();
    }

    public void depotBearbeiten(Kunde kd)
    {
        int wahl, anzahl;

        // Sonderfälle abfragen
        if (kd == null)
        {
            return;
        }
        
        Konto kto = kd.getKonto();
        Depot dep = kd.getDepot();

        if (kto == null || dep == null)
        {
            Console.println("Kein Konto bzw. Depot vorhanden.");
            Console.readln();
            return;
        }
        
        // Konto- und Depotdaten ausgeben
        Console.println("Kunde: " + kd.getName());
        Console.println("Kontonummer: " + kto.getNummer() + " Kontostand: "  + kto.getStand());
        Console.println("Aktie: " + dep.getAktie() + " Anzahl: " + dep.getAnzahl() + " Kurs: " + dep.getKurs());
        
        // Kaufen oder verkaufen
        Console.print("Möchten Sie kaufen (1) oder verkaufen (2)? ");
        wahl = Console.readInt();
        if (wahl == 1)
        {
            Console.print("Wie viele Anteile? ");
            anzahl = Console.readInt();
            if (anzahl * dep.getKurs() > kto.getStand())
            {
                Console.println("Kontostand reicht nicht aus.");
            }
            else
            {
                dep.kaufen(anzahl);
                kto.abheben(anzahl * dep.getKurs());
                Console.println("Anteile gekauft, " + anzahl * dep.getKurs() + " abgehoben.");
            }
        }
        else if (wahl == 2)
        {
            Console.println("Wie viele Anteile?");
            anzahl = Console.readInt();
            if (anzahl > dep.getAnzahl())
            {
                Console.println("So viele Anteile haben Sie nicht.");
            }
            else
            {
                dep.verkaufen(anzahl);
                kto.einzahlen(anzahl * dep.getKurs());
                Console.println("Anteile verkauft, " + anzahl * dep.getKurs() + " eingezahlt.");
            }            
        }
        else
        {
            Console.println("Falsche Eingabe");
        }
        
        Console.readln();
    }

    public void main()
    {
        Kunde kd;
        int wahl;
        boolean weiter;
        char c;

        anfangsWerte();
    
        do
        {
            Console.clear();
            kd = kundeWaehlen();
            
            if (kd.hatDepot())
            {
                Console.println("Konto (1) oder Depot (2) bearbeiten?");
                wahl = Console.readInt();
                if (wahl == 1)
                {
                    kontoBearbeiten(kd);
                }
                else if (wahl == 2)
                {
                    depotBearbeiten(kd);
                }
                else
                {
                    Console.println("Falsche Eingabe");
                }
            }
            else
            {
                kontoBearbeiten(kd);                
            }
            
            Console.println("Mit weiterem Kunden fortfahren? (j/n)");
            c = Console.readChar();
            if (c == 'j')
            {
                weiter = true;
            }
            else
            {
                weiter = false;
            }
        } while (weiter == true);
    }
}

