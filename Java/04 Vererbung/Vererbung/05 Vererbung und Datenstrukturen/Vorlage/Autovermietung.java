import console.*;

public class Autovermietung
{
    private List<Fahrzeug> fListe;

    public Autovermietung()
    {
        fListe = new List();
    }

    public void objekteErzeugen()
    {
        PKW pkw;
        LKW lkw;
        Bus bus;

        pkw = new PKW("K-FC 123");
        pkw.setTagesPreis(40.0);
        pkw.setWochenPreis(200.0);
        pkw.setNavi(true);
        pkw.mieten(10);
        pkw.fahren(500.0);
        fListe.append(pkw);

        pkw = new PKW("K-AB 789");
        pkw.setTagesPreis(50.0);
        pkw.setWochenPreis(300.0);
        pkw.setNavi(false);
        pkw.mieten(21);
        pkw.fahren(800.0);
        fListe.append(pkw);

        lkw = new LKW("K-MN 456");
        lkw.setTagesPreis(70.0);
        lkw.setKmPreis(0.75);        
        lkw.mieten(7);
        lkw.fahren(1000.0);
        fListe.append(lkw);

        bus = new Bus("K-XY 390", 50);
        bus.setTagesPreis(400.0);
        bus.mieten(3);
        bus.fahren(2000.0);
        bus.setGereinigt(false);
        fListe.append(bus);
    }
    /*
     * Gibt zu jedem Fahrzeug das Kennzeichen, die gemieteten Tage,
     * gefahrenen km und den Gesamtpreis aus.
     */
    public void datenAusgeben()
    {
        // ... diese Methode implementieren ...
    }

    public void main()
    {
        objekteErzeugen();

        Console.clear();
        datenAusgeben();
    }
}
