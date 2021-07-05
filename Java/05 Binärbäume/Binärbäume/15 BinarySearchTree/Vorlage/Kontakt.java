/*
 * Ein "Kontakt"-Objekt enthält die Daten für einen Kontakt.
 * C. Pothmann, 06.03.2017
 */
public class Kontakt implements ComparableContent<Kontakt>
{
    private String nachname, vorname;
    private String telefon;
    private String email;
    
    public Kontakt()
    {
    }
    
    public Kontakt(String pnachname, String pvorname, String ptelefon, String pemail)
    {
        nachname = pnachname;
        vorname  = pvorname;
        telefon  = ptelefon;
        email    = pemail;
    }

    public boolean isGreater(Kontakt pk)
    {
        // ...
    }

    public boolean isLess(Kontakt pk)
    {
        // ...
    }
    
    public boolean isEqual(Kontakt pk)
    {
        // ...
    }    

    public String getNachname()
    {
        return nachname;
    }
    
    public void setNachname(String pnachname)
    {
        nachname = pnachname;
    }
    
    public String getVorname()
    {
        return vorname;
    }
    
    public void setVorname(String pvorname)
    {
        vorname = pvorname;
    }

    public String getTelefon()
    {
        return telefon;
    }
    
    public void setTelefon(String ptelefon)
    {
        telefon = ptelefon;
    }

    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String pemail)
    {
        email = pemail;
    }
}