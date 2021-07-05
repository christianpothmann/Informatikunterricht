import ch.aplu.turtle.*;

/*
 * Zeichnet einen Baum mithilfe von Rekursion
 * C. Pothmann, 16.04.2016
 * überarbeitet 11.06.2021
 */
public class Baum
{
    private TurtleFrame frame;
    private Turtle t;

    public Baum()
    {
        frame = new TurtleFrame("Rekursion", 800, 800);
        t = new Turtle(frame);
    }

    /*
     * Zeichnet einen rekursiven Baum. Die Äste verkürzen sich jeweils um 1/3
     * @param länge gibt die Länge des aktuellen "Ast" an.
     */
    public void baumRekursiv(double länge)
    {
        // Grundform
        t.forward(länge);

        // Rekursion
        if (länge > 3)
        {
            // Ast nach links
            t.left(45);
            baumRekursiv(länge * 0.67);
            // Ast nach rechts
            t.right(90);
            baumRekursiv(länge * 0.67);
            // Drehe in ursprüngliche Richtung
            t.left(45);
        }
        
        // zurück zur Ausgangsposition
        t.penUp();
        t.back(länge);
        t.penDown();
    }
    
    public void main()
    {
        // Verstecke die Turtle, damit es schneller geht
        t.hideTurtle();
        // Anfangsposition
        t.setPos(0, -250);
        t.heading(0);
        // Rekursive Zeichnung
        baumRekursiv(200);
    }
}
