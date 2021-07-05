/**
 * Stellt einen Sprite dar 
 * (Name), 23.11.2020
 */

import pm.gamewindow.*;

class Sprite
{
    // Koordinaten (in Grad)
    // (Oben Links)
    double x, y;
    // In welche Richtung es sich dreht (in Grad)
    double richtung;
    // Um wie viele Einheiten es sich bewegt
    double speed;
    // Deklaration, Aussehen des Sprites
    GameImage image;
    
    // Legt das Bild des Sprites mit pdatei fest
    Sprite(String pdatei)
    {
        image = new GameImage(pdatei);
    }
    
    // Legt die Position des Sprites mit px und py fest
    void setPosition(double px, double py)
    {
        x = px;
        y = py;
    }
    
    // Legt den Speed wert mit ps fest
    void setSpeed(double ps)
    {
        speed = ps;
    }

    // Legt Richtung mit pr fest
    void setRichtung(double pr)
    {
        richtung = pr;
    }
    
    // Bewegt den Sprite
    void bewege()
    {
        x = x + Math.cos(richtung * Math.PI / 180.0) * speed;
        y = y + Math.sin(richtung * Math.PI / 180.0) * speed;
    }
    
    // Zeichnet den Sprite ins Fenster ein
    void draw(GameWindow gwin)
    {
        gwin.drawImage(image, (int)x, (int)y);
    }
}
