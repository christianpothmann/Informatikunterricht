import console.*;

public class Textliste
{
    private String[] liste;
    
    public Textliste()
    {
        liste = new String[5];
    }
    
    public void fragen()
    {
        Console.println("Wie heißt du mit Nachnamen?");
        liste[0] = Console.readln();
        Console.println("Und mit Vornamen?");
        liste[1] = Console.readln();
        Console.println("Wie alt bist du?");
        liste[2] = Console.readln();
        Console.println("Wie ist deine Adresse? (eine Zeile)");
        liste[3] = Console.readln();
        Console.println("Was sind deine Hobbies? (eine Zeile)");
        liste[4] = Console.readln();
    }
    
    public void ausgeben()
    {
        Console.println("Nachname: " + liste[0]);
        Console.println("Vorname:  " + liste[1]);
        Console.println("Alter:    " + liste[2]);
        Console.println("Adresse:  " + liste[3]);
        Console.println("Hobbies:  " + liste[4]);
    }
}
