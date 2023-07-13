import pm.gamewindow.*;

/*
 * Bildschirmschoner: Sprites bewegen sich auf Kreisbahnen
 * C. Pothmann, 23.09.2020
 */
public class Drehen
{
    private GameWindow window;
    private GameImage[] imageList;
    private Sprite[][] spriteList;
    int zeilen = 7, spalten = 7;     // Anzahl Zeien / Spalten des 2D-Arrays

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Drehen()
    {
        int i, x, y, imgIndex;

        imageList = new GameImage[5];
        imageList[0] = new GameImage("images/ghost red 100x100.png");
        imageList[1] = new GameImage("images/ghost pink 100x100.png");
        imageList[2] = new GameImage("images/ghost cyan 100x100.png");
        imageList[3] = new GameImage("images/ghost yellow 100x100.png");
        imageList[4] = new GameImage("images/ghost blue 100x100.png");

        for (i = 0; i < imageList.length; i++)
        {
            imageList[i].setScale(0.4);
        }

        spriteList = new Sprite[spalten][zeilen];
        imgIndex = 0;
        for (x = 0; x < spalten; x++)
        {
            for (y = 0; y < zeilen; y++)
            {
                imgIndex = (imgIndex + 1) % imageList.length;
                spriteList[x][y] = new Sprite(imageList[imgIndex]);
            }
        }

        window = new GameWindow(50, 50, 810, 810, "Abprallen");
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        int x, y;
        
        // Anfangspositionen
        for (x = 0; x < spalten; x++)
        {
            for (y = 0; y < zeilen; y++)
            {
                spriteList[x][y].setPosition(75 + 100 * x, 50 + 100 * y);
                spriteList[x][y].setRichtung(0);
                spriteList[x][y].setSpeed(5);
            }
        }

        // Ablauf
        while (true)
        {
            window.clear();            

            // Sprites bewegen und zeichnen
            for (x = 0; x < spalten; x++)
            {
                for (y = 0; y < zeilen; y++)                
                {
                    spriteList[x][y].bewege();
                    spriteList[x][y].dreheRechts(15);
                    spriteList[x][y].draw(window);
                }
            }

            window.paintFrame();
        }
    }
}
