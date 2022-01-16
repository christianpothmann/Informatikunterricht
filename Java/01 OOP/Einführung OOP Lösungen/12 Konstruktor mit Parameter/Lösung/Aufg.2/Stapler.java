class Stapler
{
    Fahrer fa;
    Gabel gab;
    String modell;
    double ladegewicht;
    
    Stapler(String pm, String pn, int ph)
    {
        fa  = new Fahrer(pn);
        gab = new Gabel(ph);
        modell = pm;
    }
    
    void setLadegewicht(double pg)
    {
        ladegewicht = pg;
    }
}