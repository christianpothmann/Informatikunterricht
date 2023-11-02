import pm.gamewindow.*;
import java.awt.*;

/*
 * Verwendet get-Methoden zur Lösung der Aufgaben
 * C. Pothmann, 08.03.2021
 */
class Game
{
    Sprite sp;
    GameWindow window;
    
    Game()
    {
        sp     = new Sprite("./images/ghost red 100x100.png");
        window = new GameWindow(100, 100, 900, 600, "Get-Methoden");
    }

    /*
     * Farbverlauf (nutzt GameWindow.getWidth() / getHeight()
     */
    void aufgabe1()
    {
        int x;
        float r;
        Color farbe;
        
        r = 0f;
        x = 0;
        while (x < window.getWidth())
        {
            farbe = new Color(r, r, r);
            window.drawLine(x, 0, x, window.getHeight()-1, farbe);
            r += 1f / window.getWidth();
            x++;
        }
        window.paintFrame();
    }

    /*
     * Sprite ist immer genau am Mauszeiger
     */
    void aufgabe2()
    {
        int x, y;

        while (true)
        {
            x = window.getMouseX();
            y = window.getMouseY();            
            sp.setPosition(x, y);

            window.clear();
            sp.draw(window);
            window.paintFrame();
        }
    }

    /*
     * Sprite folgt langsam dem Mauszeiger
     */
    void aufgabe3()
    {
        int x, y;

        sp.setPosition(window.getWidth() / 2, window.getHeight() / 2);
        sp.setSpeed(5);

        while (true)
        {
            x = window.getMouseX();
            y = window.getMouseY();
            
            sp.dreheZu(x, y);
            sp.bewege();

            window.clear();
            sp.draw(window);
            window.paintFrame();
        }
    }
}
