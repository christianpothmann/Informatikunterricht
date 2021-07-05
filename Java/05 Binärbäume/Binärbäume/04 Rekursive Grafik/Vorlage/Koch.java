import ch.aplu.turtle.*;

/*
 * Zeichnet eine Schneeflocke aus drei Koch-Kurven
 * (Name, Datum)
 */
public class Koch
{
    private TurtleFrame frame;
    private Turtle t;

    public Koch()
    {
        frame = new TurtleFrame("Rekursion", 800, 800);
        t = new Turtle(frame);
    }

    /*
     * Zeichnet rekursiv eine Seite des Koch-Sterns.
     * Die Turtle muss vor jedem Aufruf an der richtigen Stelle stehen und in die richtige Richtung schauen.
     * Gezeichnet werden nur die Linien in der untersten Rekursionstiefe.
     * @param länge Gibt die Länge der Linie an
     */
    public void kochRekursiv(double länge)
    {
        // ...
    }

    /*
     * Zeichnet eine Schneeflocke aus drei Kochkurven
     */
    public void main()
    {
        t.setPenColor("black");        
        t.hideTurtle();

        // ...
    }
}
