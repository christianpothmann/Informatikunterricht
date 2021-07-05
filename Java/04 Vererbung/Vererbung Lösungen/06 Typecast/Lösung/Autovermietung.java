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
            Console.print("Fahrzeug " + i + " (");

            if (f.getClass() == PKW.class) { Console.println("PKW)"); }
            if (f.getClass() == LKW.class) { Console.println("LKW)"); }
            if (f.getClass() == Bus.class) { Console.println("Bus)"); }
            
            Console.println("Kennzeichen: " + f.getKennzeichen());
            Console.println("Gemietet für " + f.getTage() + " Tage");
            Console.println("Gefahrene km: " + f.getKm());
            
            if (f.getClass() == PKW.class)
            {
                PKW p = (PKW)f;
                Console.println("Wochenpreis: " + p.getWochenPreis());
                if (p.getNavi() == false)
                {
                    Console.print("Kein ");
                }
                Console.println("Navi vorhanden");
            }
            else if (f.getClass() == LKW.class)
            {
                LKW l = (LKW)f;
                Console.println("km-Preis: " + l.getKmPreis());
            }
            else if (f.getClass() == Bus.class)
            {
                Bus b = (Bus)f;
                Console.println("Plätze: " + b.getPlätze());
                Console.print("Fahrzeug wurde ");
                if (b.getGereinigt() == false)
                {
                    Console.print("nicht ");
                }
                Console.println("gereinigt");
            }
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
