import console.*;

/*
 * Verschieben von Elementen eines Arrays
 * C. Pothmann, 17.05.2016
 */
public class Zahlenliste
{
    // Hinweis: auch so kann man auch eine Liste erzeugen und mit Zahlen füllen.
    // Daher braucht es keinen Konstruktor.
    private int[] liste = { -12, -7, -3, 28, 9, -5, 6, -16, 9 };

    /*
     * Das erste und letzte Element des Arrays werden vertauscht
     */
    public void erstesLetztes()
    {
        int temp;
        temp = liste[0];
        liste[0] = liste[liste.length - 1];
        liste[liste.length - 1] = temp;
    }

    /*
     * Vertauscht die Reihenfolge aller Elemente des Arrays.
     */
    public void reihenfolgeUmdrehen()
    {
        int i, temp;
        for (i = 0; i < liste.length / 2; i++)
        {
            temp = liste[i];
            liste[i] = liste[liste.length - i - 1];
            liste[liste.length - i - 1] = temp;
        }
    }

    /*
     * Bewegt alle Elemente der Liste eine Position "nach links"
     * (d.h. von Pos. 1 nach Pos 0 usw.)
     * Das erste Element wird ganz nach rechts (ans Ende des Arrays) geschoben.
     */
    public void schiebeLinks()
    {
        int i, temp;
        temp = liste[0];
        for (i = 0; i < liste.length - 1; i++)
        {
            liste[i] = liste[i+1];
        }
        liste[liste.length-1] = temp;
    }

    /*
     * Bewegt alle Elemente der Liste eine Position "nach rechts"
     * (d.h. von Pos. 0 nach Pos 1 usw.)
     * Das letzte Element wird ganz nach links (an den Anfang des Arrays) geschoben.
     */
    public void schiebeRechts()
    {
        int i, temp;
        temp = liste[liste.length-1];
        for (i = liste.length-1; i > 0; i--)
        {
            liste[i] = liste[i-1];
        }
        liste[0] = temp;
    }
    
    /*
     * Vertauscht mehrmals zwei zufällige Elemente des Arrays.
     */
    public void mischen()
    {
        int i, a, b, temp;
        
        for (i = 0; i < 50; i++)
        {
            a = (int)(Math.random() * liste.length);
            b = (int)(Math.random() * liste.length);
            temp     = liste[a];
            liste[a] = liste[b];
            liste[b] = temp;
        }
    }

    /*
     * "Entfernt" alle negativen Zahlen; die Positiven werden nach links geschoben,
     * so dass sie die Lücken auffüllen. Die "leeren" Plätze am Ende werden auf 0 gesetzt.
     */
    public void negativeLoeschen()
    {
        int i, anzahl; 
        anzahl = 0;

        for (i = 0; i < liste.length - anzahl; i++)
        {
            while (i + anzahl < liste.length && liste[i + anzahl] < 0)
            {
                anzahl++;
            }
            // Sonderfall beachten: falls am Ende eine negative Zahl steht, wird nichts vorgezogen
            if (anzahl > 0 && i + anzahl < liste.length)
            {
                liste[i] = liste[i+anzahl];
            }
        }
        
        for (i = liste.length-anzahl; i < liste.length; i++)
        {
            liste[i] = 0;
        }
    }
    

    /*
     * Alle Elemente des Arrays werden auf der Konsole ausgegeben.
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
}