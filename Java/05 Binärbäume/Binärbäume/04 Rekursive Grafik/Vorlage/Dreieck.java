import ch.aplu.turtle.*;

/*
 * Zeichnet ein Sierpinsky-Dreieck.
 * (Name, Datum)
 */
public class Dreieck
{
    private TurtleFrame frame;
    private Turtle t;
    private int maxtiefe;   // bis zu welcher Tiefe sich die Rekursion wiederholt

    public Dreieck()
    {
        frame = new TurtleFrame("Rekursion", 800, 800);
        t = new Turtle(frame);
        maxtiefe = 7;
    }
        
    /*
     * Zeichnet ein Dreieck mit den Eckpunkten x1/y1, x2/y2, x3/y3 
     * sowie ein Dreieck mit den Mittelpunkten der Seiten
     * Das Mitteldreieck wird dann rekursiv wiederholt für die Teildreiecke oben / links / rechts.
     */
    public void dreieckRekursiv(double x1, double y1, double x2, double y2, double x3, double y3, int tiefe)
    {
        // ...
    }

    /*
     * Zeichnet das Sierpinsky-Dreieck
     */
    public void main()
    {
        t.clear();
        t.hideTurtle();
        t.setPenColor("black");

        // ... Rekursion starten
    }
}
