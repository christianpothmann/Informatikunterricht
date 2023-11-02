import pm.gamewindow.*;
import java.awt.*;

/**
 *
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

    /**
     * Farbverlauf -> soll unabhängig von der Voreingestellten Größe des Fensters sein
     */
    void aufgabe1()
    {
        int x;
        float r;
        Color farbe;
        
        r = 0f;
        x = 0;
        while (x < 900)
        {
            farbe = new Color(r, r, r);
            window.drawLine(x, 0, x, 600, farbe);
            r += 1f / 900f;
            x++;
        }
        window.paintFrame();
    }

    /*
     * Sprite ist immer genau am Mauszeiger
     */
    void aufgabe2()
    {
        // ...

        // Endlosschleife
        while (true)
        {
            //...
        }
    }

    /*
     * Sprite folgt langsam dem Mauszeiger
     */
    void aufgabe3()
    {
        // ...

        // Endlosschleife
        while (true)
        {
            //...
        }
    }
}
