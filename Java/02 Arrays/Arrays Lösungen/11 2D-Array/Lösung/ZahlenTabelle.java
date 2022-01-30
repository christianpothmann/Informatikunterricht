/*
 * Erstellt Muster für ein zweidimensionales Array von Zahlen
 * C. Pothmann, 21.09.2020
 */
public class ZahlenTabelle
{
    // Das zweidimensionale Array: der 1. Index gibt die x-Werte, der 2. Index die y-Werte an.
    private int[][] tabelle;
    private int breite, hoehe;

    public ZahlenTabelle(int pbreite, int phoehe)
    {
        tabelle   = new int[pbreite][phoehe];
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
        int x, y, zahl;
        for (x = 0; x < breite; x++)
        {
            for (y = 0; y < hoehe; y++)
            {
                tabelle[x][y] = y * 11;
            }
        }
    }

    /*
     * Füllt die Tabelle mit zufälligen Zahlen zw. pmin und pmax
     */
    public void fuelleZufall(int pmin, int pmax)
    {
        int x, y, zahl;
        for (x = 0; x < breite; x++)
        {
            for (y = 0; y < hoehe; y++)
            {
                zahl = (int)(Math.random() * (pmax - pmin + 1) + pmin);
                tabelle[x][y] = zahl;
            }
        }
    }

    /*
     * Die erste Zeile enthält die Einer-Reihe 1, 2, 3 usw. bis 10. 
     * Die zweite Zeile die Zweier-Reihe 2, 4, 6 usw. bis 20, usw.
     */
    public void fuelleEinmaleins()
    {
        int x, y, zahl;
        for (x = 0; x < breite; x++)
        {
            for (y = 0; y < hoehe; y++)
            {
                tabelle[x][y] = (x+1) * (y+1);
            }
        }
    }
    
    public void fuelleRaute(int pmax)
    {
        int x, y;
        for (x = 0; x < breite / 2; x++)
        {
            for (y = 0; y < hoehe / 2; y++)
            {
                tabelle[breite/2-x-1][hoehe/2-y-1] = pmax - x*y*4 - 1;
                tabelle[breite/2+x]  [hoehe/2-y-1] = pmax - x*y*4 - 1;
                tabelle[breite/2-x-1][hoehe/2+y]   = pmax - x*y*4 - 1;
                tabelle[breite/2+x]  [hoehe/2+y]   = pmax - x*y*4 - 1;
            }
        }
    }
    
    public void fuelleSchnecke()
    {
        int x = 0, y = 0, zahl = 0;
        int i, j;

        int ab = breite, ah = hoehe-1;  // aktuelle Breite / Höhe
        
        while (ab > 0 && ah > 0)
        {
            // oben links nach rechts
            for (i = 0; i < ab; i++)
            {
                tabelle[x][y] = zahl;
                x++;
                zahl++;
            }
            ab--;
            x--; y++;
            // rechts oben nach unten
            for (i = 0; i < ah; i++)
            {
                tabelle[x][y] = zahl;
                y++;
                zahl++;
            }
            ah--;
            y--; x--;
            // unten rechts nach links
            for (i = 0; i < ab; i++)
            {
                tabelle[x][y] = zahl;
                x--;
                zahl++;
            }
            ab--;
            x++; y--;
            // unten links nach oben
            for (i = 0; i < ah; i++)
            {
                tabelle[x][y] = zahl;
                y--;
                zahl++;
            }
            ah--;
            x++; y++;
        }
    }
    
    /*
     * Zusatz: Füllt die Tabelle zufällig mit 1 oder -1
     */
    public void fuelleOffsets()
    {
        int x, y;
        for (x = 0; x < breite; x++)
        {
            for (y = 0; y < hoehe; y++)
            {
                if (Math.random() < 0.5)
                {
                    tabelle[x][y] = -1;
                }
                else
                {
                    tabelle[x][y] = 1;
                }
            }
        }
    }
    
    /*
     * Ändert die Zahlen entsprechend einer Offset-Tabelle
     */
    public void ändereZahlen(ZahlenTabelle pOffTab)
    {
        int x, y;
        for (x = 0; x < breite; x++)
        {
            for (y = 0; y < hoehe; y++)
            {
                tabelle[x][y] += pOffTab.tabelle[x][y];
                if (tabelle[x][y] <= 0)
                {
                    tabelle[x][y] = 0;
                    pOffTab.tabelle[x][y] *= -1;
                }
                else if (tabelle[x][y] >= 99)
                {
                    tabelle[x][y] = 99;
                    pOffTab.tabelle[x][y] *= -1;
                }
            }
        }
        
    }
}
