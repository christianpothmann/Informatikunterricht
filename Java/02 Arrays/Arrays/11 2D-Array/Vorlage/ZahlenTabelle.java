/*
 * Erstellt Muster für ein zweidimensionales Array von Zahlen
 * (Name, Datum)
 */
public class ZahlenTabelle
{
    // Das zweidimensionale Array: der 1. Index gibt die x-Werte, der 2. Index die y-Werte an.
    private int[][] tabelle;
    private int breite, hoehe;

    public ZahlenTabelle(int pbreite, int phoehe)
    {
        tabelle = new int[pbreite][phoehe];
        breite = pbreite;
        hoehe  = phoehe;
    }

    public int[][] getTabelle()
    {
        return tabelle;
    }

    public int getBreite()
    {
        return breite;
    }

    public int getHoehe()
    {
        return hoehe;
    }

    /*
     * Füllt die Tabelle gleichmäßig von oben nach unten
     */
    public void fuelleLinear()
    {
        // ...
    }

    /*
     * Füllt die Tabelle zufälligen Zahlen zw. 0 und 99.
     */
    public void fuelleZufall()
    {
        // ...
    }

    // Weitere Füllmethoden
    // ...
}
