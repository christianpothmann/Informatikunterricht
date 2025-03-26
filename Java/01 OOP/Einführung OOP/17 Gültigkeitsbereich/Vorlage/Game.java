import pm.gamewindow.*;

/**
 * Bewegung mit zwei Sprites
 * (Name, Datum)
 */
class Game
{
	
    Game()
    {
        sp1 = new Sprite("./images/ghost red 100x100.png");
        sp2 = new Sprite("./images/Ghost pink 100x100.png");
        window = new GameWindow(100, 100, 900, 600, "Schleifen");
    }

    /**
     * Sprites bewegen sich von links nach rechts (bzw. umgekehrt) über das Fenster.
     */
    void main()
    {
        
        sp1.setPosition(0, 150);
        sp2.setPosition(800, 350);
        
        sp1.setSpeed(10);
        sp2.setSpeed(10);
        sp1.setRichtung(0);
        sp2.setRichtung(180);

        zähler = 0;
        while (zähler < 80)
        {
            sp1.bewege();
            sp2.bewege();

            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            window.paintFrame();

            zähler = zähler + 1;
        }
    }
}
