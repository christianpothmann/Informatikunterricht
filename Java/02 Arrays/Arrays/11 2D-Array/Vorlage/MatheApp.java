import java.awt.*;
import console.*;

/*
 * Füllt ein 2D-Array von Zahlen mit verschiedenen Mustern.
 * Die Muster werden auf der Konsole ausgegeben und mit Farben visualisiert.
 * (Name, Datum)
 */
public class MatheApp
{
    Visualisierung vis;
    ZahlenTabelle tab;
    
    public MatheApp()
    {
        vis = new Visualisierung(800, 800, 100);
        tab = new ZahlenTabelle(10, 10);
        vis.fuellePalette(Color.BLACK, new Color(255, 0, 255));
    }

    /*
     * Gibt die Tabelle auf der Konsole aus.
     */
    public void printTabelle()
    {
        int x, y;
        for (y = 0; y < tab.getHoehe(); y++)
        {
            for (x = 0; x < tab.getBreite(); x++)
            {
                System.out.printf("%02d ", tab.getTabelle()[x][y]);
            }
            System.out.println();
        }
    }

    public void main()
    {
        tab.fuelleLinear();
        vis.zeichne(tab.getTabelle());
        Console.clear();
        Console.println("Gleichmäßig:");
        printTabelle();
        Console.readln();

        // Aufruf Weiterer Füllmuster nach dem gleichen Schema
        // ...
    }
}