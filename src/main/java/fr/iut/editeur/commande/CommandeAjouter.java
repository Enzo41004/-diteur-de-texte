package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette class à pour but ajouter
 *  du texte
 *  à un doc
 */
public class CommandeAjouter extends CommandeDocument {


    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("ajoute du texte");
    }
}
