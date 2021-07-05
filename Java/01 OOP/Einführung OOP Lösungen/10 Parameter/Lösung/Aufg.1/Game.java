class Game
{
    Sprite sp1, sp2;
    
    Game()
    {
        sp1 = new Sprite();
        sp2 = new Sprite();
    }
    
    void main()
    {
        sp1.dreheLinks(45);
        sp1.schneller(20);
        sp1.bewege();

        sp2.schneller(30);
        sp2.bewege();

        sp1.dreheLinks(45);
        sp1.bewege();

        sp2.dreheLinks(45);
        sp2.bewege();

        sp1.dreheRechts(45);
        sp1.bewege();

        sp2.dreheLinks(45);
        sp2.langsamer(20);
        sp2.bewege();

        sp1.dreheRechts(90);
        sp1.langsamer(10);
        sp1.bewege();
        
        sp2.dreheLinks(90);
        sp2.bewege();
        
        sp1.dreheRechts(45);
        sp1.schneller(20);
        sp1.bewege();
    }
}
