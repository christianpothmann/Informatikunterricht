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
        String name;

        if (rs != null)
        {
            Console.println("Welcher Pilot soll das Raumschiff " + rs.getTyp() + " steuern?");
            Console.println(p1.getName() + ", " + p2.getName() + " oder " + p3.getName() + "?");

            Console.print("> ");
            name = Console.readln();

            if (name.equals(p1.getName()))
            {
                rs.setPilot(p1);
            }
            if (name.equals(p2.getName()))
            {
                rs.setPilot(p2);
            }
            if (name.equals(p3.getName()))
            {
                rs.setPilot(p3);
            }
        }
    }

    public void reisen(Raumschiff rs)
    {
        String name;

        if (rs != null)
        {
            Console.println("Wohin soll das Raumschiff " + rs.getTyp() + " fliegen?");
            Console.println(pl1.getName() + ", " + pl2.getName() + " oder " + pl3.getName() + "?");

            Console.print("> ");
            name = Console.readln();

            if (name.equals(pl1.getName()))
            {
                rs.setPlanet(pl1);
            }
            if (name.equals(pl2.getName()))
            {
                rs.setPlanet(pl2);
            }
            if (name.equals(pl3.getName()))
            {
                rs.setPlanet(pl3);
            }
        }
    }

    public void main()
    {
        anfangsWerte();

        Console.clear();
        wahlPilot(rs1);
        wahlPilot(rs2);

        Console.clear();
        reisen(rs1);
        reisen(rs2);
    }
}