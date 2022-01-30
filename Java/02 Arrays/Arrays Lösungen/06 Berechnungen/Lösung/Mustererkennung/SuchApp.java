import console.*;

/*
 * Hauptklasse für die Mustererkennung
 * (Name, Datum)
 */
public class SuchApp
{
    private Text text;
    
    public SuchApp()
    {
        text = new Text();
    }

    /*
     * Bittet den Benutzer, ein Textmuster einzutippen.
     * Rückgabewert: das Muster als Array von Buchstaben
     */
    public char[] musterEinlesen()
    {
        int i;
        String s;
        char[] muster;
        
        Console.println("Bitte geben Sie ein Suchmuster ein.");
        s = Console.readString();
        muster = new char[s.length()];
        for (i = 0; i < s.length(); i++)
        {
            muster[i] = s.charAt(i);
        }

        return muster;
    }

    /*
     * Gibt einen zufällig generierter Text aus.
     * Der Benutzer kann wiederholt Textmuster eingeben, die dann gesucht werden.
     */
    public void main()
    {
        char c;
        int anzahl;
        char[] muster;

        Console.clear();
        Console.println("=== Mustererkennung ===");
        Console.println("Das Array mit zufaelligen Buchstaben:");
        text.fuellenZufall();
        text.ausgeben();

        c = 'j';
        while (c == 'j')
        {
            muster = musterEinlesen();
            anzahl = text.musterSuche(muster);
            Console.println("Das Muster kommt " + anzahl + " mal vor");
            Console.println("Noch eins? (j/n)");
            c = Console.readChar();
        }
    }
}