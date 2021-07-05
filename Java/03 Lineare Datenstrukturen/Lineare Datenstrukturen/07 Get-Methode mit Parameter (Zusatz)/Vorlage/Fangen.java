import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Spieler 2 versucht, Spieler 1 zu fangen
 * (Name, Datum)
 */
public class Fangen
{
    private GameWindow window;
    private GameImage img1, img2;
    private Sprite sp1, sp2;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Fangen()
    {
        img1   = new GameImage("images/Ghost red 100x100.png");
        img2   = new GameImage("images/Ghost blue 100x100.png");
        sp1    = new Sprite(img1);
        sp2    = new Sprite(img2);
        window = new GameWindow(100, 100, 800, 600, "Fangen");
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        boolean gefangen;   // Variable zum Abbruch der Schleife

        // Anfangswerte für Spieler 1 und Spieler 2
        sp1.setPosition(100, (window.getHeight()-sp1.getHeight()) / 2);
        sp2.setPosition(window.getWidth() - sp2.getWidth() - 100, (window.getHeight()-sp2.getHeight()) / 2);
        sp1.setSpeed(5);
        sp2.setSpeed(5);

        gefangen = false;
        while (gefangen == false)
        {
            // Sprites bewegen sich entsprechend der Tastatur
            // ...
            
            // Sprites werden gezeichnet
            window.clear();
            sp1.draw(window);
            sp2.draw(window);

            // Bei Kollision wird ein entsprechender Text auf das Fenster gezeichnet und das Spiel beendet
            // ...

            window.paintFrame();
        }
    }
}
