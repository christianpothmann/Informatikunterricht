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
        m1.setName("M�ller");
        m1.setMonGehalt(2000);
        m2.setName("Schmidt");
        m2.setMonGehalt(3000);

        m1.zahleGehalt();
        m2.zahleGehalt();

        m1.zahleGehalt();
        m2.zahleGehalt();

        m1.erh�heMonGehalt(1000);
        m1.zahleGehalt();        
        m2.erh�heMonGehalt(1000);
        m2.zahleGehalt();
    }
}
