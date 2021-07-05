import console.*;

/*
 * Anwendung des Stacks: Abstellgleise
 * Auf dem ersten Gleis sind zuf?llig rote und blaue Waggons abgestellt.
 * Diese sollen auf das zweite und dritte Gleis sortiert werden.
 * Die "Lok" kann dazu jeweils einen Waggon vom Gleis ziehen.
 * 
 * C. Pothmann, 16.02.2016 (Idee: M. Kowalski)
 */
public class Bahnhof
{
    private Stack<Waggon> gleis1, gleis2, gleis3;
    private int maxWaggons = 10;

    /*
     * Erzeugt die drei Stacks ("Gleise")
     */
    public Bahnhof()
    {
        gleis1 = new Stack();
        gleis2 = new Stack();
        gleis3 = new Stack();
    }
    
    /*
     * F?llt Gleis 1 zuf?llig mit roten und blauen Waggons
     */
    public void fuelleGleis1()
    {
        int i;
        Waggon w;
        for (i = 0; i < maxWaggons; i++)
        {
            if (Math.random() < 0.5)
            {
                w = new Waggon("blau");
            }
            else
            {
                w = new Waggon("rot");
            }
            gleis1.push(w);
        }
    }

    /*
     * Sortiert die Waggons von Gleis 1 nach Farbe;
     * blau -> Gleis 2, rot -> Gleis 3
     */
    public void sortiereGleis1()
    {
        while (!gleis1.isEmpty())
        {
            // hole den vordersten Waggon von Gleis 1
            Waggon w = gleis1.top();
            gleis1.pop();
            // je nach Farbe schiebe ihn nach Gleis 2 oder 3
            if (w.getFarbe().equals("rot"))
            {
                gleis2.push(w);
            }
            else
            {
                gleis3.push(w);
            }
        }
    }
    
    /*
     * Gibt die Waggons eines beliebigen Gleises (d.h. Stacks) aus
     */
    public void ausgabeGleis(Stack<Waggon> gleis)
    {
        // Tempor?rer Stack, auf dem die Waggons zwischengespeichert werden
        Stack<Waggon> temp = new Stack(); 
        Waggon w;

        if (gleis.isEmpty())
        {
            Console.println("(leer)");
        }
        // Hole alle Waggons vom Gleis und gib ihre Farbe aus
        // Speichere sie auf dem tempor?ren Stack
        while (!gleis.isEmpty())
        {
            w = gleis.top();
            Console.println(w.getFarbe());
            temp.push(w);
            gleis.pop();
        }
        // Schiebe den tempor?ren Stack zur?ck
        while (!temp.isEmpty())
        {
            w = temp.top();
            gleis.push(w);
            temp.pop();
        }
    }

    /*
     * Sortiert die Waggons von Gleis 1 auf Gleis 2 und 3
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