import pm.gamewindow.*;
import java.awt.*;

/*
 * Zeichnet farbige Muster in ein 10 x 10 Schachbrett
 * C. Pothmann, 18.09.2020
 */
public class Visualisierung
{
    private int maxFarben;         // Anzahl der Farben
    private Color[] palette;       // Array von Farben, die die Zahlen in der Tabelle visualisieren
    private GameWindow window;
    
    /*
     * Konstruktor:
     * Erzeugt das GameWindow und füllt die Palette.
     * @param pBreite   Breite des Fensters in Pixeln
     * @param pHoehe    Höhe des Fensters in Pixeln
     * @param pMax      Max. Anzahl der Farben in der Palette
     */
    public Visualisierung(int pBreite, int pHoehe, int pMax)
    {
        window = new GameWindow(50, 50, pBreite, pHoehe, "Farbtabelle");
        maxFarben = pMax;
        palette = new Color[maxFarben];
        fuellePalette(Color.WHITE, Color.BLACK);
    }

        
    /*
     * Füllt die Palette gleichmäßig mit Farben zwischen farbe1 und farbe2
     */
    public void fuellePalette(Color pFarbe1, Color pFarbe2)
    {
        int i;
        double r, g, b;
        double rd, gd, bd;
        
        r  = pFarbe1.getRed();
        g  = pFarbe1.getGreen();
        b  = pFarbe1.getBlue();
        
        rd  = (pFarbe2.getRed()   - pFarbe1.getRed())   / maxFarben;
        gd  = (pFarbe2.getGreen() - pFarbe1.getGreen()) / maxFarben;
        bd  = (pFarbe2.getBlue()  - pFarbe1.getBlue())  / maxFarben;

        for (i = 0; i < maxFarben; i++)
        {
            palette[i] = new Color((int)r, (int)g, (int)b);
            r += rd;
            g += gd;
            b += bd;
        }
    }

    /*
     * Zeichnet ein Schachbrettmuster in den Farben, die durch "tabelle" definiert werden.
     * "tabelle" sollte nur Werte von 0 bis maxFarben enthalten (sonst wird das entspr. Feld rot gezeichnet)
     */
    public void zeichne(int[][] tabelle)
    {        
        int xi, yi;   // Indizes für die Tabelle
        int xc, yc;   // Koordinaten innerhalb des GameWindow
        int width, height;
        Color farbe;
        
        window.clear(Color.BLACK);

        width  = window.getWidth()  / (tabelle.length + 2);
        height = window.getHeight() / (tabelle[0].length + 2);

        yc = height;
        for (yi = 0; yi < tabelle[0].length; yi++)
        {
            xc = width;
            for (xi = 0; xi < tabelle.length; xi++)
            {
                if (tabelle[xi][yi] >= 0 && tabelle[xi][yi] < maxFarben)
                {
                    farbe = palette[tabelle[xi][yi]];
                }
                else
                {
                    farbe = Color.RED;
                }
                window.fillRectangle(xc, yc, width, height, farbe);
                xc += width;
            }
            yc += height;
        }
        
        window.paintFrame();
    }
}
