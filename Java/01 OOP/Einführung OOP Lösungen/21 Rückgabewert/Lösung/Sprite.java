import pm.gamewindow.*;

/**
 * Stellt ein bewegtes Objekt in einem 2D-Spiel dar.
 * Verwendet GameImage und GameWindow.
 * C. Pothmann, 16.01.2020
 */
class Sprite
{
    double x, y;      // Position innerhalb eines GameWindow
    double richtung;  // Richtung der Bewegung in Grad
    double speed;     // Distanz pro Bewegung in Pixel
    GameImage image;  // das dem Sprite zugeordnete Bild

    /**
     * Lädt bei Erzeugung des Sprites das zugeordnete GameImage aus einer Bilddatei,
     * die durch pdatei angegeben wird.
     */
    Sprite(String pdatei)
    {
        image = new GameImage(pdatei);
    }

    /**
     * Setzt die Position des Sprites innerhalb des GameWindow 
     * (bezogen auf die linke obere Ecke des GameImages).
     */
    void setPosition(double px, double py)
    {
        x = px;
        y = py;
    }

    /**
     * Setzt die x-Koordinate des Sprites 
     */
    void setX(double px)
    {
        x = px;
    }

    /**
     * Setzt die y-Koordinate des Sprites 
     */
    void setY(double py)
    {
        y = py;
    }

    /**
     * Gibt die x-Koordinate des Sprites zurück
     */
    double getX()
    {
        return x;
    }

    /**
     * Gibt die y-Koordinate des Sprites zurück
     */
    double getY()
    {
        return y;
    }

    /**
     * Gibt die Breite des GameImages des Sprites zurück
     */
    int getWidth()
    {
        return image.getWidth();
    }

    /**
     * Gibt die Höhe des GameImages des Sprites zurück
     */
    int getHeight()
    {
        return image.getHeight();
    }

    /**
     * Setzt die Entfernung, mit der sich der Sprite mit einem Aufruf von bewege()
     * in der aktuellen Richtung bewegt (in Pixeln).
     */
    void setSpeed(double ps)
    {
        speed = ps;
    }

    /**
     * Erhöht "speed" um "ps"
     */
    void schneller(double ps)
    {
        speed = speed + ps;
    }
    
    /**
     * Senkt "speed" um "ps" (negativer Wert möglich)
     */
    void langsamer(double ps)
    {
        speed = speed - ps;
    }
    
    /**
     * Setzt die Richtung, in die sich der Sprite bewegt (in Grad).
     * 0° entspricht der x-Achse, von dort weiter im Uhrzeigersinn.
     */
    void setRichtung(double pr)
    {
        richtung = pr;
    }

    /**
     * Dreht Richtung nach links (pr wird subtrahiert)
     */
    void dreheLinks(double pr)
    {
        richtung = richtung - pr;
    }
    
    /**
     * Dreht Richtung nach rechts (pr wird addiert)
     */
    void dreheRechts(double pr)
    {
        richtung = richtung + pr;
    }

    /**
     * Dreht Richtung des Sprites zum Punkt px / py
     */
    void dreheZu(double px, double py)
    {
        richtung = Math.atan2(py-y, px-x) / Math.PI * 180.0;
    }

    /**
     * Bewegt die Position (x/y) in "richtung" um "speed" Pixel.
     */
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }

    /**
     * Zeichnet das Bild des Sprite an der aktuellen Position (x/y)
     * auf das GameWindow gwin.
     */
    void draw(GameWindow gwin)
    {
        gwin.drawImage(image, (int)x, (int)y);
    }
}
