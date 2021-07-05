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
        sp1.setPosition(10, 40);
        sp1.setSpeed(10);
        sp1.setRichtung(90);
        sp1.bewege();

        sp1.dreheRechts(90);
        sp1.setSpeed(30);
        sp1.bewege();
        
        sp1.dreheRechts(45);
        sp1.setSpeed(14.14);
        sp1.bewege();
        
        sp2.setPosition(20, 20);
        sp2.setSpeed(14.14);
        sp2.setRichtung(45);
        sp2.bewege();
        
        sp2.setRichtung(-90);
        sp2.setSpeed(20);
        sp2.bewege();
    }
}
