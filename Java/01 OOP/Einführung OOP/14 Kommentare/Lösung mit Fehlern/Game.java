import pm.gamewindow.*;
/**
 * Ist die Hauptklasse 
 * Führt die anderen Klassen aus
 * (Name) , 23.11.2020
 */

class Game
{
    // Deklaration
    Sprite sp1, sp2;
    // Deklaration
    GameWindow window;
    
    Game()
    {
        sp1 = new Sprite();
        sp2 = new Sprite();
        imgGhost = new GameImage("images/Ghost red 100x115.png");
        window = new GameWindow(100, 100, 800, 600, "Game");
    }
    
    void main()
    {
        sp1.setImage(imgGhost);
        sp2.setImage(imgGhost);
        
        sp1.setPosition(100, 250);
        sp2.setPosition(600, 250);

        sp1.draw(window);
        sp2.draw(window);

        window.paintFrame();
    }
}
