class Sprite
{
    double x, y;
    double richtung;
    double speed;
    
    void zumUrsprung()
    {
        x = 0;
        y = 0;
    }

    void stop()
    {
        speed = 0;
    }

    void schneller()
    {
        speed = speed + 10;
    }
    
    void langsamer()
    {
        speed = speed - 10;
    }
    
    void dreheLinks()
    {
        richtung = richtung + 15;
    }
    
    void dreheRechts()
    {
        richtung = richtung - 15;
    }
    
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }
}
