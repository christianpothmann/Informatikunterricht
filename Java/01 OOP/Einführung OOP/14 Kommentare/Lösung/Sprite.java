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
     * Setzt die Entfernung, mit der sich der Sprite mit einem Aufruf von bewege()
     * in der aktuellen Richtung bewegt (in Pixeln).
     */
    void setSpeed(double ps)
    {
        speed = ps;
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
