class StaplerStrg
{
    double h�he, winkel;

    void heben()
    {
        h�he = h�he + 10;
    }

    void senken()
    {
        h�he = h�he - 10;
    }

    void oben()
    {
        h�he = 0;
    }

    void unten()
    {
        h�he = 200;
    }

    void neigenVor()
    {
        winkel = winkel + 5;
    }

    void neigenZur�ck()
    {
        winkel = winkel - 5;
    }

    void neigenMitte()
    {
        winkel = 0;
    }
}
