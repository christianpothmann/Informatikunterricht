import java.nio.file.*;
import console.*;

/*
 * Beispielprogramm f�r die Klassen DatabaseConnector und QueryResult
 * f�r Abfragen an eine SQLite-Datenbankdatei.
 * (Name, Datum)
 */
public class DBBeispiel
{
    private DatabaseConnector dbCon;
    private String dateiname = "terra.db";

    public DBBeispiel()    // dbCon wird in main() erzeugt
    { 
    }

    /*
     * �ffnet eine Verbindung mit der SQLite-Datei
     * und ruft die Methoden f�r die Datenbankabfragen auf.
     */
    public void main() 
    {
        // Verbindung aufbauen
        // ...

        // Abfragen an die Datenbank
        Console.clear();
        europa();
        Console.println();
        englisch();
    }

    /* 
     * Ermittelt die L�nder Europas und gibt sie auf der Konsole aus
     */
    public void europa() 
    {
        // ...
    }

    /*
     * Ermittelt Anzahl Menschen weltweit, die Englisch sprechen und gibt sie aus
     */
    public void englisch()
    {
        // ...
    }
}
