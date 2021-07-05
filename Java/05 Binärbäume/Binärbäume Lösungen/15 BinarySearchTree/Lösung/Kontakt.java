/*
 * Ein "Kontakt"-Objekt enthält die Daten für einen Kontakt.
 * Für BinarySearchTree wird das Interface ComparableContent implementiert.
 * C. Pothmann, 04.07.2021
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
        if (nachname.compareTo(pk.getNachname()) > 0)
        {
            return true;
        }
        return false;
    }

    public boolean isLess(Kontakt pk)
    {
        if (nachname.compareTo(pk.getNachname()) < 0)
        {
            return true;
        }
        return false;
    }
    
    public boolean isEqual(Kontakt pk)
    {
        if (nachname.equals(pk.getNachname()))
        {
            return true;
        }
        return false;
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