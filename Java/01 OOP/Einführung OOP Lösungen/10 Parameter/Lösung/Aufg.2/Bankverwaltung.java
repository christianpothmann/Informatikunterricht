class Bankverwaltung
{
    Konto kt1, kt2;
    
    Bankverwaltung()
    {
        kt1 = new Konto();
        kt2 = new Konto();
    }

    void main()
    {
        kt1.einzahlen(2200.0);
        kt2.einzahlen(1500.0);
        
        kt1.abheben(200);
        kt2.abheben(500);
        
        kt1.zinsen(5);
        kt2.zinsen(3);
    }
}