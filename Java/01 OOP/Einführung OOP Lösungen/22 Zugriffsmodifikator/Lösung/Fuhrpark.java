public class Fuhrpark
{
   private Fahrzeug f1, f2;

   public Fuhrpark()
   {
      f1 = new Fahrzeug(50.0);
      f2 = new Fahrzeug(70.0);
   }

   public void main()
   {
      f1.fahren(450.0);
      f2.fahren(550.0);

      if (f1.getF�llstand() < 10.0)
      {
         f1.tanken(f1.getTankGr��e() - f1.getF�llstand());
      }
      if (f2.getF�llstand() < 10.0)
      {
         f2.tanken(f2.getTankGr��e() - f2.getF�llstand());
      }
   }
}