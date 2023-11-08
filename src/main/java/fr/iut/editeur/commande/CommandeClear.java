package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeClear extends CommandeDocument {
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        this.document.clear();
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("supprime tout le texte");
    }
}
