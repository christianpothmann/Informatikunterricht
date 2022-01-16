class Mitarbeiter
{
    String name;
    double monGehalt, gesGehalt;

    void setName(String pn)
    { 
        name = pn; 
    }

    void setMonGehalt(double pg)
    { 
        monGehalt = pg;
    }

    void erhöheMonGehalt(double pg)
    {
        monGehalt = monGehalt + pg;
    }

    void zahleGehalt()
    {
        gesGehalt = 
        gesGehalt + monGehalt;
    }
}