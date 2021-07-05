import console.*;

/*
 * Anwendung des Stacks: Rangierbahnhof
 * Rote und blaue Waggons werden auf Gleise sortiert.
 * (Name, Datum)
 */
public class Bahnhof
{
    // ... Attribute deklarieren ...
    
    /*
     * Erzeugt die drei Stacks ("Gleise")
     */
    public Bahnhof()
    {
        // ... hier programmieren ...
    }
    
    /*
     * F?llt Gleis 1 zuf?llig mit roten und blauen Waggons
     */
    public void fuelleGleis1()
    {
        // ... hier programmieren ...
    }

    /*
     * Sortiert die Waggons von Gl.1 auf Gl.2 und Gl.3
     */
    public void sortiereGleis1()
    {
        // ... hier programmieren ...
    }
    
    /*
     * Gibt die Waggons eines beliebigen Gleises (d.h. Stacks) aus
     */
    public void ausgabeGleis(Stack<Waggon> gleis)
    {
        // ... hier programmieren ...
    }

    /*
     * F?hrt die Methoden nacheinander aus
     */
    public void main()
    {
        // Gleis 1 f?llen und ausgeben
        fuelleGleis1();
        Console.clear();
        Console.println("Gleis 1 zuf?llig gef?llt:");
        ausgabeGleis(gleis1);
        
        // Sortiere nach Farben auf Gleis 2 und 3
        sortiereGleis1();
        
        // Gib alle Gleise aus
        Console.println("Gleis 1:");
        ausgabeGleis(gleis1);
        Console.println("Gleis 2:");
        ausgabeGleis(gleis2);
        Console.println("Gleis 3:");
        ausgabeGleis(gleis3);
    }
}