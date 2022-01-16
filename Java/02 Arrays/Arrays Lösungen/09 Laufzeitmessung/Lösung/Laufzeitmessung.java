import console.*;
/*
 * Misst die Laufzeit verschiedener Sortierverfahren
 * (L�sung)
 * C. Pothmann, 20.09.2015
 */
public class Laufzeitmessung
{ 
    // Array wird in der main-Methode erzeugt (dort wird die L�nge vom Benutzer erfragt)
    private int[] liste;
    private Stoppuhr uhr;

    public Laufzeitmessung()
    {
        uhr = new Stoppuhr();
    }

    /*
     * F�llt die Liste mit Zufallszahlen zw. -100 und 100
     */
    public void f�llen()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
             liste[i] = (int)(Math.random() * 201.0) - 100;
        }
    }

    /*
     * Selection Sort (Sortieren durch Auswahl)
     */
    public void selectionSort()
    {
        int i, j;
        int min, temp;
        
        for (i = 0; i < liste.length - 1; i++)
        {
            // Suche den Index des kleinsten Elements (von i an)
            min = i;
            for (j = i + 1; j < liste.length; j++)
            {
                if (liste[j] < liste[min])
                {
                    min = j;
                }
            }
            // Vertausche das kleinste Element mit dem aktuellen
            temp       = liste[i];
            liste[i]   = liste[min];
            liste[min] = temp;
        }
    }

    /*
     * Bubble Sort (Sortieren durch Vertauschen der Nachbarn)
     */
    public void bubbleSort()
    {
        int i, j, temp;
        
        // Gehe die Liste vom Anfang zum Ende durch
        for (i = 0; i < liste.length - 1; i++)
        {
            // Die letzten i Elemente sind schon richtig sortiert.
            // Gehe also vom Anfang bis Ende - i.
            // Vergleiche jedes Element mit seinem n�chsten Nachbarn.
            // Falls das Element kleiner als der Nachbar ist, tausche die beiden.
            for (j = 0; j < liste.length - i - 1; j++)
            {
                if (liste[j] > liste[j+1])
                {
                    temp       = liste[j];
                    liste[j]   = liste[j+1];
                    liste[j+1] = temp;
                }
            }
        }
    }

    /*
     * Insertion Sort (Sortieren durch Einf�gen)
     */
    public void insertionSort()
    {
        int i, j, aktuell;
        
        // Gehe die Liste von Anfang bis Ende durch
        for (i = 1; i < liste.length; i++)
        {
            // Merke das aktuelle Element
            aktuell = liste[i];
        
            // Gehe alle Elemente r�ckw�rts bis zum Anfang durch (die bereits sortiert sind)
            // Alle Elemente, die gr��er als das aktuelle sind, werden eins weiter geschoben,
            // bis ein Element gefunden ist, das kleiner oder gleich ist.
            j = i-1;
            while (j >= 0 && aktuell < liste[j])
            {
                liste[j+1] = liste[j];
                j--;
            }
            // An dieser Stelle wird das aktuelle Element eingef�gt.
            liste[j+1] = aktuell;
        }
    }

    /*
     * Ruft die drei Sortierverfahren auf und misst die Zeit, die die Verfahren jeweils ben�tigen.
     * Das Array wird vor jedem Sortieren mit neuen Zufallszahlen gef�llt.
     * Die ben�tigte Zeit wird jeweils auf der Konsole ausgegeben.
     */
    public void main()
    {
        int l�nge;
        
        Console.clear();
        Console.println("Laufzeitmessung von Sortierverfahren\nWie lang soll die Liste sein?");
        l�nge = Console.readInt();
        
        liste = new int[l�nge];

        Console.println("Sortiere Listen der L�nge " + liste.length);

        f�llen();

        uhr.start();
        selectionSort();
        uhr.stopp();

        Console.println("Der Selection Sort brauchte " + uhr.gestoppteZeit() + " Sekunden.\n");

        f�llen();

        uhr.start();
        bubbleSort();
        uhr.stopp();

        Console.println("Der Bubblesort brauchte " + uhr.gestoppteZeit() + " Sekunden.\n");

        f�llen();

        uhr.start();
        insertionSort();
        uhr.stopp();

        Console.println("Der Insertion Sort brauchte " + uhr.gestoppteZeit() + " Sekunden.\n");        
    }
}
