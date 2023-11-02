class MAVerwaltung
{
    Mitarbeiter m1, m2;

    MAVerwaltung()
    {
        m1 = new Mitarbeiter();
        m2 = new Mitarbeiter();
    }

    void main()
    {
        m1.setName("Müller");
        m1.setMonGehalt(2000);
        m1.setSteuersatz(10);

        m2.setName("Schmidt");
        m2.setMonGehalt(3000);
        m2.setSteuersatz(11);

        m1.zahleGehalt();
        m2.zahleGehalt();

        m1.zahleGehalt();
        m2.zahleGehalt();

        m1.erhöheMonGehalt(1000);
        m1.setSteuersatz(11);
        m1.zahleGehalt();        
        m2.zahleGehalt();
    }
}