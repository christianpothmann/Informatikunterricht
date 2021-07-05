import console.*;

/*
 * Hier kommentieren
 */
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

    // ...
    // Hier die Methoden wahlPilot() und reisen() implementieren
    // ...

    public void main()
    {
        // ...
        // Hier den Hauptablauf implementieren
        // ...        
    }
}