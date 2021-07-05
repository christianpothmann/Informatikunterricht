import ch.aplu.turtle.*;

/*
 * Übungen zum Einstieg in die Turtle-Grafik
 * C. Pothmann, 09.06.2021
 */
public class Zeichnungen
{
    private Turtle t;
    
    /*
     * Erzeugt die Turtle (mit Fenster 400x400)
     */
    public Zeichnungen()
    {
        t = new Turtle();
        t.hideTurtle();
        t.setPenColor("black");
    }

    /*
     * Linie mit Knick
     */
    public void aufgabe1()
    {
        // Anfangsposition
        t.clear();
        t.setPos(-150.0, 0.0);
        t.heading(90.0);
        
        // Linie mit Knick
        t.forward(100);
        t.right(60);
        t.forward(100);
        t.left(120);
        t.forward(100);
        t.right(60);
        t.forward(100);
    }

    /*
     * Quadrat mit Diagonalen
     */
    public void aufgabe2()
    {
        double seite = 200.0;

        // Anfangsposition
        t.clear();
        t.setPos(-seite/2, seite/2);
        t.heading(90.0);
        
        // Quadrat
        t.forward(seite);
        t.right(90);
        t.forward(seite);
        t.right(90);
        t.forward(seite);
        t.right(90);
        t.forward(seite);
        t.right(90);

        // Diagonalen
        t.right(45);
        t.forward(Math.sqrt(2*seite*seite));
        t.penUp();
        t.left(135);
        t.forward(seite);
        t.left(135);
        t.penDown();
        t.forward(Math.sqrt(2*seite*seite));
    }

    /*
     * Regelmäßiges n-Eck mit Seitenlänge pSeite
     */
    public void aufgabe3(int pn, double pSeite)
    {
        int i;
        double winkel;
        
        // Anfangsposition
        t.clear();
        t.setPos(-pSeite / 2.0, -150.0);
        t.heading(90.0);
        
        if (pn < 3) 
        {
            t.forward(pSeite);
        }
        else
        {
            winkel = 180 - (360.0 / pn);

            for (i = 0; i < pn; i++)
            {
                t.forward(pSeite);
                t.left(180.0 - winkel);
            }
        }
    }
}
