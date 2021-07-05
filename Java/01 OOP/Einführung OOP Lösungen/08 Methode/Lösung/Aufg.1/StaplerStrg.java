class StaplerStrg
{
    double höhe, winkel;

    void heben()
    {
        höhe = höhe + 10;
    }

    void senken()
    {
        höhe = höhe - 10;
    }

    void oben()
    {
        höhe = 0;
    }

    void unten()
    {
        höhe = 200;
    }

    void neigenVor()
    {
        winkel = winkel + 5;
    }

    void neigenZurück()
    {
        winkel = winkel - 5;
    }

    void neigenMitte()
    {
        winkel = 0;
    }
}
