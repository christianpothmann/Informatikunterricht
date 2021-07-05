import pm.gamewindow.*;

/*
 * Bildschirmschoner: Sprites titschen im Fenster hin und her
 * (Name, Datum)
 */
public class Abprallen
{
    private GameWindow window;
    private GameImage img1, img2, img3, img4, img5;
    private Sprite sp1, sp2, sp3, sp4, sp5;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Abprallen()
    {
        img1   = new GameImage("images/ghost red 100x100.png");
        img2   = new GameImage("images/ghost cyan 100x100.png");
        img3   = new GameImage("images/Ghost pink 100x100.png");
        img4   = new GameImage("images/Ghost yellow 100x100.png");
        img5   = new GameImage("images/Ghost blue 100x100.png");
        sp1    = new Sprite(img1);
        sp2    = new Sprite(img2);
        sp3    = new Sprite(img3);
        sp4    = new Sprite(img4);
        sp5    = new Sprite(img5);
        window = new GameWindow(100, 100, 800, 600, "Abprallen");
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        // Sprites auf zufällige Positionen innerhalb des Fensters setzen

        while (true)
        {
            // Sprites bewegen sich und prallen vom Rand ab
            
            // Sprites werden gezeichnet
            window.clear();
            sp1.draw(window);
            sp2.draw(window);
            sp3.draw(window);
            sp4.draw(window);
            sp5.draw(window);
            window.paintFrame();
        }
    }
}
