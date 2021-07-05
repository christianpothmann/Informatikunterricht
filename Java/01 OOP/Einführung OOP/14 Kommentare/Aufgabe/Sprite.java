import pm.gamewindow.*;

class Sprite
{
    double x, y;
    double richtung;
    double speed;
    GameImage image;

    Sprite(String pdatei)
    {
        image = new GameImage(pdatei);
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
    
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }

    void draw(GameWindow gwin)
    {
        gwin.drawImage(image, (int)x, (int)y);
    }
}
