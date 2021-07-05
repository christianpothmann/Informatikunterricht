import console.*;

/*
 * Traversierungs-Algorithmen mithilfe von Rekursion für den binären Suchbaum
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


    /*
     * Traversiert den Suchbaum in Preorder-Reihenfolge und gibt Nach- und Vornamen aus.
     */
    private void ausgabePreRek(BinaryTree<Kontakt> pb)
    {
        // ...
    }

    /*
     * Traversiert den Suchbaum in Inorder-Reihenfolge und gibt Nach- und Vornamen aus.
     */
    private void ausgabeInRek(BinaryTree<Kontakt> pb)
    {
        // ...
    }

    /*
     * Traversiert den Suchbaum in Postorder-Reihenfolge und gibt Nach- und Vornamen aus.
     */
    private void ausgabePostRek(BinaryTree<Kontakt> pb)
    {
        // ...
    }

    /*
     * Wrapper für die rekursive Ausgabe
     */
    public void namenAusgeben()
    {
        // ...
    }
    
    /*
     * Fügt alle Kontakte des Suchbaums in Preorder-Reihenfolge in eine Liste ein.
     * Beim Start der Rekursion muss pl eine leere Liste sein.
     */
    private void listeSpRek(BinaryTree<Kontakt> pb, List<Kontakt> pl)
    {
        // ...
    }

    /*
     * Wrapper für das rekursive Speichern in einer Liste
     */
    public List<Kontakt> listeSpeichern()
    {
        // ...
        return null;  // nur dazu da, dass das Projekt kompiliert - lösche diese Zeile, wenn du die Methode implementierst
    }
    
    /*
     * Baut den Suchbaum aus der Liste pl auf.
     * pl wurde aus einem Suchbaum in preorder-Reihenfolge gefüllt.
     * Falls Kontakte im Suchbaum enthalten sind, werden diese gelöscht.
     */
    public void listeLaden(List<Kontakt> pl)
    {
        // ...
    }

    /*
     * Zählt rekursiv die Anzahl der Kontakte im Suchbaum
     */
    private int zählenRek(BinaryTree<Kontakt> pb)
    {
        // ...
        return 0;  // nur dazu da, dass das Projekt kompiliert - lösche diese Zeile, wenn du die Methode implementierst
    }
    
    
    /*
     * Wrapper für zählenRek()
     * Gibt die Anzahl der Kontakte im Suchbaum zurück
     */
    public int getAnzahl()
    {
        // ...
        return 0;  // nur dazu da, dass das Projekt kompiliert - lösche diese Zeile, wenn du die Methode implementierst
    }
}   

