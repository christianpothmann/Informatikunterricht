import console.*;

/*
 * Stellt ein Array von Zahlen dar
 * Sortiert mithilfe verschiedener Sortierverfahren
 * (Autor, Datum)
 */
public class Zahlenliste
{ 
    private int[] liste;

    public Zahlenliste()
    {
        liste = new int[20];
    }

    /*
     * Fuellt das Array mit Zufallszahlen zw. -100 und 100
     */
    public void fuellen()
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
        // hier implementieren
        // ...
    }

    /*
     * Bubble Sort (Sortieren durch Vertauschen der Nachbarn)
     */
    void bubbleSort()
    {
        // hier implementieren
        // ...
    }

    /*
     * Insertion Sort (Sortieren durch Einf�gen)
     */
    void insertionSort()
    {
        // hier implementieren
        // ...
    }
}
