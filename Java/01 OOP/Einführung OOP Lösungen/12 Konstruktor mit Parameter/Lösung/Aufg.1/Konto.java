class Konto
{
    String nummer;
    String name;
    double stand;
    
    Konto(String pn)
    {
        nummer = pn;
    }
    
    void setName(String pn)
    {
        name = pn;
    }
    
    void einzahlen(double pbetrag)
    {
        stand = stand + pbetrag;
    }
    
    void abheben(double pbetrag)
    {
        stand = stand - pbetrag;
    }
}