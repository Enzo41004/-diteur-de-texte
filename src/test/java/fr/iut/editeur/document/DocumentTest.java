package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {
    public void testDocumentAjouter() {
        Document doc = new Document();
        doc.ajouter("Hello");
        assertEquals(doc.getcontentDocument(),"Hello");
    }

    public void testDocumentClear() {
        Document doc = new Document();
        doc.ajouter("Hello");
        doc.clear();
        assertEquals(doc.getcontentDocument(),"");
    }

    public void testDocumentEffacer() {
        Document doc = new Document();
        doc.ajouter("Hello");
        doc.effacer(2,3);
        assertEquals(doc.getcontentDocument(),"Helo");
    }

}
