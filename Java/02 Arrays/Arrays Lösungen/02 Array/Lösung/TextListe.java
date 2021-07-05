import console.*;

public class TextListe
{
    private String[] liste;
    
    public TextListe()
    {
        liste = new String[5];
    }
    
    public void main()
    {
        Console.println("Bitte geben Sie 5 Namen ein (danach jeweils Enter).");
        liste[0] = Console.readln();
        liste[1] = Console.readln();
        liste[2] = Console.readln();
        liste[3] = Console.readln();
        liste[4] = Console.readln();
        
        Console.println("Sie haben eingegeben:");
        Console.println(liste[0]);
        Console.println(liste[1]);
        Console.println(liste[2]);
        Console.println(liste[3]);
        Console.println(liste[4]);
    }
}
