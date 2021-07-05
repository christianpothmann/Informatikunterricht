import pm.gamewindow.*;

/*
 * Sprites formen eine Schlange, die dem Mauszeiger folgt
 * (Name, Datum)
 */
public class Schlange
{
    private GameWindow window;
    private GameImage image;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Schlange()
    {
        image = new GameImage("images/bubble-100x100.png");
        window = new GameWindow(100, 100, 1000, 750, "Schlange");
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
    }
}
