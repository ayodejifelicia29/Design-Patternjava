package model;

public class DocumentFactory extends AbstractFactory{

	@Override
	
		public Document getDocument(String type) {
			if(type.compareTo("word")==0) {
				return new DocumentWord();
			}
			if(type.compareTo("pdf")==0) {
				return new DocumentPdf();
			}
			
			return null;
		}
	

	@Override
	public Editeur getEditeur(String type) {
		throw new UnsupportedOperationException("cannot create editeur factory");
	}

}
