import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Spiele mit selbst programmierten get-Methoden (Klasse Sprite)
 * C. Pothmann, 29.02.2020
 */
class Game
{
    Sprite sp1, sp2, sp3, sp4;
    GameWindow window;
    
    Game()
    {
        sp1    = new Sprite("./images/ghost red 100x100.png");
        sp2    = new Sprite("./images/ghost cyan 100x100.png");
        sp3    = new Sprite("./images/ghost pink 100x100.png");
        sp4    = new Sprite("./images/ghost yellow 100x100.png");
        window = new GameWindow(50, 50, 800, 600, "Spiel mit Rückgabewerten");
    }

    /**
     * Sprite wird über Tastatur gesteuert, darf das Fenster aber nicht verlassen
     */
    void aufgabe1()
    {
        sp1.setPosition(window.getWidth()/2 - sp1.getWidth()/2, window.getHeight()/2 - sp1.getHeight()/2);
        sp1.setSpeed(10);

        while (true)
        {
            if (window.isKeyDown(KeyEvent.VK_RIGHT))
            {
                sp1.setRichtung(0);
                sp1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_LEFT))
            {
                sp1.setRichtung(180);
                sp1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_UP))
            {
                sp1.setRichtung(270);
                sp1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_DOWN))
            {
                sp1.setRichtung(90);
                sp1.bewege();
            }

            if (sp1.getX() < 0)
            {
                sp1.setX(0);
            }
            if (sp1.getX() + sp1.getWidth() > window.getWidth())
            {
                sp1.setX(window.getWidth() - sp1.getWidth());
            }
            if (sp1.getY() < 0)
            {
                sp1.setY(0);
            }
            if (sp1.getY() + sp1.getHeight() > window.getHeight())
            {
                sp1.setY(window.getHeight() - sp1.getHeight());
            }
            
            window.clear();
            sp1.draw(window);
            window.paintFrame();
        }
    }

    /**
     * Sprites "titschen" von Rand zu Rand
     */
    void aufgabe2()
    {
        sp1.setPosition(100, 100);
        sp2.setPosition(window.getWidth() - sp2.getWidth() - 100, 100);
        sp3.setPosition(window.getWidth() - sp3.getWidth() - 100, window.getHeight() - sp3.getHeight() - 100);
        sp4.setPosition(100, window.getHeight() - sp4.getHeight() - 100);

        sp1.setSpeed(10); sp1.setRichtung(0);
        sp2.setSpeed(10); sp2.setRichtung(90);
        sp3.setSpeed(10); sp3.setRichtung(180);
        sp4.setSpeed(10); sp4.setRichtung(270);

        while (true)
        {
            sp1.bewege();
            sp2.bewege();
            sp3.bewege();
            sp4.bewege();

            if (sp1.getX() + sp1.getWidth() > window.getWidth())
            {
                sp1.setRichtung(180);
            }
            else if (sp1.getX() < 0)
            {
                sp1.setRichtung(0);
            }
            if (sp3.getX() + sp3.getWidth() > window.getWidth())
            {
                sp3.setRichtung(180);
            }
            else if (sp3.getX() < 0)
            {
                sp3.setRichtung(0);
            }
            if (sp2.getY() + sp2.getHeight() > window.getHeight())
            {
                sp2.setRichtung(270);
            }
            else if (sp2.getY() < 0)
            {
                sp2.setRichtung(90);
            }
            if (sp4.getY() + sp4.getHeight() > window.getHeight())
            {
                sp4.setRichtung(270);
            }
            else if (sp4.getY() < 0)
            {
                sp4.setRichtung(90);
            }
            
            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            sp3.draw(window);
            sp4.draw(window);
            window.paintFrame();
        }
    }

    /**
     * Sprites folgen einander (der erste der Maus)
     */
    void aufgabe3()
    {
        sp1.setPosition(window.getWidth() / 2 - sp1.getWidth() / 2, window.getHeight()/2 - sp1.getHeight() / 2);
        sp2.setPosition(window.getWidth() / 2 - sp2.getWidth() / 2, window.getHeight()/2 - sp2.getHeight() / 2);
        sp3.setPosition(window.getWidth() / 2 - sp3.getWidth() / 2, window.getHeight()/2 - sp3.getHeight() / 2);
        sp4.setPosition(window.getWidth() / 2 - sp4.getWidth() / 2, window.getHeight()/2 - sp4.getHeight() / 2);

        sp1.setSpeed(10);
        sp2.setSpeed(8);
        sp3.setSpeed(6);
        sp4.setSpeed(4);

        while (true)
        {
            sp1.dreheZu(window.getMouseX(), window.getMouseY());
            sp2.dreheZu(sp1.getX(), sp1.getY());
            sp3.dreheZu(sp2.getX(), sp2.getY());
            sp4.dreheZu(sp3.getX(), sp3.getY());
            
            sp1.bewege();
            sp2.bewege();
            sp3.bewege();
            sp4.bewege();

            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            sp3.draw(window);
            sp4.draw(window);
            window.paintFrame();
        }
    }
}
