package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeUndo extends CommandeDocument{
    public CommandeUndo(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        this.document.undo();
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("ctrl z");
    }
}
