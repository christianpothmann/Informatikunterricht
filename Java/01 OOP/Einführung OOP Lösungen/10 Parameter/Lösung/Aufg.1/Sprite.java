class Sprite
{
    double x, y;
    double richtung;
    double speed;

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
        richtung = richtung + pr;
    }
    
    void dreheRechts(double pr)
    {
        richtung = richtung - pr;
    }
    
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }
}
