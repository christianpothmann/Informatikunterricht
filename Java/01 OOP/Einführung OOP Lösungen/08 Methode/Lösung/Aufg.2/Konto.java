class Konto
{
    double stand;
    double zinssatz;

    void einzahlen()
    {
        stand = stand + 100;
    }

    void auszahlen()
    {
        stand = stand - 100;
    }

    void zinsErhöhen()
    {
        zinssatz = zinssatz + 0.01;
    }

    void zinsSenken()
    {
        zinssatz = zinssatz - 0.01;
    }

    void abrechnung()
    {
        stand = stand + (stand * zinssatz / 12.0);
    }
}