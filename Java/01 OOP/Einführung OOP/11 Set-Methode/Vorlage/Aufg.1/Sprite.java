class Sprite
{
    double x, y;
    double richtung;
    double speed;
    
    // Implementiere hier die Methoden der Klasse Sprite
    
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }
}
