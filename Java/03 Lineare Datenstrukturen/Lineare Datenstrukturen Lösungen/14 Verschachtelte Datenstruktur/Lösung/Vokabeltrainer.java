import console.*;

/*
 * Vokabeltrainer (Musterlösung)
 * Vokabeln können eingefügt und ausgegeben werden.
 * C. Pothmann, 06.06.2021
 */
public class Vokabeltrainer
{
    private List<Vokabel> vListe;

    public Vokabeltrainer()
    {
        vListe = new List();
    }

    /*
     * Der Benutzer gibt die Daten für eine neue Vokabel ein.
     */
    public void hinzufügen()
    {
        String begriff, übers;
        Vokabel vok;
        char weiter;
        
        Console.println("== Neue Vokabel ==");
        Console.print("Begriff: ");
        begriff = Console.readln();
        vok = new Vokabel(begriff);

        do 
        {
            Console.print("Übersetzung: ");
            übers = Console.readln();
            vok.übersHinzufügen(übers);

            Console.print("Noch eine? (j/n): ");
            weiter = Console.readChar();
        } while (weiter != 'n');
        
        vListe.append(vok);
        Console.println("Vokabel hinzugefügt.");
        Console.readln();
    }

    /*
     * Gibt alle Vokabeln mit Übersetzungen auf der Konsole aus.
     */
    public void ausgeben()
    {
        Vokabel v;
        List<String> ül;

        vListe.toFirst();
        while (vListe.hasAccess())
        {
            v = vListe.getContent();
            Console.print(v.getBegriff() + ": ");
            
            ül = v.getÜbersetzungen();
            ül.toFirst();
            while (ül.hasAccess())
            {
                Console.print(ül.getContent());
                ül.next();
                if (ül.hasAccess())
                {
                    Console.print(", ");   
                }
            }
            Console.println();
            vListe.next();
        }
        Console.readln();
    }     

    /*
     * Lässt Benutzer einige Vokabeln eingeben und gibt dann alle aus.
     */
    public void main()
    {
        char weiter;

        do 
        {
            hinzufügen();
            Console.print("Weitere Vokabel? (j/n): ");
            weiter = Console.readChar();
        } while (weiter != 'n');
        
        ausgeben();
    }
}   

