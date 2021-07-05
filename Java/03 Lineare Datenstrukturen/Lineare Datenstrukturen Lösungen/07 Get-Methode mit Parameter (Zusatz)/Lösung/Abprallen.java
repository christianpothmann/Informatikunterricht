import pm.gamewindow.*;

/*
 * Bildschirmschoner: Sprites titschen im Fenster hin und her
 * C. Pothmann, 31.03.2020
 */
public class Abprallen
{
    private GameWindow window;
    private GameImage img1, img2, img3, img4, img5;
    private Sprite sp1, sp2, sp3, sp4, sp5;

    /*
     * Erzeugt Grafikfenster, l�dt Bilder, erzeugt Sprites
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
        sp1.setPosition(Math.random() * (window.getWidth() - sp1.getWidth()), Math.random() * (window.getHeight() - sp1.getHeight()));
        sp1.setRichtung(Math.random() * 360.0);
        sp1.setSpeed(Math.random() * 10.0 + 5.0);
        
        sp2.setPosition(Math.random() * (window.getWidth() - sp2.getWidth()), Math.random() * (window.getHeight() - sp2.getHeight()));
        sp2.setRichtung(Math.random() * 360.0);
        sp2.setSpeed(Math.random() * 10.0 + 5.0);

        sp3.setPosition(Math.random() * (window.getWidth() - sp3.getWidth()), Math.random() * (window.getHeight() - sp3.getHeight()));
        sp3.setRichtung(Math.random() * 360.0);
        sp3.setSpeed(Math.random() * 10.0 + 5.0);

        sp4.setPosition(Math.random() * (window.getWidth() - sp4.getWidth()), Math.random() * (window.getHeight() - sp4.getHeight()));
        sp4.setRichtung(Math.random() * 360.0);
        sp4.setSpeed(Math.random() * 10.0 + 5.0);

        sp5.setPosition(Math.random() * (window.getWidth() - sp5.getWidth()), Math.random() * (window.getHeight() - sp5.getHeight()));
        sp5.setRichtung(Math.random() * 360.0);
        sp5.setSpeed(Math.random() * 10.0 + 5.0);

        while (true)
        {
            sp1.bewege();
            if (sp1.ber�hrtOben(window)  || sp1.ber�hrtUnten(window))  sp1.pralleAbHorizontal();
            if (sp1.ber�hrtLinks(window) || sp1.ber�hrtRechts(window)) sp1.pralleAbVertikal();
            sp2.bewege();
            if (sp2.ber�hrtOben(window)  || sp2.ber�hrtUnten(window))  sp2.pralleAbHorizontal();
            if (sp2.ber�hrtLinks(window) || sp2.ber�hrtRechts(window)) sp2.pralleAbVertikal();
            sp3.bewege();
            if (sp3.ber�hrtOben(window)  || sp3.ber�hrtUnten(window))  sp3.pralleAbHorizontal();
            if (sp3.ber�hrtLinks(window) || sp3.ber�hrtRechts(window)) sp3.pralleAbVertikal();
            sp4.bewege();
            if (sp4.ber�hrtOben(window)  || sp4.ber�hrtUnten(window))  sp4.pralleAbHorizontal();
            if (sp4.ber�hrtLinks(window) || sp4.ber�hrtRechts(window)) sp4.pralleAbVertikal();
            sp5.bewege();
            if (sp5.ber�hrtOben(window)  || sp5.ber�hrtUnten(window))  sp5.pralleAbHorizontal();
            if (sp5.ber�hrtLinks(window) || sp5.ber�hrtRechts(window)) sp5.pralleAbVertikal();
            
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
