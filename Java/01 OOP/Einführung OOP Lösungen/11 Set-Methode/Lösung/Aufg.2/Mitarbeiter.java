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

    void erh�heMonGehalt(double pg)
    {
        monGehalt = monGehalt + pg;
    }

    void zahleGehalt()
    {
        gesGehalt = 
        gesGehalt + monGehalt;
    }
}