import console.*;

/*
 * Benutzerschnittstelle für das Adressbuch mit BinarySearchTree
 * (Musterlösung)
 * C. Pothmann, 04.07.2021
 */
public class Adressbuch
{
    private BinarySearchTree<Kontakt> wurzel;

    public Adressbuch()
    {
        wurzel = new BinarySearchTree();
    }

    public boolean istLeer()
    {
        return wurzel.isEmpty();
    }

    /*
     * Falls ein Kontakt mit Nachname pname im Suchbaum enthalten ist, 
     * wird dieser zurückgegeben, andernfalls null.
     */
    public Kontakt suchen(String pname)
    {
        Kontakt k;
        // erzeuge einen Kontakt mit dem gesuchten Nachnamen für die Suche
        k = new Kontakt(pname, "", "", "");
        return wurzel.search(k);
    }

    /*
     * Fügt den Kontakt pk an der richtigen Stelle in den Suchbaum ein.
     * Annahme: es gibt keine Kontakte mit dem gleichen Nachnamen.
     */
    public void einfügen(Kontakt pk)
    {
        wurzel.insert(pk);
    }

    /*
     * Traversiert nach den Suchbaum in Inorder-Reihenfolge und gibt Nach- und Vornamen aus.
     */
    private void ausgabeInRek(BinarySearchTree<Kontakt> pb)
    {
        Kontakt k;
        if (!pb.isEmpty())
        {
            ausgabeInRek(pb.getLeftTree());
            k = pb.getContent();
            Console.println(k.getNachname() + ", " + k.getVorname());
            ausgabeInRek(pb.getRightTree());
        }
    }

    /*
     * Wrapper für die rekursive Ausgabe
     * Gibt alle Namen in alphabetischer Reihenfolge aus.
     */
    public void namenAusgeben()
    {
        ausgabeInRek(wurzel);
    }

    public void löschen(String pname)
    {
        Kontakt k;
        // erzeuge einen Kontakt mit dem gesuchten Nachnamen für die Löschfunktion
        k = new Kontakt(pname, "", "", "");
        wurzel.remove(k);
    }
}   

