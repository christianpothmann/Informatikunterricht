import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Spiel Pong
 * C. Pothmann, 16.04.2017
 */
public class Pong
{
    private GameWindow window;
    private GameImage imgBall, imgSchlag;
    private Sprite spBall, spSchlag1, spSchlag2;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Pong()
    {
        window    = new GameWindow(100, 100, 800, 600, "Pong");
        imgBall   = new GameImage("images/bubble-100x100.png");
        imgSchlag = new GameImage("images/paddel-30x120.png");
        spBall    = new Sprite(imgBall);
        spSchlag1 = new Sprite(imgSchlag);
        spSchlag2 = new Sprite(imgSchlag);
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        spSchlag1.setPosition(30.0, 240.0);
        spSchlag1.setSpeed(5.0);
        
        spSchlag2.setPosition(740.0, 240.0);
        spSchlag2.setSpeed(5.0);
        
        spBall.setPosition(350.0, 250.0);
        spBall.setSpeed(10.0);
        spBall.setRichtung(30.0);

        Font font = new Font("Verdana", Font.BOLD, 54);
        window.setFont(font);
        window.setFontColor(new Color(0, 19, 127));
        
        while (true)
        {           
            // Bewegung Schläger
            if (window.isKeyDown(KeyEvent.VK_W))
            {
                spSchlag1.setRichtung(270.0);
                spSchlag1.bewege();
            }            
            if (window.isKeyDown(KeyEvent.VK_S))
            {
                spSchlag1.setRichtung(90.0);
                spSchlag1.bewege();
            }
            if (window.isKeyDown(KeyEvent.VK_UP))
            {
                spSchlag2.setRichtung(270.0);
                spSchlag2.bewege();
            }            
            if (window.isKeyDown(KeyEvent.VK_DOWN))
            {
                spSchlag2.setRichtung(90.0);
                spSchlag2.bewege();
            }

            // Bewegung Ball
            spBall.bewege();
            if (spBall.berührt(spSchlag1) || spBall.berührt(spSchlag2))
            {
                spBall.pralleAbVertikal();
            }
            if (spBall.berührtOben(window) || spBall.berührtUnten(window))
            {
                spBall.pralleAbHorizontal();
            }

            // Zeichnen
            window.clear();
            spSchlag1.draw(window);
            spSchlag2.draw(window);
            spBall.draw(window);
            window.paintFrame();

            // Ereignisse: Punkte für Spieler
            if (spBall.berührtLinks(window))
            {
                window.drawString("Punkt für Spieler 2", 120, 270);
                window.paintFrame();
                window.wait(2000);
                spBall.setPosition(350.0, 250.0);
            }
            if (spBall.berührtRechts(window))
            {
                window.drawString("Punkt für Spieler 1", 120, 270);
                window.paintFrame();
                window.wait(2000);
                spBall.setPosition(350.0, 250.0);
            }
        }
    }
}
