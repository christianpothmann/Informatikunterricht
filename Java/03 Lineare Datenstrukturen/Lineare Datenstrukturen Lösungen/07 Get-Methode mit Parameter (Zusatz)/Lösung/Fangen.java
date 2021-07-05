import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Spieler 2 versucht, Spieler 1 zu fangen
 * C. Pothmann, 31.03.2020
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
        img1   = new GameImage("images/ghost red 100x100.png");
        img2   = new GameImage("images/ghost blue 100x100.png");
        sp1    = new Sprite(img1);
        sp2    = new Sprite(img2);
        window = new GameWindow(100, 100, 800, 600, "Fangen");
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        boolean gefangen;

        sp1.setPosition(100, (window.getHeight()-sp1.getHeight()) / 2);
        sp2.setPosition(window.getWidth() - sp2.getWidth() - 100, (window.getHeight()-sp2.getHeight()) / 2);
        sp1.setSpeed(5);
        sp2.setSpeed(5);

        gefangen = false;
        while (gefangen == false)
        {
            // Spieler 1: WASD
            if (window.isKeyDown(KeyEvent.VK_D)) 
            {
                sp1.setRichtung(0);
                sp1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_A))
            {
                sp1.setRichtung(180);
                sp1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_W))
            {
                sp1.setRichtung(270);
                sp1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_S))
            {
                sp1.setRichtung(90);
                sp1.bewege();
            }

            // Spieler 2: Pfeiltasten
            if (window.isKeyDown(KeyEvent.VK_RIGHT)) 
            {
                sp2.setRichtung(0);
                sp2.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_LEFT))
            {
                sp2.setRichtung(180);
                sp2.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_UP))
            {
                sp2.setRichtung(270);
                sp2.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_DOWN))
            {
                sp2.setRichtung(90);
                sp2.bewege();
            }

            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            window.paintFrame();

            // Berührung?
            if (sp1.berührt(sp2))
            {
                window.setFont( new Font("Verdana", Font.BOLD, 80) );
                window.setFontColor( new Color(0f, 1f, 0f) );
                window.drawString("Gefangen!!", 180, 300);
                window.paintFrame();
                gefangen = true;
            }
        }
    }
}
