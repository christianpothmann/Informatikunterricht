class Gabel
{
    int höhe, maxHöhe;
    
    Gabel(int pmax)
    {
        maxHöhe = pmax;
    }
    
    void heben(int ph)
    {
        höhe = höhe + ph;
    }
    
    void senken(int ph)
    {
        höhe = höhe - ph;
    }
}