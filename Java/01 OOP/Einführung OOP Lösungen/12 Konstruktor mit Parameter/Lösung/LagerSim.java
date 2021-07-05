class LagerSim
{
    Stapler stp1, stp2;
    
    LagerSim()
    {
        stp1 = new Stapler("Linde", "Meier", 250);
        stp2 = new Stapler("Caterpillar", "Müller", 350);
    }
    
    void main()
    {
        stp1.setLadegewicht(1000);
        stp2.setLadegewicht(500);
    }
}