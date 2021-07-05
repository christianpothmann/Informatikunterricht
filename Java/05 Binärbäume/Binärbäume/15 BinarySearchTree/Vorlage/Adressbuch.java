import console.*;

/*
 * Adressbuch mit Suchbaum BinarySearchTree
 * (Name, Datum)
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
        // ...
    }

    /*
     * Fügt den Kontakt pk an der richtigen Stelle in den Suchbaum ein.
     * Annahme: es gibt keine Kontakte mit dem gleichen Nachnamen.
     */
    public void einfügen(Kontakt pk)
    {
        // ...
    }

    /*
     * Traversiert nach den Suchbaum in Inorder-Reihenfolge und gibt Nach- und Vornamen aus.
     */
    private void ausgabeInRek(BinarySearchTree<Kontakt> pb)
    {
        // ...
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
        // ...
    }
}   

