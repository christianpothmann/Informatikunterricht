import ch.aplu.turtle.*;

/*
 * Zeichnet eine Schneeflocke aus drei Koch-Kurven
 * C. Pothmann, 2014
 * Überarbeitet 15.06.2021
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
     * Zeichnet rekursiv eine Koch-Kurve.
     * Die Turtle muss vor jedem Aufruf an der richtigen Stelle stehen und in die richtige Richtung schauen.
     * Gezeichnet werden nur die Linien in der untersten Rekursionstiefe.
     * @param länge Gibt die Länge der Linie an
     */
    public void kochRekursiv(double länge)
    {
        if (länge <= 3.0)
        {
            t.forward(länge);
        }
        else 
        {
            länge = länge / 3.0;
            kochRekursiv(länge);
            t.left(60.0);            
            kochRekursiv(länge);
            t.right(120.0);
            kochRekursiv(länge);
            t.left(60.0);
            kochRekursiv(länge);
        }
    }

    /*
     * Zeichnet eine Schneeflocke aus drei Kochkurven
     */
    public void main()
    {
        t.setPenColor("black");        
        t.hideTurtle();

        t.setPos(-300.0, 180.0);
        t.heading(90);
        kochRekursiv(600.0);
        t.right(120);
        kochRekursiv(600.0);
        t.right(120);
        kochRekursiv(600.0);
    }
}
