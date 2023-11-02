import console.*;

/*
 * Misst die Laufzeit verschiedener Sortierverfahren
 * C. Pothmann, 20.09.2015
 */
public class Laufzeitmessung
{ 
    private Zahlenliste zl;
    private Stoppuhr uhr;

    public Laufzeitmessung()
    {
        uhr = new Stoppuhr();
    }

    /*
     * Ruft die drei Sortierverfahren auf und misst die Zeit, die die Verfahren jeweils benoetigen.
     * Das Array wird vor jedem Sortieren mit neuen Zufallszahlen gefuellt.
     * Die benoetigte Zeit wird jeweils auf der Konsole ausgegeben.
     */
    public void main()
    {
        int laenge;
        
        Console.clear();
        Console.println("Laufzeitmessung von Sortierverfahren\nWie lang soll die Liste sein?");
        laenge = Console.readInt();
        
        zl  = new Zahlenliste(laenge);

        Console.println("Sortiere Listen der Länge " + laenge);

        zl.fuellen();
        uhr.start();
        zl.selectionSort();
        uhr.stopp();

        Console.println("Der Selection Sort brauchte " + uhr.gestoppteZeit() + " Sekunden.\n");

        zl.fuellen();
        uhr.start();
        zl.bubbleSort();
        uhr.stopp();

        Console.println("Der Bubblesort brauchte " + uhr.gestoppteZeit() + " Sekunden.\n");

        zl.fuellen();
        uhr.start();
        zl.insertionSort();
        uhr.stopp();

        Console.println("Der Insertion Sort brauchte " + uhr.gestoppteZeit() + " Sekunden.\n");        
    }
}
