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
    }

    /**
     * Sprites "titschen" von Rand zu Rand
     */
    void aufgabe2()
    {
    }

    /**
     * Sprites folgen einander (der erste der Maus)
     */
    void aufgabe3()
    {
    }
}
