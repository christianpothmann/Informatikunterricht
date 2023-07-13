import pm.gamewindow.*;

/*
 * Bildschirmschoner: Sprites titschen im Fenster hin und her
 * C. Pothmann, 23.09.2020
 */
public class Abprallen
{
    private GameWindow window;
    private GameImage[] imageList;
    private Sprite[] spriteList;
    int maxSprites = 20;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Abprallen()
    {
        int i, imgIndex;

        imageList = new GameImage[7];
        imageList[0] = new GameImage("images/ghost red 100x100.png");
        imageList[1] = new GameImage("images/ghost pink 100x100.png");
        imageList[2] = new GameImage("images/ghost cyan 100x100.png");
        imageList[3] = new GameImage("images/ghost yellow 100x100.png");
        imageList[4] = new GameImage("images/ghost blue 100x100.png");
        imageList[5] = new GameImage("images/ghost white 100x100.png");
        imageList[6] = new GameImage("images/pacman 100x100.png");

        for (i = 0; i < imageList.length; i++)
        {
            imageList[i].setScale(0.4);
        }

        spriteList = new Sprite[maxSprites];
        for (i = 0; i < spriteList.length; i++)
        {
            imgIndex = (int)(Math.random() * imageList.length);
            spriteList[i] = new Sprite(imageList[imgIndex]);
        }

        window = new GameWindow(50, 50, 640, 480, "Abprallen");
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        int i;
        
        // Anfangspositionen
        for (i = 0; i < spriteList.length; i++)
        {
            spriteList[i].setPosition(Math.random() * (window.getWidth() - spriteList[i].getWidth()), Math.random() * (window.getHeight() - spriteList[i].getHeight()));
            spriteList[i].setRichtung(Math.random() * 360.0);
            spriteList[i].setSpeed(Math.random() * 10.0 + 5.0);
        }

        // Ablauf
        while (true)
        {
            // Sprites bewegen
            for (i = 0; i < spriteList.length; i++)
            {
                spriteList[i].bewege();
                if (spriteList[i].berührtOben(window) || spriteList[i].berührtUnten(window))
                {
                    spriteList[i].pralleAbHorizontal();
                }
                if (spriteList[i].berührtLinks(window) || spriteList[i].berührtRechts(window)) 
                {
                    spriteList[i].pralleAbVertikal();
                }
            }

            // Zeichnen
            window.clear();            
            for (i = 0; i < spriteList.length; i++)
            {
                spriteList[i].draw(window);
            }
            window.paintFrame();
        }
    }
}
