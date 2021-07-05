class LKW
{
    double kmStand, tank;
    
    void fahren()
    {
        kmStand = kmStand + 100;
        tank = tank - 20;
    }
    
    void tanken()
    {
        tank = tank + 50;
    }
}