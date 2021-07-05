import console.*;

public class WeltraumSim
{
    private Raumschiff rs1, rs2;
    private Pilot p1, p2, p3;
    private Planet pl1, pl2, pl3;

    public WeltraumSim()
    {
        rs1 = new Raumschiff();
        rs2 = new Raumschiff();

        p1  = new Pilot();
        p2  = new Pilot();
        p3  = new Pilot();

        pl1 = new Planet();
        pl2 = new Planet();
        pl3 = new Planet();        
    }

    public void anfangsWerte()
    {
        rs1.setTyp("XWing");
        rs2.setTyp("Falcon");

        p1.setName("Snips");
        p2.setName("Anakin");
        p3.setName("Yoda");

        pl1.setName("Coruscant");
        pl1.setGröße(10000);
        pl2.setName("Tatooine");
        pl2.setGröße(6000);
        pl3.setName("Naboo");
        pl3.setGröße(8000);
    }
    
    public void wahlPilot(Raumschiff rs)
    {
        int wahl;
        
        Console.println("Wähle Pilot für Raumschiff");
        Console.println("Typ: " + rs.getTyp());
        Console.print  ("Welcher Pilot? ");

        wahl = Console.readInt();
        if (wahl == 1)
        {
            rs.setPilot(p1);
            Console.println("Pilot " + p1.getName() + " ausgewählt");
        }
        else if (wahl == 2)
        {
            rs.setPilot(p2);
            Console.println("Pilot " + p2.getName() + " ausgewählt");
        }
        else if (wahl == 3)
        {
            rs.setPilot(p3);
            Console.println("Pilot " + p3.getName() + " ausgewählt");
        }
        Console.println();
    }
    
    public void main()
    {
        anfangsWerte();

        Console.clear();
        wahlPilot(rs1);
        wahlPilot(rs2);
    }
}