package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRedo extends CommandeDocument{
    public CommandeRedo(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        this.document.redo();
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("ctrl y");
    }
}
