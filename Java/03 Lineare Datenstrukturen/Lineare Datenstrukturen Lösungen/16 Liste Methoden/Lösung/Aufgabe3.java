/*
 * Vertauscht zwei Elemente einer Liste
 * Musterlösung, C. Pothmann, 25.03.2021
 */
public class Aufgabe3
{
    private List<String> liste;

    public Aufgabe3()
    {
        liste = new List();
    }

    public void fuellen()
    {
        liste.append("Rot");
        liste.append("Blau");
        liste.append("Gelb");
        liste.append("Grün");
        liste.append("Lila");
        liste.append("Braun");
        liste.append("Pink");
        liste.append("Orange");
        liste.append("Grau");
    }

    /*
     * Vertauschen, ohne Sonderfälle
     * Annahme: es gibt genügend Elemente in der Liste
     */
    public void vertauschen()
    {
        String s2, s4;

        liste.toFirst();
        liste.next();
        s2 = liste.getContent();
        liste.next();
        liste.next();
        s4 = liste.getContent();
        liste.insert(s2);
        liste.remove();
        liste.toFirst();
        liste.next();
        liste.insert(s4);
        liste.remove();
    }

    /*
     * Vertauschen, mit Sonderfällen
     * Es können weniger als 4 oder sogar weniger als 2 Elemente in der Liste sein.
     */
    public void vertauschen2()
    {
        String s2, s4;

        if (!liste.isEmpty())
        {
            liste.toFirst();
            liste.next();
            s2 = liste.getContent();
            liste.next();
            liste.next();
            s4 = liste.getContent();

            if (liste.hasAccess())
            {
                liste.insert(s2);
                liste.remove();
                liste.toFirst();
                liste.next();
                liste.insert(s4);
                liste.remove();
            }
        }
    }

    /*
     * Vertauschen parametrisiert
     * Falls pos1 oder pos2 negativ, oder nicht genügend Elemente in der Liste vorhanden sind,
     * passiert nichts.
     */
    public void vertauschen3(int pos1, int pos2)
    {
        int i;
        String s1, s2;

        // Sonderfälle: pos1 oder pos2 negativ oder beide gleich
        if (pos1 < 0 || pos2 < 0 || pos1 == pos2)
        {
            return;
        }
        // Sonderfall: pos1 > pos2 -> umtauschen
        if (pos1 > pos2)
        {
            int t;
            t = pos1;
            pos1 = pos2;
            pos2 = t;
        }
        liste.toFirst();
        for (i = 0; i < pos1; i++)
        {
            liste.next();
        }
        s1 = liste.getContent();
        for (i = 0; i < pos2 - pos1; i++)
        {
            liste.next();
        }
        s2 = liste.getContent();
        // Sonderfall: weniger als pos2 Elemente vorhanden
        if (!liste.hasAccess())
        {
            return;
        }
        liste.insert(s1);
        liste.remove();
        liste.toFirst();
        for (i = 0; i < pos1; i++)
        {
            liste.next();
        }
        liste.insert(s2);
        liste.remove();
    }
}   

