import pm.gamewindow.*;

// Müssen noch programmiert werden:
// die Methoden berührt... (siehe weiter unten im Quellcode)

public class Sprite
{
    private double x, y;
    private double richtung;
    private double speed;
    private GameImage image;

    public Sprite(GameImage pi)
    {
        image = pi;
    }

    /*
     * Get- und Set-Methoden für Position
     */
    public void setX(double px)
    {
        x = px;
    }

    public void setY(double py)
    {
        y = py;
    }

    public void setPosition(double px, double py)
    {
        x = px;
        y = py;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    /*
     * Get-Methoden für Breite / Höhe
     */
    public int getWidth()
    {
        return image.getWidth();
    }

    public int getHeight()
    {
        return image.getHeight();
    }

    /*
     * Get- und Set-Methoden für Speed und Richtung
     */
    public void setSpeed(double ps)
    {
        speed = ps;
    }

    public void schneller(double ps)
    {
        speed = speed + ps;
    }
    
    public void langsamer(double ps)
    {
        speed = speed - ps;
    }
    
    public void setRichtung(double pr)
    {
        richtung = pr;
    }

    public void dreheLinks(double pr)
    {
        richtung = richtung - pr;
    }
    
    public void dreheRechts(double pr)
    {
        richtung = richtung + pr;
    }
    
    public void dreheZu(double px, double py)
    {
        richtung = Math.atan2(py-y, px-x) / Math.PI * 180.0;
    }

    public void pralleAbHorizontal()
    {
        richtung = richtung * -1.0;
    }

    public void pralleAbVertikal()
    {
        richtung = 180.0 - richtung;
    }

    /*
     * Bewegung entsprechend speed und richtung
     */
    public void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }

    // AB HIER BEARBEITEN ///////////////////////////////////////////////
    
    /*
     * Kollisionen mit Fenster / Sprites
     */
    public boolean berührtLinks(GameWindow pwin)
    {
        // ...
    }
    
    // entsprechend je eine Methode für rechts, oben, unten
    // sowie eine Methode, die prüft, ob das Fenster an einer Seite (egal welcher) berührt wird

    // außerdem eine Methode, die prüft, ob ein andere Sprite berührt wird

    // BIS HIER //////////////////////////////////////////////////////////
    
    /*
     * Zeichnet den Sprite an der aktuellen Position auf das Fenster
     */
    public void draw(GameWindow pwin)
    {
        pwin.drawImage(image, (int)x, (int)y);
    }
}
