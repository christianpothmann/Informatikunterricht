import console.*;

/*
 * Traversierungs-Algorithmen mithilfe von Rekursion für den binären Suchbaum
 * (Musterlösung)
 * C. Pothmann, 06.2014
 * Überarbeitet 06.2021
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
     * Traversiert nach den Suchbaum in Inorder-Reihenfolge und gibt Nach- und Vornamen aus.
     */
    private void ausgabeInRek(BinaryTree<Kontakt> pb)
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
    
    /*
     * Fügt alle Kontakte des Suchbaums in Preorder-Reihenfolge in eine Liste ein.
     * So kann später ein neuer Suchbaum exakt wie das Original aus der Liste aufgebaut werden.
     * Beim Start der Rekursion muss pl eine leere Liste sein.
     */
    private void listeSpRek(BinaryTree<Kontakt> pb, List<Kontakt> pl)
    {
        if (!pb.isEmpty())
        {
            pl.append(pb.getContent());
            listeSpRek(pb.getLeftTree(), pl);
            listeSpRek(pb.getRightTree(), pl);
        }
    }

    /*
     * Wrapper für das rekursive Speichern in einer Liste
     */
    public List<Kontakt> listeSpeichern()
    {
        List<Kontakt> liste = new List();
        listeSpRek(wurzel, liste);
        return liste;
    }
    
    /*
     * Baut den Suchbaum aus der Liste pl auf.
     * pl wurde aus einem Suchbaum in preorder-Reihenfolge gefüllt.
     * Falls Kontakte im Suchbaum enthalten sind, werden diese gelöscht.
     */
    public void listeLaden(List<Kontakt> pl)
    {
        wurzel = new BinaryTree();
        pl.toFirst();
        while (pl.hasAccess())
        {
            einfügen(pl.getContent());
            pl.next();
        }
    }

    /*
     * Zählt rekursiv die Anzahl der Kontakte im Suchbaum
     */
    private int zählenRek(BinaryTree<Kontakt> pb)
    {
        if (!pb.isEmpty())
        {
            return zählenRek(pb.getLeftTree())
                 + 1
                 + zählenRek(pb.getRightTree());
        }
        else
        {
            return 0;
        }
    }
    
    
    /*
     * Wrapper für zählenRek()
     * Gibt die Anzahl der Kontakte im Suchbaum zurück
     */
    public int getAnzahl()
    {
        return zählenRek(wurzel);
    }
}   

