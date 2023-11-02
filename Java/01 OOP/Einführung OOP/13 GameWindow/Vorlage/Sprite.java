import pm.gamewindow.*;

class Sprite
{
    double x, y;
    double richtung;
    double speed;
    GameImage image;

    Sprite (String pdatei)
    {
        image = new GameImage(pdatei);
    }

    void draw(GameWindow gwin)
    {
        // x und y sind double-Werte (weil man für flüssige Bewegungen Nachkommastellen braucht).
        // drawImage erwartet jedoch int-Parameter, da die GameWindow-Koordinaten Pixeln entsprechen.
        // x und y müssen daher in ganze Zahlen umgewandelt werden mittels (int)x 
        // Dabei werden die Nachkommastellen einfach abgeschnitten.
        gwin.drawImage(image, (int)x, (int)y);
    }

    void setPosition(double px, double py)
    {
        x = px;
        y = py;
    }

    void setSpeed(double ps)
    {
        speed = ps;
    }

    void setRichtung(double pr)
    {
        richtung = pr;
    }

    void schneller(double ps)
    {
        speed = speed + ps;
    }
    
    void langsamer(double ps)
    {
        speed = speed - ps;
    }
    
    void dreheLinks(double pr)
    {
        richtung = richtung - pr;
    }
    
    void dreheRechts(double pr)
    {
        richtung = richtung + pr;
    }
    
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }
}
