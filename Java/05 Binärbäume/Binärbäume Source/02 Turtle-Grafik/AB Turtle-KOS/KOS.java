import ch.aplu.turtle.*;

public class KOS
{
    private Turtle tom;

    public KOS()
    {
        tom = new Turtle();
    }

    public void main()
    {
        // Für die Zeichnung
        tom.hideTurtle();

        tom.setPenColor("darkgrey");
        tom.penWidth(2);
        beispiel();
        
        tom.setPenColor("black");
        tom.penWidth(1);
        tom.setPos(0, -200);
        tom.heading(0);
        arrow(400);
        tom.setPos(-200, 0);
        tom.heading(90);
        arrow(400);
        
        tom.setPos(100, 100);
        tom.heading(45);
        tom.setColor("black");
        tom.showTurtle();
    }

    void arrow(double length)
    {
        tom.forward(length);
        tom.left(150);
        tom.forward(15);
        tom.back(15);
        tom.right(300);
        tom.forward(15);
        tom.back(15);
        tom.left(150);
    }
    
    void beispiel()
    {
        tom.setPos(0, 0);
        tom.heading(-45);
        tom.forward(100);
        tom.left(135);
        tom.forward(200);
        tom.left(135);
        tom.forward(50);
        tom.right(45);
        tom.forward(100);
        tom.left(90);
        tom.forward(160);
        tom.right(45);
        tom.forward(30);
    }
}