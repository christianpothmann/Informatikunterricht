class Spedition
{
    LKW lkw1, lkw2;
    
    Spedition()
    {
        lkw1 = new LKW();
        lkw2 = new LKW();
    }

    void main()
    {
        lkw1.tanken();
        lkw1.fahren();
        lkw1.fahren();
        
        lkw2.tanken();
        lkw2.tanken();
        lkw2.fahren();
    }
}