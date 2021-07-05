import console.*;

/*
 * Adressbuch mit Suchbaum 
 * (Name, Datum)
 */
public class Adressbuch
{
    private BinaryTree<Kontakt> wurzel;

    public Adressbuch()
    {
        wurzel = new BinaryTree();
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
}
