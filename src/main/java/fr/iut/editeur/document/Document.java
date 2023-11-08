package fr.iut.editeur.document;

import java.util.ArrayList;

public class Document {

    private String contentDocument;
    private int index;
    private ArrayList<String> historique;

    public Document() {
        this.contentDocument = "";
        this.index = 0;
        this.historique = new ArrayList<>();
        this.historique.add("");
    }

    public void sauvegarde() {
        //l'utilisateur a fait un ou des undo
        if(this.historique.size()!=index+1){
            //on supprime toutes les sauvegardes après la version actuel de document (this.historique[index])
            for (int i = this.historique.size()-1; i > index; i--) {
                this.historique.remove(i);
            }
        }
        //on sauvegarde le texte à la fin de l'historique et index++
        this.historique.add(this.contentDocument);
        this.index++;
    }
	
    public String getcontentDocument() {
        return contentDocument;
    }

    public void setcontentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
        this.sauvegarde();
    }

    public void ajouter(String contentDocument) {
        this.contentDocument += contentDocument;
        this.sauvegarde();
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
        this.sauvegarde();
    }

    public void majuscules(int start, int end) {
        String contentDocumentEnMajuscules = contentDocument.substring(start,end).toUpperCase();
        remplacer(start, end, contentDocumentEnMajuscules);
        this.sauvegarde();
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
        this.sauvegarde();
    }

    public void clear() {
        contentDocument = "";
        this.sauvegarde();
    }

    public void minuscules(int start, int end){
        String contentDocumentEnMinuscules = contentDocument.substring(start,end).toLowerCase();
        remplacer(start, end, contentDocumentEnMinuscules);
        this.sauvegarde();
    }
    public void inserer(int index, String contentDocument){
        String leftPart = this.contentDocument.substring(0, index);
        String rightPart = this.contentDocument.substring(index);
        this.contentDocument = leftPart + contentDocument + rightPart;
        this.sauvegarde();
    }

    public void undo() {
        if (index>0){
            this.index--;
            this.contentDocument = this.historique.get(index);
        }
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }
}
