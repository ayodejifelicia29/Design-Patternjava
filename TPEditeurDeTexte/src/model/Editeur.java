package model;

public abstract class Editeur {

	public abstract void edit(Document doc, String ajout);
	
	
//	public Editeur getEditeur(String type) {
//		if(type.compareTo("word")==0) {
//			System.out.println("je suis word");
//			return new EditeurWord();
//		}
//		if(type.compareTo("pdf")==0) {
//			System.out.println("je suis un editeur de pdf");
//			return new EditeurPDF();
//		}
//		
//		
//		
//		return null;
//	}
	
}
