import pm.gamewindow.*;

class Game
{
    Sprite sp1, sp2;
    GameWindow window;
    
    Game()
    {
        sp1 = new Sprite("./images/ghost red 100x100.png");
        sp2 = new Sprite("./images/ghost pink 100x100.png");
        window = new GameWindow(100, 100, 800, 600, "Beispiel");
    }
    
    void main()
    {
        sp1.setPosition(100, 250);
        sp2.setPosition(600, 250);

        sp1.draw(window);
        sp2.draw(window);

        window.paintFrame();
    }
}
