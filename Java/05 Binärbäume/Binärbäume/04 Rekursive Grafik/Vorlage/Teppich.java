import ch.aplu.turtle.*;
import java.awt.Dimension;

/*
 * Zeichnet den rekursiven Sierpinski-Teppich
 * (Name, Datum)
 */
public class Teppich
{
    private TurtleFrame frame;
    private Turtle t;

    public Teppich()
    {
        frame = new TurtleFrame("Rekursion", 800, 800);
        t = new Turtle(frame);
    }

    // Hilfsmethode, die ein Quadrat zeichnet
    public void quadrat(double länge)
    {
        // ...
    }
    
    /*
     * Zeichnet den "Teppich": Quadrat in der Mitte, links/rechts/oben/unten rekursiv weiter
     * @param länge gibt die Seitenlänge des aktuellen Quadrats an
     */
    public void teppichRekursiv(double länge)
    {
        // ...
    }

    public void main()
    {
        t.clear();
        t.setPenColor("black");
        t.hideTurtle();
        
        // Turtle an Anfangsposition setzen ...
        // Rekursion aufrufen ...
    }
}
