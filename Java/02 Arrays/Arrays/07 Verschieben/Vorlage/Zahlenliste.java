import console.*;

public class Zahlenliste
{
    // Hinweis: auch so kann man auch eine Liste erzeugen und mit Zahlen füllen.
    // Daher braucht es keinen Konstruktor.
    private int[] liste = { -12, -7, -3, 28, 9, -5, 6, -16, 9 };

    public void ausgeben()
    {
        int i;
        for (i = 0; i < liste.length; i++)
        {
            Console.print(liste[i] + " ");
        }
        Console.println();
    }

    // Hier Methoden einfügen
    // ...
}