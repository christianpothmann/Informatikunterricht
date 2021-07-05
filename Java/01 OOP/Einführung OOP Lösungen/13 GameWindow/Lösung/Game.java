import pm.gamewindow.*;

class Game
{
    Sprite sp1, sp2, sp3, sp4, sp5;
    GameWindow window;
    
    Game()
    {
        window = new GameWindow(50, 50, 800, 600, "Beispiel");
        sp1 = new Sprite("./images/pacman 100x100.png");
        sp2 = new Sprite("./images/ghost red 100x100.png");
        sp3 = new Sprite("./images/ghost pink 100x100.png");
        sp4 = new Sprite("./images/ghost cyan 100x100.png");
        sp5 = new Sprite("./images/ghost yellow 100x100.png");
    }
    
    void main()
    {       
        sp1.setPosition(350, 250);
        sp2.setPosition(100, 100);
        sp3.setPosition(600, 100);
        sp4.setPosition(100, 400);
        sp5.setPosition(600, 400);

        sp1.draw(window);
        sp2.draw(window);
        sp3.draw(window);
        sp4.draw(window);
        sp5.draw(window);

        window.paintFrame();
    }
}
