import console.*;
/*
 * Klasse für ein Array mit 20 Einträgen
 * Sortiert die Liste mithilfe verschiedener Sortierverfahren
 * Christian Pothmann, 6.09.2013
 */
public class Sortieren
{ 
    private int[] liste;

    public Sortieren()
    {
        liste = new int[20];
    }

    /*
     * Füllt die Liste mit Zufallszahlen zw. -100 und 100
     */
    public void füllen()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
             liste[i] = (int)(Math.random() * 201.0) - 100;
        }
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
            // Vergleiche jedes Element mit seinem nächsten Nachbarn.
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
     * Insertion Sort (Sortieren durch Einfügen)
     */
    public void insertionSort()
    {
        int i, j, aktuell;
        
        // Gehe die Liste von Anfang bis Ende durch
        for (i = 1; i < liste.length; i++)
        {
            // Merke das aktuelle Element
            aktuell = liste[i];
        
            // Gehe alle Elemente rückwärts bis zum Anfang durch (die bereits sortiert sind)
            // Alle Elemente, die größer als das aktuelle sind, werden eins weiter geschoben,
            // bis ein Element gefunden ist, das kleiner oder gleich ist.
            j = i-1;
            while (j >= 0 && aktuell < liste[j])
            {
                liste[j+1] = liste[j];
                j--;
            }
            // An dieser Stelle wird das aktuelle Element eingefügt.
            liste[j+1] = aktuell;
        }
    }
    
    /*
     * Ruft alle Suchverfahren einmal auf.
     */
    public void main()
    {
        Console.println("Selection Sort:");
        füllen();
        ausgeben();
        selectionSort();
        ausgeben();    

        Console.println();
        Console.println("Bubble Sort:");
        füllen();
        ausgeben();
        bubbleSort();
        ausgeben();

        Console.println();
        Console.println("Insertion Sort:");
        füllen();
        ausgeben();
        insertionSort();
        ausgeben();
    }
}
