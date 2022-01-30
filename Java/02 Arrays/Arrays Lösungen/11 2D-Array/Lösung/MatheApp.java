import java.awt.*;
import console.*;

/*
 * Füllt ein 2D-Array von Zahlen mit verschiedenen Mustern.
 * Die Muster werden auf der Konsole ausgegeben und mit Farben visualisiert.
 * C. Pothmann, 23.09.2020
 */
public class MatheApp
{
    Visualisierung vis;       // stellt die Zahlen-Tabelle mit Farben dar
    ZahlenTabelle tab, otab;  // otab wird für die zusätzliche Spielerei am Ende benutzt, eigentlich nicht notwendig

    public MatheApp()
    {
        vis  = new Visualisierung(800, 800, 100);
        tab  = new ZahlenTabelle(10, 10);
        otab = new ZahlenTabelle(10, 10);
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

    /*
     * Führt die Muster nacheinander aus (Übergang jeweils mit Enter-Taste)
     */
    public void main()
    {
        tab.fuelleLinear();
        vis.zeichne(tab.getTabelle());
        Console.clear();
        Console.println("Gleichmäßig:");
        printTabelle();
        Console.readln();

        tab.fuelleZufall(0, 99);
        vis.zeichne(tab.getTabelle());
        Console.clear();
        Console.println("Zufällige Zahlen:");
        printTabelle();
        Console.readln();

        tab.fuelleEinmaleins();
        vis.zeichne(tab.getTabelle());
        Console.clear();
        Console.println("Einmaleins:");
        printTabelle();
        Console.readln();

        tab.fuelleRaute(99);
        vis.zeichne(tab.getTabelle());
        Console.clear();
        Console.println("Raute:");
        printTabelle();
        Console.readln();

        tab.fuelleSchnecke();
        vis.zeichne(tab.getTabelle());
        Console.clear();
        Console.println("Schnecke:");
        printTabelle();
        Console.readln();
        
        // Zusatz: Tabelle wandelt sich langsam
        int x, y;
        tab.fuelleZufall(0, 99);
        otab.fuelleOffsets();
        while (true)
        {
            vis.zeichne(tab.getTabelle());
            tab.ändereZahlen(otab);
        }
    }
} 