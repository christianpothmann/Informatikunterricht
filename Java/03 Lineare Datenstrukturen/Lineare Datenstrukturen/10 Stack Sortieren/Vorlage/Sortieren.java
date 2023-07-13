import console.*;

/*
 * Sortiert einen Stack von Containern mit zufälligen IDs nach deren ID.
 * Hat zwei Hilfsstacks zur Verfügung.
 * (Name, Datum)
 */
public class Sortieren
{
    Stack<Container> stapel1, stapel2, stapel3;
    
    /*
     * Konstruktor: legt die drei Stapel an
     */
    public Sortieren()
    {
        stapel1 = new Stack();
        stapel2 = new Stack();
        stapel3 = new Stack();
    }

    /*
     * Füllt den ersten Stapel mit Containern in zufälliger Reihenfolge.
     * Die Werte liegen dabei zwischen 0 und 1000 (doppeltes Vorkommen möglich)
     */
    void fuelleStapel1(int anzahl)
    {       
        int i;
        for (i = 0; i < anzahl; i++)
        {
            int num = (int)(Math.random() * 1000.0);
            Container con = new Container(num);
            stapel1.push(con);
        }        
    }

    /*
     * Sortiert den 1. Stapel komplett.
     * Annahme: Stapel 2 und 3 sind leer.
     */
    void sortiereStapel1()
    {
    }

    /*
     * Gibt die Werte der Containern von Stapel 1 aus.
     * Verwendet einen temporären Stack, um die Elemente in der Zwischenzeit aufzunehmen.
     */
    public void ausgabeStapel1()
    {
        Stack<Container> stapelTemp;
        stapelTemp = new Stack();

        // nimm alle Elemente von Stapel 1, gib sie aus und lege sie auf den temporären Stapel
        while (!stapel1.isEmpty())
        {
            Container con = stapel1.top();
            Console.print(con.getNummer() + " ");
            stapelTemp.push(con);
            stapel1.pop();
        }
        Console.println();
        // schiebe alle Elemente vom temp. Stapel wieder auf Stapel 1
        while (!stapelTemp.isEmpty())
        {
            stapel1.push(stapelTemp.top());
            stapelTemp.pop();            
        }
    }
}