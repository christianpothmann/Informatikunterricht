import console.*;

/*
 * Hauptklasse fuer die Zahlenliste
 * C. Pothmann, 28.01.2022
 */
public class MatheApp
{
    private Zahlenliste zl;
    
    public MatheApp()
    {
        zl = new Zahlenliste();
    }
    
    public void main()
    {
        Console.clear();
        Console.println("Original-Liste:");
        zl.ausgeben();

        Console.println("Erstes und letztes vertauscht::");
        zl.erstesLetztes();
        zl.ausgeben();

        Console.println("Alle Elemente eine Position nach links:");
        zl.schiebeLinks();
        zl.ausgeben();

        Console.println("Alle Elemente eine Position nach rechts:");
        zl.schiebeRechts();
        zl.ausgeben();

        Console.println("Die Reihenfolge aller Elemente wird umgedreht:");
        zl.reihenfolgeUmdrehen();
        zl.ausgeben();

        Console.println("Das Array wird gemischt:");
        zl.mischen();
        zl.ausgeben();

        Console.println("Alle negativen Elemente werden gelöscht:");        
        zl.negativeLoeschen();
        zl.ausgeben();
    }
}