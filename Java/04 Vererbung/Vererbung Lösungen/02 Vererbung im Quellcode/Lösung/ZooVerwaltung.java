public class ZooVerwaltung
{
   private LandTier lati;
   private WasserTier wati;

   public ZooVerwaltung()
   {
      lati = new LandTier();
      wati = new WasserTier();
   }

   public void main()
   {
      lati.setArt("Elefant");
      lati.setName("Blümchen");
      lati.setAuslauf(1000.0);

      wati.setArt("Hai");
      wati.setName("Fressi");
      wati.setBeckenVol(200.0);
   }
}