import console.*;

public class Bank
{
    private Kunde kd1, kd2;
    private Konto kto1, kto2;
    private Depot dep1, dep2;

    public Bank()
    {
        kd1 = new Kunde("Frank");
        kd2 = new Kunde("Silvia");

        kto1 = new Konto(1);
        kto2 = new Konto(2);

        dep1 = new Depot("Siemens");
        dep2 = new Depot("Bosch");
    }

    public void anfangsWerte()
    {
        kd1.setKonto(kto1);
        kd2.setKonto(kto2);
        kd1.setDepot(dep1);
        kd2.setDepot(dep2);
        kto1.einzahlen(500.0);
        kto2.einzahlen(500.0);
        dep1.setKurs(100.0);
        dep2.setKurs(250.0);
    }

    public void kontoAktion(Kunde kd)
    {
        int wahl;
        double betrag;

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

        Console.println("Kunde: " + kd.getName());
        Console.println("Kontonummer: " + kto.getNummer() + " Kontostand: "  + kto.getStand());
        
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

    public void depotAktion(Kunde kd)
    {
        int wahl, anzahl;

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
        
        Console.println("Kunde: " + kd.getName());
        Console.println("Aktie: " + dep.getAktie() + " Anzahl: " + dep.getAnzahl() + " Kurs: " + dep.getKurs());
        
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
        anfangsWerte();

        Console.clear();
        // kontoAktion(kd1);
        depotAktion(kd1);

        kontoAktion(kd2);
        depotAktion(kd2);
    }
}
