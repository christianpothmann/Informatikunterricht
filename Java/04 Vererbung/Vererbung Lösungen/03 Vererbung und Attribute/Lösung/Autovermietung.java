import console.*;

public class Autovermietung
{
    private PKW pkw1;
    private LKW lkw1;
    private Bus bus1;
    
    public Autovermietung()
    {
        pkw1 = new PKW("K-FC 123");
        lkw1 = new LKW("M-BA 456");
        bus1 = new Bus("B-PH 390", 50);
    }
    
    public void main()
    {
        Console.clear();

        pkw1.setTagesPreis(40.0);
        pkw1.setWochenPreis(200.0);
        pkw1.setNavi(true);
        pkw1.mieten(10);
        pkw1.fahren(500);
        Console.println("Der PKW kostet insgesamt " + pkw1.getGesamtPreis());
        
        lkw1.setTagesPreis(70.0);
        lkw1.setKmPreis(0.75);
        lkw1.mieten(7);
        lkw1.fahren(1000);
        Console.println("Der LKW kostet insgesamt " + lkw1.getGesamtPreis());

        bus1.setTagesPreis(200.0);
        bus1.setGereinigt(false);
        bus1.mieten(3);
        bus1.fahren(2000);
        Console.println("Der Bus kostet insgesamt " + bus1.getGesamtPreis());
    }
}
