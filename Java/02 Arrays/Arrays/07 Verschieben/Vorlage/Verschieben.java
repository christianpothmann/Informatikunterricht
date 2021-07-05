import console.*;

public class Verschieben
{
    // Hinweis: auch so kann man auch eine Liste erzeugen und mit Zahlen füllen
    private int[] liste = { -12, -7, -3, 28, 9, -5, 6, -16, 9 };;

    public void ausgeben()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            Console.print(liste[i] + " ");
        }
        Console.println();
    }

    // Hinweis zum Programmieren:
    // Füge Methoden für das Verschieben nach links, rechts, Vertauschen der Reihenfolge usw. hinzu.
    // Rufe diese Methoden nacheinander in der main-Methode auf.
    // Nach jeder Methode gib das Array einmal aus, um zu prüfen, ob die Methode richtig arbeitet.

    public void main()
    {
    }
}