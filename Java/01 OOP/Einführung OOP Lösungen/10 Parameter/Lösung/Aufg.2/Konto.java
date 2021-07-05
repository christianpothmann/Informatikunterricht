class Konto
{
    double stand;
    
    void einzahlen(double pbetrag)
    {
        stand = stand + pbetrag;
    }
    
    void abheben(double pbetrag)
    {
        stand = stand - pbetrag;
    }
    
    void zinsen(double zinssatz)
    {
        stand = stand + (stand * zinssatz / 100);
    }
}