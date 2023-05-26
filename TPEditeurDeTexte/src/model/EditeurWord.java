package model;

public class EditeurWord extends Editeur{

	@Override
	public String toString() {
		return "EditeurWord []";
	}

	@Override
	public void edit(Document doc, String ajout) {
		if (doc instanceof DocumentWord) {
			doc.appendText(ajout);
			
		} else {
			throw new UnsupportedOperationException("Ne peut modifier que des Word !!!");
		}
		
	}
	
}
