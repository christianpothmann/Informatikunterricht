import console.*;

/*
 * Algorithmen für Arrays:
 * Textmuster in einem Text finden
 */
public class Mustererkennung
{   
    private char[] liste = new char[20];

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
     * Füllt die Liste mit zufälligen Buchstaben
     */
    public void fuellenZufall()
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
     * Bittet den Benutzer, ein Textmuster einzutippen.
     * Rückgabewert: das Muster als Array von Buchstaben
     */
    public char[] musterEinlesen()
    {
        int i;
        String s;
        
        Console.println("Bitte geben Sie ein Suchmuster ein.");
        s = Console.readString();
        char[] muster = new char[s.length()];
        for (i = 0; i < s.length(); i++)
        {
            muster[i] = s.charAt(i);
        }

        return muster;
    }
    
    /*
     * Durchsucht das Array 'liste' und zählt, wie oft 'muster' darin enthalten ist.
     * Rückgabewert: die Anzahl der Vorkommen von 'muster' in 'liste'
     */
    public int musterSuche(char[] muster)
    {
        int i, j, anzahl;
        anzahl = 0;

        // Achtung: vorher abfangen ob das Muster lÃ¤nger als die Liste ist (das vereinfacht die for-Schleife)
        if (muster.length > liste.length)
        { 
            return 0;
        }

        // Beginne bei jedem Buchstaben der Liste von neuem
        for (i = 0; i < liste.length - muster.length + 1; i++)
        {
            // Vom aktuellen Buchstaben der Liste überprüfe so viele Buchstaben wie das Muster hat
            for (j = 0; j < muster.length; j++)
            {
                // falls der Buchstabe nicht übereinstimmt, breche die Musterprüfung ab (es wird dann beim nÃ¤chsten Buchstaben der Liste weitergemacht)
                if (liste[i+j] != muster[j])
                {
                    break;
                }
            }
            // falls der Vergleich das Ende des Musters erreicht hat, bedeutet das, dass das Muster vollständig in der Liste vorhanden ist.
            if (j == muster.length)
            {
                anzahl = anzahl + 1;
            }
        }

        return anzahl;
    }
    
    /*
     * Hauptmethode:
     * Testet die Mustererkennung
     */
    public void main()
    {
        char c;
        int anzahl;
        char[] muster;

        Console.clear();
        Console.println("=== Mustererkennung ===");
        Console.println("Das Array mit zufälligen Buchstaben:");
        fuellenZufall();
        ausgeben();

        c = 'j';
        while (c == 'j')
        {
            muster = musterEinlesen();
            anzahl = musterSuche(muster);
            Console.println("Das Muster kommt " + anzahl + " mal vor");
            Console.println("Noch eins? (j/n)");
            c = Console.readChar();
        }
    }
}