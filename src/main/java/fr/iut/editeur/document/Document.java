package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String texteEnMajuscules = texteDocument.substring(start,end).toUpperCase();
        remplacer(start, end, texteEnMajuscules);
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        texteDocument = "";
    }

    public void minuscules(int start, int end){
        String texteEnMinuscules = texte.substring(start,end).toLowerCase();
        remplacer(start, end, texteEnMinuscules);
    }
    public void inserer(int index, String texte){
        String leftPart = this.texte.substring(0, index);
        String rightPart = this.texte.substring(index);
        this.texte = leftPart + texte + rightPart;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
