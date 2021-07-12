import java.nio.file.*;
import console.*;

/*
 * Beispielprogramm für die Klassen DatabaseConnector und QueryResult
 * für Abfragen an eine SQLite-Datenbankdatei.
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
     * Öffnet eine Verbindung mit der SQLite-Datei
     * und ruft die Methoden für die Datenbankabfragen auf.
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
     * Ermittelt die Länder Europas und gibt sie auf der Konsole aus
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
