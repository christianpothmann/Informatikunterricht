import ch.aplu.turtle.*;

/*
 * Zeichnet den rekursiven Sierpinski-Teppich
 * C. Pothmann, 2014
 * überarbeitet 15.06.2021
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
        t.forward(länge);
        t.right(90);
        t.forward(länge);
        t.right(90);
        t.forward(länge);
        t.right(90);
        t.forward(länge);
        t.right(90);
    }
    
    /*
     * Zeichnet den "Teppich": Quadrat in der Mitte, links/rechts/oben/unten rekursiv weiter
     * @param länge gibt die Seitenlänge des aktuellen Quadrats an
     */
    public void teppichRekursiv(double länge)
    {
        t.penDown();
        quadrat(länge);
        t.penUp();        

        if (länge > 3.0)
        {
            // 1. links
            t.left(90.0);
            t.forward(länge * 2.0 / 3.0);
            t.right(90.0);
            t.forward(länge / 3.0);
            teppichRekursiv(länge / 3.0);

            // 2. links oben
            t.forward(länge);
            teppichRekursiv(länge / 3.0);

            // 3. oben
            t.right(90.0);
            t.forward(länge);
            t.left(90.0);
            teppichRekursiv(länge / 3.0);

            // 4. rechts oben
            t.right(90.0);
            t.forward(länge);
            t.left(90.0);
            teppichRekursiv(länge / 3.0);

            // 5. rechts
            t.left(180.0);
            t.forward(länge);
            t.right(180.0);
            teppichRekursiv(länge / 3.0);

            // 6. rechts unten
            t.left(180.0);
            t.forward(länge);
            t.right(180.0);
            teppichRekursiv(länge / 3.0);

            // 7. unten
            t.left(90.0);
            t.forward(länge);
            t.right(90.0);
            teppichRekursiv(länge / 3.0);

            // 8. unten links
            t.left(90.0);
            t.forward(länge);
            t.right(90.0);
            teppichRekursiv(länge / 3.0);

            // 9. zurück zum Ausgangspunkt
            t.forward(länge * 2.0 / 3.0);
            t.right(90.0);
            t.forward(länge * 2.0 / 3.0);
            t.left(90.0);
        }
    }

    public void main()
    {
        t.clear();
        t.setPenColor("black");
        t.hideTurtle();

        t.setPos(-122.0, -122.0);
        t.heading(0);

        // Länge, die sich mehrmals durch 3 teilen lässt
        teppichRekursiv(243.0);
    }
}
