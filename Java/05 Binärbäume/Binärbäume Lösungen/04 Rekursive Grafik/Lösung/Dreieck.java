import ch.aplu.turtle.*;

/*
 * Zeichnet ein Sierpinsky-Dreieck.
 * C. Pothmann, 2014
 * Überarbeitet 15.06.2021
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
        // Sonderfall: zeichne äußeres Dreieck
        if (tiefe == 0)
        {
            t.setPos(x1, y1);
            t.moveTo(x2, y2);
            t.moveTo(x3, y3);
            t.moveTo(x1, y1);
        }

        // Berechne Mittelpunkte der Seiten
        double mx1 = (x1 + x2) / 2.0;
        double my1 = (y1 + y2) / 2.0;        

        double mx2 = (x2 + x3) / 2.0;
        double my2 = (y2 + y3) / 2.0;

        double mx3 = (x1 + x3) / 2.0;
        double my3 = (y1 + y3) / 2.0;
        
        // Zeichne inneres Dreieck
        t.setPos(mx1, my1);
        t.moveTo(mx2, my2);
        t.moveTo(mx3, my3);
        t.moveTo(mx1, my1);        

        // Rekursion
        if (tiefe < maxtiefe - 1)
        {
            dreieckRekursiv(x1, y1, mx1, my1, mx3, my3, tiefe+1);
            dreieckRekursiv(mx1, my1, x2, y2, mx2, my2, tiefe+1);
            dreieckRekursiv(mx3, my3, mx2, my2, x3, y3, tiefe+1);
        }
    }

    /*
     * Zeichnet das Sierpinsky-Dreieck
     */
    public void main()
    {
        t.clear();
        t.hideTurtle();
        t.setPenColor("black");

        dreieckRekursiv(-350, -300, 0, 300, 350, -300, 0);
    }
}
