import pm.gamewindow.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Spiel Pong
 * (Name, Datum)
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
        // Anfangswerte für die Sprites
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

            // Bewegung Ball, ggf. Abprallen vom Rand oder Schläger

            // Zeichnen
            window.clear();
            spSchlag1.draw(window);
            spSchlag2.draw(window);
            spBall.draw(window);
            window.paintFrame();

            // Punkt für einen Spieler? -> Nachricht ausgeben, einen Moment warten, und Ball wieder in die Mitte setzen
        }
    }
}
