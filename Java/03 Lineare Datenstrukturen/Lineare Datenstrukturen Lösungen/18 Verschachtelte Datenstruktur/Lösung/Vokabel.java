/*
 * Ein "Kontakt"-Objekt enthält die Daten für einen Kontakt.
 * C. Pothmann, 06.03.2017
 */
public class Vokabel
{
    private String begriff;
    private List<String> üListe;
    
    public Vokabel(String pb)
    {
        begriff = pb;
        üListe = new List();
    }
    
    public String getBegriff()
    {
        return begriff;
    }

    public void übersHinzufügen(String pü)
    {
        üListe.append(pü);
    }
    
    public List<String> getÜbersetzungen()
    {
        return üListe;
    }
}