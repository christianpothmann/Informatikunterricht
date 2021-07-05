import pm.gamewindow.*;

/*
 * Sprites formen eine Schlange, die dem Mauszeiger folgt
 * C. Pothmann, 30.09.2020
 */
public class Schlange
{
    private GameWindow window;
    private GameImage[] imageList;
    private Sprite[] schlange;
    int schlangenLaenge = 100;
    double abstandSoll = 8.0;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Schlange()
    {
        int i, imgIndex;

        imageList = new GameImage[1];
        imageList[0] = new GameImage("images/bubble-100x100.png");

        for (i = 0; i < imageList.length; i++)
        {
            imageList[i].setScale(0.3);
        }

        schlange = new Sprite[schlangenLaenge];
        for (i = 0; i < schlange.length; i++)
        {
            schlange[i] = new Sprite(imageList[0]);
        }

        window = new GameWindow(100, 100, 1000, 750, "Schlange");
    }

    /*
     * Teile folgen einander; jedes Teil ist etwas langsamer als sein Vorgänger
     */
    public void main()
    {
        int i;

        // Anfangsposition für alle in der Mitte
        schlange[0].setSpeed(5.0);
        for (i = 0; i < schlange.length; i++)
        {
            schlange[i].setPosition((window.getWidth() -schlange[i].getWidth())  / 2,
                                     (window.getHeight()-schlange[i].getHeight()) / 2);
        }

        // Ablauf
        while (true)
        {
            double abstand;
            
            // Kopf bewegen
            schlange[0].dreheZu(window.getMouseX(), window.getMouseY());
            schlange[0].bewege();

            // restl. Glieder folgen
            for (i = 1; i < schlange.length; i++)
            {
                schlange[i].dreheZu(schlange[i-1].getX(), schlange[i-1].getY());
                abstand = schlange[i-1].getAbstand(schlange[i]);
                if (abstand - abstandSoll > 0)
                {
                    schlange[i].setSpeed(abstand - abstandSoll);
                }
                else
                {
                    schlange[i].setSpeed(0);
                }
                schlange[i].bewege();
            }

            // Zeichne Schlange vom Ende bis zum Kopf
            window.clear();            
            for (i = schlange.length - 1; i >= 0; i--)
            {
                schlange[i].draw(window);
            }
            window.paintFrame();
        }
    }

    /*
     * Bewegung der Schlange:
     * Letztes Glied wird einfach nach vorn gesetzt (alle anderen bleiben an Ort und Stelle)
     */
    /*
    public void ersetzen()
    {
        int i;
        int last;       // Index des letzten Sprites der Schlange (rotiert durch alle Teile bis auf den Kopf)
        // Anfangspositionen
        for (i = 0; i < schlange.length; i++)
        {
            schlange[i].setPosition((window.getWidth() -schlange[i].getWidth())  / 2,
                                     (window.getHeight()-schlange[i].getHeight()) / 2);
        }
        schlange[0].setSpeed(8);
        last   = schlange.length - 1;

        // Ablauf
        while (true)
        {
            // Letzten Teil der Schlange an die alte Kopfposition setzen
            schlange[last].setPosition(schlange[0].getX(), schlange[0].getY());

            // Kopf bewegen
            schlange[0].dreheZu(window.getMouseX(), window.getMouseY());
            schlange[0].bewege();

            // Index des letzten Teils verschieben
            last--;
            if (last == 0)
            {
                last = schlange.length - 1;
            }

            // Zeichne Schlange vom Ende bis zum Kopf
            window.clear();            
            for (i = last; i > 0; i--)
            {
                schlange[i].draw(window);
            }
            for (i = schlange.length - 1; i > last; i--)
            {
                schlange[i].draw(window);
            }
            schlange[0].draw(window);
            window.paintFrame();
        }
    }
    */
}
