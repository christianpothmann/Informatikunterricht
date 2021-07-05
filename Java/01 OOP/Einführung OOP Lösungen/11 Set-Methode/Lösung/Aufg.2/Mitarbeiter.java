class Mitarbeiter
{
    String name;
    double gehalt;
    double steuersatz;
    double gesamtBrutto, gesamtNetto, gesamtSteuer;

    void setName(String pn)
    {
        name = pn;
    }
    
    void setGehalt(double pg)
    {
        gehalt = pg;
    }
    
    void erhöheGehalt(double perh)
    {
        gehalt = gehalt + perh;
    }
    
    void setSteuersatz(double ps)
    {
        steuersatz = ps;
    }
    
    void zahleGehalt()
    {
        gesamtBrutto = gesamtBrutto + gehalt;
        gesamtNetto = gesamtNetto + (gehalt - gehalt * steuersatz / 100);
        gesamtSteuer = gesamtSteuer + (gehalt * steuersatz / 100);
    }
}