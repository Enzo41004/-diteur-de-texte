package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getcontentDocument() {
        return contentDocument;
    }

    public void setcontentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public void ajouter(String contentDocument) {
        this.contentDocument += contentDocument;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String contentDocumentEnMajuscules = contentDocument.substring(start,end).toUpperCase();
        remplacer(start, end, contentDocumentEnMajuscules);
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        contentDocument = "";
    }

    public void minuscules(int start, int end){
        String contentDocumentEnMinuscules = contentDocument.substring(start,end).toLowerCase();
        remplacer(start, end, contentDocumentEnMinuscules);
    }
    public void inserer(int index, String contentDocument){
        String leftPart = this.contentDocument.substring(0, index);
        String rightPart = this.contentDocument.substring(index);
        this.contentDocument = leftPart + contentDocument + rightPart;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }
}
