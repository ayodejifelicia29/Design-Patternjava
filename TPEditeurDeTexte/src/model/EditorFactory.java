package model;

public class EditorFactory extends AbstractFactory{

	
	@Override
	public Editeur getEditeur(String type) {
		if(type.compareTo("word")==0) {
			return new EditeurWord();
		}
		if(type.compareTo("pdf")==0) {
			return new EditeurPDF();
		}
		
		
		
		return null;
	}

	@Override
	public Document getDocument(String type) {
		throw new UnsupportedOperationException("cannot create document factory");
	}

}
