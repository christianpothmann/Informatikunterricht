import console.*;

/*
 * Klasse für ein Array mit 20 Einträgen
 * Sortiert die Liste mithilfe verschiedener Sortierverfahren
 * (Autor, Datum)
 */
public class Sortieren
{ 
    private int[] liste;

    public Sortieren()
    {
        liste = new int[20];
    }

    /*
     * Füllt das Array mit Zufallszahlen zw. -100 und 100
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
    void ausgeben()
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
    void selectionSort()
    {
        // ... hier ausfüllen ...
    }

    /*
     * Bubble Sort (Sortieren durch Vertauschen der Nachbarn)
     */
    void bubbleSort()
    {
        // ... hier ausfüllen ...
    }

    /*
     * Insertion Sort (Sortieren durch Einf�gen)
     */
    void insertionSort()
    {
        // ... hier ausfüllen ...
    }

    void main()
    {
        Console.println("Selection Sort:");
        füllen();
        ausgeben();
        selectionSort();
        ausgeben();    

        Console.println("\nBubble Sort:");
        füllen();
        ausgeben();
        bubbleSort();
        ausgeben();

        Console.println("\nInsertion Sort:");
        füllen();
        ausgeben();
        insertionSort();
        ausgeben();    
    }
}
