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
        speed = speed + 1;
    }
    
    void langsamer()
    {
        speed = speed - 1;
    }
    
    void dreheLinks()
    {
        richtung = richtung - 5;
    }
    
    void dreheRechts()
    {
        richtung = richtung + 5;
    }
    
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }
}
