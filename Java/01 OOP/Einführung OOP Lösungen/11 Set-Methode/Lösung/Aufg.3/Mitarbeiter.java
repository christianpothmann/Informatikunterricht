class Mitarbeiter
{
    String name;
    double monGehalt, steuersatz;
    double gesBrutto, gesNetto, gesSteuer;

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

    void setSteuersatz(double ps)
    { 
        steuersatz = ps; 
    }

    void zahleGehalt()
    {
        gesBrutto = gesBrutto + monGehalt;
        gesSteuer = gesSteuer + (monGehalt * steuersatz / 100);
        gesNetto  = gesBrutto - gesSteuer;
    }
}