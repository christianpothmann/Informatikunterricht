import ch.aplu.turtle.*;

/*
 * Zeichnet einen Baum mithilfe von Rekursion
 * (Name, Datum)
 */
public class Baum
{
    private TurtleFrame frame;
    private Turtle t;

    public Baum()
    {
        frame = new TurtleFrame("Rekursion", 800, 600);
        t = new Turtle(frame);
    }

    /*
     * Zeichnet einen rekursiven Baum
     * @param länge gibt die Länge des aktuellen "Ast" an.
     */
    public void baumRekursiv(double länge)
    {
        // Grundform ...

        // Rekursion ...
		
        // Weg zurück ...
    }
	
	public void main()
	{
        t.hideTurtle();
        t.setPos(0, -250);
        t.heading(0);

        baumRekursiv(200);
	}
}
