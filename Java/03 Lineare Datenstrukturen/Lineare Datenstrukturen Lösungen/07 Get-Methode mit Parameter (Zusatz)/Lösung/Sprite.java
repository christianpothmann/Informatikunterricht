import pm.gamewindow.*;

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
     * Get- und Set-Methoden f�r Position
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
     * Get-Methoden f�r Breite / H�he
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
     * Get- und Set-Methoden f�r Speed und Richtung
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

    /*
     * Kollisionen mit Fenster / Sprites
     */
    public boolean ber�hrtLinks(GameWindow pwin)
    {
        if (x < 0)
        {
            return true;
        }
        return false;
    }
    
    public boolean ber�hrtRechts(GameWindow pwin)
    {
        if (x + image.getWidth() > pwin.getWidth())
        {
            return true;
        }
        return false;
    }

    public boolean ber�hrtOben(GameWindow pwin)
    {
        if (y < 0) 
        {
            return true;
        }
        return false;
    }
    
    public boolean ber�hrtUnten(GameWindow pwin)
    {
        if (y + image.getHeight() > pwin.getHeight()) 
        {
            return true;
        }
        return false;
    }

    public boolean ber�hrt(GameWindow pwin)
    {
        if (ber�hrtLinks(pwin) || ber�hrtRechts(pwin))
        {
            return true;
        }
        if (ber�hrtOben(pwin) || ber�hrtUnten(pwin))
        {
            return true;
        }
        return false;
    }

    public boolean ber�hrt(Sprite psp)
    {
        if (x + image.getWidth() < psp.getX())
        {
            return false;
        }
        if (x > psp.getX() + psp.getWidth()) 
        {
            return false;
        }
        if (y + image.getHeight() < psp.getY())
        {
            return false;
        }
        if (y > psp.getY() + psp.getHeight()) 
        {
            return false;
        }
        return true;
    }

    /*
     * Zeichnet den Sprite an der aktuellen Position auf das Fenster
     */
    public void draw(GameWindow pwin)
    {
        pwin.drawImage(image, (int)x, (int)y);
    }
}
