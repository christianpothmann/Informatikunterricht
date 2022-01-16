class Konto
{
    String nummer;
	String name;
    double stand;
    
    // Hier: Konstruktor und set-Methode implementieren
    
    void einzahlen(double pbetrag)
    {
        stand = stand + pbetrag;
    }
    
    void abheben(double pbetrag)
    {
        stand = stand - pbetrag;
    }
}