import console.*;

/*
 * Adressbuch mit Suchbaum (Musterlösung)
 * C. Pothmann, 20.06.2018
 * Überarbeitet 30.06.2021
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
        BinaryTree<Kontakt> knoten;
        Kontakt kAkt;

        // setze eine temporäre Referenz auf die Wurzel
        // mit dieser Referenz wird immer der "aktuelle Knoten" markiert
        knoten = wurzel;
        // wiederhole, solange kein Blatt erreicht ist
        while (!knoten.isEmpty())
        {
            // hole den Kontakt am aktuellen Knoten
            kAkt = knoten.getContent();
            // gesuchter Name liegt davor: gehe zum linken Nachfolger
            if (pname.compareTo(kAkt.getNachname()) < 0)
            {
                knoten = knoten.getLeftTree();
            }
            // gesuchter Name liegt dahinter: gehe zum rechten Nachfolger
            else if (pname.compareTo(kAkt.getNachname()) > 0)
            {
                knoten = knoten.getRightTree();
            }
            // es ist der gesuchte Name: gib den Kontakt zurück
            else if (pname.equals(kAkt.getNachname()))
            {
                return kAkt;
            }
        }
        // Kontakt nicht gefunden: gib null zurück
        return null;
    }

    /*
     * Fügt den Kontakt pk an der richtigen Stelle in den Suchbaum ein.
     * Annahme: es gibt keine Kontakte mit dem gleichen Nachnamen.
     */
    public void einfügen(Kontakt pk)
    {
        BinaryTree<Kontakt> knoten;
        Kontakt kAkt;

        knoten = wurzel;
        while (!knoten.isEmpty())
        {
            kAkt = knoten.getContent();
            // falls ein Kontakt mit dem gleichen Namen gefunden wird, bricht die Methode ab
            if (pk.getNachname().equals(kAkt.getNachname()))
            {
                return;
            }
            // neuer Nachname alphabetisch VOR dem aktuellen: gehe zum linken Nachfolger
            if (pk.getNachname().compareTo(kAkt.getNachname()) < 0)
            {
                knoten = knoten.getLeftTree();
            }
            // sonst gehe zum rechten Nachfolger
            else
            {
                knoten = knoten.getRightTree();
            }
        }

        // Ein leerer Knoten ist gefunden. Füge den Kontak an dieser Stelle ein.
        knoten.setContent(pk);
    }
}
