import console.*;

/*
 * Stellt einen Text als Array von Buchstaben (char) dar.
 * Christian Pothmann, 28.01.2022
 */
public class Text
{   
    private char[] liste;

    public Text()
    {
        liste = new char[50];
    }

    /*
     * Gibt die Liste auf der Konsole aus
     */
    public void ausgeben()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            Console.print(liste[i] + " ");
        }
        Console.println();
    }

    /*
     * Fuellt die Liste mit zufaelligen Buchstaben
     */
    void fuellenZufall()
    {
        int i, z;
        for (i = 0; i < liste.length; i++)
        {
            z = (int)(Math.random() * 26);
            switch (z)
            {
                case  0: liste[i] = 'a'; break;
                case  1: liste[i] = 'b'; break;
                case  2: liste[i] = 'c'; break;
                case  3: liste[i] = 'd'; break;
                case  4: liste[i] = 'e'; break;
                case  5: liste[i] = 'f'; break;
                case  6: liste[i] = 'g'; break;
                case  7: liste[i] = 'h'; break;
                case  8: liste[i] = 'i'; break;
                case  9: liste[i] = 'j'; break;
                case 10: liste[i] = 'k'; break;
                case 11: liste[i] = 'l'; break;
                case 12: liste[i] = 'm'; break;
                case 13: liste[i] = 'n'; break;
                case 14: liste[i] = 'o'; break;
                case 15: liste[i] = 'p'; break;
                case 16: liste[i] = 'q'; break;
                case 17: liste[i] = 'r'; break;
                case 18: liste[i] = 's'; break;
                case 19: liste[i] = 't'; break;
                case 20: liste[i] = 'u'; break;
                case 21: liste[i] = 'v'; break;
                case 22: liste[i] = 'w'; break;
                case 23: liste[i] = 'x'; break;
                case 24: liste[i] = 'y'; break;
                case 25: liste[i] = 'z'; break;
                default: liste[i] = ' '; break;
            }
        }
    }
    
    /*
     * Durchsucht das Array 'liste' und zaehlt, wie oft 'muster' darin enthalten ist.
     * Rueckgabewert: die Anzahl der Vorkommen von 'muster' in 'liste'
     */
    public int musterSuche(char[] muster)
    {
        int i, j, anzahl;
        anzahl = 0;

        // Sonderfall: Muster laenger als Liste
        // (wird eigentlich auch durch die for-Schleife erledigt)
        if (muster.length > liste.length)
        { 
            return 0;
        }

        // Beginne bei jedem Buchstaben der Liste von neuem
        for (i = 0; i < liste.length - muster.length + 1; i++)
        {
            // Vom aktuellen Buchstaben der Liste überprüfe so viele Buchstaben, wie das Muster hat
            for (j = 0; j < muster.length; j++)
            {
                // falls der Buchstabe nicht übereinstimmt, breche die Musterprüfung ab 
                // und gehe zum naechsten Buchstaben der Liste
                if (liste[i+j] != muster[j])
                {
                    break;
                }
            }
            // falls der Vergleich das Ende des Musters erreicht hat, ist das Muster vollständig in der Liste enthalten
            if (j == muster.length)
            {
                anzahl = anzahl + 1;
            }
        }

        return anzahl;
    }
}