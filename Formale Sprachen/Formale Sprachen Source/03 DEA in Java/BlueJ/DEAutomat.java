import console.*;

/*
 * Simuliert einen endlichen Automaten.
 * Der Automat erkennt L(A) = { w | w enthält 'abba' }
 * C. Pothmann, 22.01.2019
 */
public class DEAutomat
{
    // Prüft, ob der DEA das im Parameter gegebene Wort akzeptiert
    public boolean erkennt(String wort)
    {
        int zustand = 0;        // Startzustand ist 0
        char zeichen;           // das aktuelle Zeichen
        int pos = 0;            // aktuelle Position im Wort

        // Lies die Eingabe vom Anfang bis zum Ende
        while (pos < wort.length())
        {
            // Aktuelles Zeichen aus dem String holen
            char z = wort.charAt(pos);

            // Je nach Zustand und Zeichen wird der Folgezustand bestimmt
            if (zustand == 0)
            {
                if (z == 'a') { zustand = 1; }
                if (z == 'b') { zustand = 0; }
            }
            else if (zustand == 1)
            {
                if (z == 'a') { zustand = 1; }
                if (z == 'b') { zustand = 2; }
            }
            else if (zustand == 2)
            {
                if (z == 'a') { zustand = 1; }
                if (z == 'b') { zustand = 3; }
            }
            else if (zustand == 3)
            {
                if (z == 'a') { zustand = 4; }
                if (z == 'b') { zustand = 0; }                
            }
            else if (zustand == 4)
            {
                zustand = 4;
            }

            pos++;    // Gehe zum nächsten Zeichen
        }

        // Eingabe bis zum Ende gelesen, prüfe, ob DEA im Endzustand ist.
        if (zustand == 4)
        {
            return true;
        }
        return false;
    }

    public void main()
    {
        boolean test;
        String wort;

        Console.clear();
        Console.println("DEA für die Sprache L(A) = { w | w enthält \'abba\' }");

        Console.println("Geben Sie ein Wort ein (nur a / b)");
        wort = Console.readString();
        Console.println("Teste \'" + wort + "\'");
        test = erkennt(wort);

        if (test == true)
        {
            Console.println("Automat erkennt das Wort.");
        }
        else
        {
            Console.println("Automat erkennt das Wort nicht.");
        }
    }
}
