import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/*
 * 
 */
class Game
{
    Sprite sp;
    GameImage img;
    GameWindow window;
    
    Game()
    {
        img    = new GameImage("images/Ghost red 100x115.png");
        sp     = new Sprite(img);
        window = new GameWindow(100, 100, 1200, 900, "Spiel mit Ereignissen");
    }

    /*
     * 
     */
    void aufgabe1()
    {
    }

    // ...
}
