package model;

public class EditeurPDF extends Editeur{

	@Override
	public String toString() {
		return "EditeurPDF []";
	}
	@Override
	public void edit(Document doc, String ajout) {
		if (doc instanceof DocumentPdf) {
			doc.appendText(ajout);
			
		} else {
			throw new UnsupportedOperationException("Ne peut modifier que des PDF !!!");
		}
		
	}

}
