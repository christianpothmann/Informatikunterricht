import console.*;

/*
 * Sortiert einen Stack von Containern mit zufälligen IDs nach deren ID.
 * Hat zwei Hilfsstacks zur Verfügung.
 * C. Pothmann, 23.02.2016
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
     * Nimmt alle Containern vom ersten Stapel, solange bis der Container einen Wert 
     * größer gleich der angegebenen Zahl hat.
     * Annahme: Wenn diese Zahl erreicht ist, sind alle Containern darunter aufsteigend sortiert.
     * Die abgenommenen Container werden in absteigender Reihenfolge auf den 2. Stapel gelegt.
     * Falls ein Container einen Wert kleiner als der bisher oberste des 2. Stapels hat, wird er auf 
     * den dritten Stapel ausgelagert.
     * Endbedingung: die aktuell größte Zahl liegt oben auf Stapel 2.
     */
    void sortiereStapel1Bis(int zahl)
    {       
        while (!stapel1.isEmpty())
        {
            Container con1 = stapel1.top();
            if (con1.getNummer() >= zahl)
            {
                break;
            }
            stapel1.pop();
            if (stapel2.isEmpty())
            {
                stapel2.push(con1);
                continue;
            }
            Container con2 = stapel2.top();
            if (con1.getNummer() > con2.getNummer())
            {
                stapel2.push(con1);
                continue;
            }
            stapel3.push(con1);
        }
    }
    
    /*
     * Legt die Containern von Stapel 2, dann von Stapel 3 zurück auf Stapel 1
     * So liegt dann die momentan größte Zahl (von Stapel 2) zuunterst.
     */
    public void legeZurueck()
    {
        while (!stapel2.isEmpty())
        {
            stapel1.push(stapel2.top());
            stapel2.pop();
        }
        while (!stapel3.isEmpty())
        {
            stapel1.push(stapel3.top());
            stapel3.pop();
        }        
    }
    
    /*
     * Sortiert den 1. Stapel komplett.
     * Annahme: Stapel 2 und 3 sind leer.
     */
    void sortiereStapel1()
    {
        if (stapel1.isEmpty()) return;
        
        int max = 1001;
        Container con = stapel1.top();
        while (con.getNummer() < max)
        {
            sortiereStapel1Bis(max);
            if (stapel2.isEmpty())
            {
                break;
            }
            con = stapel2.top();
            max = con.getNummer();
            legeZurueck();
            con = stapel1.top();
        }
    }

    /*
     * Gibt die Werte der Containern von Stapel 1 aus.
     * Verwendet einen temporären Stack, um die Elemente in der Zwischenzeit aufzunehmen.
     */
    public void ausgabeStapel1()
    {
        Stack<Container> stapelTemp;
        
        stapelTemp = new Stack();
        
        // nimm alle Elemente von Stapel 1 und gib sie aus
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