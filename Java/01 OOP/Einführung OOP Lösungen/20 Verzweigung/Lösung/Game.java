import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Reaktion auf Ereignisse mit Verzweigungen
 * C. Pothmann, 25.02.2020
 */
class Game
{
    Sprite sp;
    GameWindow window;
    
    Game()
    {
        sp     = new Sprite("./images/ghost red 100x100.png");
        window = new GameWindow(50, 50, 1200, 900, "Spiel mit Ereignissen");
    }

    /**
     * Sprite springt bei Mausklick zum Mauszeiger
     */
    void aufgabe1()
    {
        sp.setPosition(window.getWidth()/2, window.getHeight()/2);
        while (true)
        {
            if (window.mouseButton1())
            {
                sp.setPosition(window.getMouseX(), window.getMouseY());
            }
            window.clear();
            sp.draw(window);
            window.paintFrame();
        }
    }

    /**
     * Sprite wird durch Pfeiltasten gesteuert
     * (Bewegung nur bei Tastendruck)
     */
    void aufgabe2()
    {
        // Setze Sprite in die Mitte des Fensters
        sp.setPosition(window.getWidth()/2-50, window.getHeight()/2-50);
        while (true)
        {
            if (window.isKeyDown(KeyEvent.VK_RIGHT))
            {
                sp.setSpeed(5);
                sp.setRichtung(0);
                sp.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_LEFT))
            {
                sp.setSpeed(5);
                sp.setRichtung(180);
                sp.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_UP))
            {
                sp.setSpeed(5);
                sp.setRichtung(270);
                sp.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_DOWN))
            {
                sp.setSpeed(5);
                sp.setRichtung(90);
                sp.bewege();
            }

            window.clear();
            sp.draw(window);
            window.paintFrame();
        }
    }

    /**
     * Sprite wird durch Pfeiltasten gesteuert
     * (schneller, langsamer, Richtung ändern)
     */
    void aufgabe3()
    {
        sp.setPosition(window.getWidth()/2-50, window.getHeight()/2-50);
        sp.setSpeed(0);
        while (true)
        {
            if (window.isKeyDown(KeyEvent.VK_RIGHT))
            {
                sp.dreheRechts(5);
            }
            if (window.isKeyDown(KeyEvent.VK_LEFT))
            {
                sp.dreheLinks(5);
            }
            if (window.isKeyDown(KeyEvent.VK_UP))
            {
                sp.schneller(0.25);
            }
            if (window.isKeyDown(KeyEvent.VK_DOWN))
            {
                sp.langsamer(0.25);
            }
            sp.bewege();

            window.clear();
            sp.draw(window);
            window.paintFrame();
        }
    }

    /**
     * Hintergrund wird heller/dunkler (mit Mausrad)
     */
    void aufgabe4()
    {
        float r;
        Color farbe;
        int mausrad;
        
        r = 0.5f;
        while (true)
        {
            farbe = new Color(r, r, r);
            window.clear(farbe);
            mausrad = window.mouseWheel();
            if (mausrad < 0)
            {
                r -= 0.05f;
                if (r <= 0.0f)
                {
                    r = 0.0f;
                }
            }
            if (mausrad > 0)
            {
                r += 0.05f;
                if (r >= 1.0f)
                {
                    r = 1.0f;
                }
            }
            window.paintFrame();
        }
    }

    /**
     * Linie immer weiter zeichnen mit der Maus
     */
    void aufgabe5()
    {
        int x1, y1, x2, y2;
        Color cBlau, cWeiss;

        cBlau  = new Color(0f, 0f, 1f);
        cWeiss = new Color(1f, 1f, 1f);
        window.clear(cWeiss);
        x1 = window.getWidth()/2;
        y1 = window.getHeight()/2;
        x2 = x1;
        y2 = y1;
        
        while (true)
        {
            window.drawLine(x1, y1, x2, y2, cWeiss);
            x2 = window.getMouseX();
            y2 = window.getMouseY();
            window.drawLine(x1, y1, x2, y2, cBlau);
            if (window.mouseButton1())
            {
                x1 = x2;
                y1 = y2;
            }
            window.paintFrame();
        }
    }
}
