class Gabel
{
    int h�he, maxH�he;
    
    Gabel(int pmax)
    {
        maxH�he = pmax;
    }
    
    void heben(int ph)
    {
        h�he = h�he + ph;
    }
    
    void senken(int ph)
    {
        h�he = h�he - ph;
    }
}