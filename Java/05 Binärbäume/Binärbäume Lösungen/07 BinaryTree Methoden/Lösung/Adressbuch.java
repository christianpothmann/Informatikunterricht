/*
 * Einfügen von Kontakten in einen Binärbaum
 * C. Pothmann, 19.12.2017
 * Überarbeitet 23.06.2021
 */
public class Adressbuch
{
    private BinaryTree<Kontakt> wurzel;

    public Adressbuch()
    {
        wurzel = new BinaryTree();
    }

    public void main()
    {
        Kontakt k;
        BinaryTree<Kontakt> neu, aktuell;
        
        // Kontakt an der Wurzel einfügen
        k = new Kontakt("Müller", "", "", "");
        wurzel.setContent(k);
        
        // Kontakte links / rechts von der Wurzel einfügen
        k = new Kontakt("Günther", "", "", "");
        neu = new BinaryTree(k);
        wurzel.setLeftTree(neu);
        
        k = new Kontakt("Peters", "", "", "");
        neu = new BinaryTree(k);
        wurzel.setRightTree(neu);
        
        // Kontakte unter dem linken Nachfolger der Wurzel
        aktuell = wurzel.getLeftTree();
        k = new Kontakt("Albrecht", "", "", "");
        neu = new BinaryTree(k);
        aktuell.setLeftTree(neu);

        k = new Kontakt("Becker", "", "", "");
        neu = new BinaryTree(k);
        aktuell.setRightTree(neu);
        
        // Kontakte rechts unter Becker
        aktuell = aktuell.getRightTree();
        k = new Kontakt("Frantz", "", "", "");
        neu = new BinaryTree(k);
        aktuell.setRightTree(neu);
        
        aktuell = aktuell.getRightTree();
        k = new Kontakt("Engel", "", "", "");
        neu = new BinaryTree(k);
        aktuell.setLeftTree(neu);
    }
}
