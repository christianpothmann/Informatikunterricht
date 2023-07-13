/*
 * Stellt ein Produkt in einem Snackautomaten dar.
 * C. Pothmann, 27.08.2020
 */
public class Produkt
{
    private String name;    // Name des Produkts
    private double preis;   // Aktueller Preis pro Einheit
    private int anzahl;     // Anzahl vorrätiger Einheiten des Produkts

    public Produkt(String pname)
    {
        name = pname;
        anzahl = 0;
    }

    public double getPreis()
    {
        return preis;
    }

    public void setPreis(double pp)
    {
        if (pp > 0.0)
        {
            preis = pp;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public void nachfuellen(int pa)
    {
        if (pa > 0)
        {
            anzahl += pa;
        }
    }

    public void verkaufen()
    {
        if (anzahl > 0)
        {
            anzahl--;
        }
    }
}