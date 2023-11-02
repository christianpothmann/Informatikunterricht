import pm.gamewindow.*;
import java.awt.*;

/**
 * Verschiedene Farbverläufe mit while-Schleife
 * C. Pothmann, 03.02.2020
 */
class Farbverlaeufe
{
    GameWindow window;
    
    Farbverlaeufe()
    {
        window = new GameWindow(100, 100, 1200, 800, "Schleifen");
    }

    /**
     * Ändert fließend die Hintergrundfarbe
     */
    void aufgabe1()
    {
        int zaehler;
        Color farbe;
        float r, g, b;
        
        r = 1.0f;
        g = 0.0f;
        b = 0.0f;

        zaehler = 0;
        while (zaehler < 100)
        {
            farbe = new Color(r, g, b);
            window.clear(farbe);
            window.paintFrame();

            r -= 0.01;
            g += 0.005;
            b += 0.01;
            zaehler++;
        }
    }

    /**
     * Zeichnet einen fließenden Übergang
     */
    void aufgabe2()
    {
        int zaehler;
        Color farbe;
        float r, g, b;
        
        r = 0.0f;
        g = 1.0f;
        b = 0.0f;

        zaehler = 0;
        while (zaehler < 1200)
        {
            farbe = new Color(r, g, b);
            window.drawLine(zaehler, 0, zaehler, 900, farbe);

            g -= 1.0f / 1200.0f;
            b += 0.5f / 1200.0f; 
            zaehler++;
        }

        window.paintFrame();
    }      

    /**
     * Zeichnet zwei fließende Übergänge
     */
    void aufgabe3()
    {
        int zaehler;
        Color farbe1, farbe2;
        float r, g, b;
        float mitte;
        
        r = 0.5f;
        g = 0.0f;
        b = 0.5f;
        mitte = 0;

        zaehler = 0;
        while (zaehler < 1200)
        {
            farbe1 = new Color(r, g, b);
            farbe2 = new Color(0.5f - r, g, 0.5f - b);
            mitte = (float)(400.0f + 400.0f * Math.cos(Math.PI/1200.0*zaehler));
            // mitte += 800.0f / 1200.0f;
            window.drawLine(zaehler, 0, zaehler, (int)mitte, farbe1);
            window.drawLine(zaehler, (int)mitte+1, zaehler, 900, farbe2);

            r -= 0.5f / 1200.0f;
            b -= 0.5f / 1200.0f;
            zaehler++;
        }
        window.paintFrame();
    }
    
    /**
     * Zeichnet ineinander geschachtelte Übergänge
     */
    void aufgabe4()
    {
        int zaehler;
        Color farbe;
        float r, g, b;
        
        // Farbe 1 von Schwarz nach Magenta und zurück
        r = 0.0f;
        g = 0.0f;
        b = 0.0f;

        zaehler = 0;
        while (zaehler < 600)
        {
            farbe = new Color(r, g, b);            
            window.drawLine(zaehler, 0, zaehler, 800, farbe);

            r += 0.5f / 600.0f;
            b += 0.5f / 600.0f;
            zaehler++;
        }
        while (zaehler < 1200)
        {
            farbe = new Color(r, g, b);            
            window.drawLine(zaehler, 0, zaehler, 800, farbe);

            r -= 0.5f / 600.0f;
            b -= 0.5f / 600.0f;
            zaehler++;
        }

        // Farbe 2 von Gelb nach Schwarz und zurück
        r = 1.0f;
        g = 1.0f;
        b = 0.0f;

        zaehler = 200;
        while (zaehler < 600)
        {
            farbe = new Color(r, g, b);            
            window.drawLine(zaehler, 200, zaehler, 600, farbe);

            r -= 1.0f / 400.0f;
            g -= 1.0f / 400.0f;
            zaehler++;
        }
        while (zaehler < 1000)
        {
            farbe = new Color(r, g, b);            
            window.drawLine(zaehler, 200, zaehler, 600, farbe);

            r += 1.0f / 400.0f;
            g += 1.0f / 400.0f;
            zaehler++;
        }

        // Farbe 3 von Schwarz nach Blau und zurück
        r = 0.0f;
        g = 0.0f;
        b = 0.0f;

        zaehler = 400;
        while (zaehler < 600)
        {
            farbe = new Color(r, g, b);
            window.drawLine(zaehler, 350, zaehler, 450, farbe);

            b += 1.0f / 200.0f;
            zaehler++;
        }
        while (zaehler < 800)
        {
            farbe = new Color(r, g, b);           
            window.drawLine(zaehler, 350, zaehler, 450, farbe);

            b -= 1.0f / 200.0f;
            zaehler++;
        }

        window.paintFrame();
    }
}
