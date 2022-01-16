class Bankverwaltung
{
    Konto kt1, kt2;
    Aktie ak1, ak2;

    Bankverwaltung()
    {
        kt1 = new Konto("12345");
        kt2 = new Konto("09876");
        ak1 = new Aktie("Google");
        ak2 = new Aktie("Apple");
    }
    
    void main()
    {
        kt1.setName("Schmidt");
        kt1.einzahlen(200.0);
        
        kt2.setName("Meier");
        kt2.einzahlen(300.0);
        kt2.abheben(150.0);
        
        ak1.setKurs(251.0);
        ak2.setKurs(98.25);
    }
}