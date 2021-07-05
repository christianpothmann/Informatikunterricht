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
        sp1.dreheLinks();
        sp1.dreheLinks();
        sp1.dreheLinks();
        sp1.schneller();
        sp1.schneller();
        sp1.bewege();

        sp2.schneller();
        sp2.schneller();
        sp2.schneller();
        sp2.bewege();

        sp1.dreheLinks();
        sp1.dreheLinks();
        sp1.dreheLinks();
        sp1.bewege();

        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.bewege();

        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.bewege();

        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.langsamer();
        sp2.langsamer();
        sp2.bewege();

        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.langsamer();
        sp1.bewege();
        
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.dreheLinks();
        sp2.bewege();
        
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.dreheRechts();
        sp1.schneller();
        sp1.schneller();
        sp1.bewege();
    }
}
