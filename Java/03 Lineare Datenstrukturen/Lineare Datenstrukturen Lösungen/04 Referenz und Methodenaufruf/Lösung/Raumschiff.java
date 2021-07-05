public class Raumschiff
{
    private String typ;
    private Pilot pil;
    private Planet pla;

    public void setTyp(String pt)
    {
        typ = pt;
    }

    public String getTyp()
    {
        return typ;
    }

    public void setPilot(Pilot pp)
    {
        pil = pp;
    }

    public Pilot getPilot()
    {
        return pil;
    }

    public void setPlanet(Planet pp)
    {
        pla = pp;
    }

    public Planet getPlanet()
    {
        return pla;
    }
}