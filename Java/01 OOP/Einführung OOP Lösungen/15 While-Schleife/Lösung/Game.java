import pm.gamewindow.*;

/**
 * Verschiedene Bewegungen mit je zwei Sprites
 * C. Pothmann, 21.01.2020
 */
class Game
{
    Sprite sp1, sp2;
    GameWindow window;
    
    Game()
    {
        sp1 = new Sprite("./images/ghost red 100x100.png");
        sp2 = new Sprite("./images/Ghost pink 100x100.png");
        window = new GameWindow(100, 100, 900, 600, "Schleifen");
    }

    /**
     * Sprites bewegen sich von links nach rechts (bzw. umgekehrt) über das Fenster.
     */
    void aufgabe1()
    {
        int zähler;
        
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

    /**
     * Sprites bewegen sich symmetrisch im Kreis
     */
    void aufgabe2()
    {
        int zähler;
        
        sp1.setPosition(100, 250);
        sp2.setPosition(700, 250);
        
        sp1.setSpeed(5);
        sp2.setSpeed(5);
        sp1.setRichtung(-90);
        sp2.setRichtung(-90);

        zähler = 0;
        while (zähler < 120)
        {
            sp1.dreheRechts(3);
            sp2.dreheLinks(3);
            sp1.bewege();
            sp2.bewege();

            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            window.paintFrame();

            zähler = zähler + 1;
        }
    }

    /**
     * Sprites bewegen sich in einer Schlangenlinie
     */
    void aufgabe3()
    {
        int zähler;
        
        sp1.setPosition(100, 250);
        sp2.setPosition(100, 250);
        
        sp1.setRichtung(-90);
        sp2.setRichtung(90);
        sp1.setSpeed(10);
        sp2.setSpeed(10);

        // erster Halbkreis für beide Sprites
        zähler = 0;
        while (zähler < 29)
        {
            sp1.dreheRechts(6);
            sp2.dreheLinks(6);
            sp1.bewege();
            sp2.bewege();

            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            window.paintFrame();

            zähler = zähler + 1;
        }

        sp1.setRichtung(90);
        sp2.setRichtung(-90);

        // zweiter Halbkreis
        zähler = 0;
        while (zähler < 29)
        {
            sp1.dreheLinks(6);
            sp2.dreheRechts(6);
            sp1.bewege();
            sp2.bewege();

            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            window.paintFrame();

            zähler = zähler + 1;
        }

        sp1.setRichtung(-90);
        sp2.setRichtung(90);

        // dritter Halbkreis
        zähler = 0;
        while (zähler < 29)
        {
            sp1.dreheRechts(6);
            sp2.dreheLinks(6);
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
