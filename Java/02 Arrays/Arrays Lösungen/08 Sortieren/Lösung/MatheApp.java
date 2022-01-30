import console.*;

/*
 * Hauptklasse fuer die Zahlenliste / Sortierverfahren
 * C. Pothmann, 28.01.2022
 */
public class MatheApp
{
    private Zahlenliste zl;
    
    public MatheApp()
    {
        zl = new Zahlenliste();
    }

    /*
     * Ruft alle Suchverfahren einmal auf.
     */
    public void main()
    {
        Console.clear();
        Console.println("Selection Sort:");
        zl.fuellen();
        zl.ausgeben();
        zl.selectionSort();
        zl.ausgeben();    

        Console.println("\nBubble Sort:");
        zl.fuellen();
        zl.ausgeben();
        zl.bubbleSort();
        zl.ausgeben();

        Console.println("\nInsertion Sort:");
        zl.fuellen();
        zl.ausgeben();
        zl.insertionSort();
        zl.ausgeben();
    }
}