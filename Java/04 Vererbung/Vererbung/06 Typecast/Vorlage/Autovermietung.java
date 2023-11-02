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

    public void datenAusgeben()
    {
        Fahrzeug f;
        int i;
        
        i = 1;
        fListe.toFirst();
        while (fListe.hasAccess())
        {
            f = fListe.getContent();
            Console.println("Fahrzeug " + i + ":");
            Console.println("Kennzeichen: " + f.getKennzeichen());
            Console.println("Gemietet für " + f.getTage() + " Tage");
            Console.println("Gefahrene km: " + f.getKm());
            Console.println("Gesamtpreis: " + f.getGesamtPreis());
            Console.println();
            fListe.next();
            i++;
        }
    }

    public void main()
    {
        objekteErzeugen();

        Console.clear();
        datenAusgeben();
    }
}
