package metier;

import model.AbstractFactory;
import model.Document;
import model.Editeur;
import model.EditorFactory;
import model.FactoryCreator;



	public class App {
	    public static void main(String[] args) {
//	        Document document = new Document();
//	        TextView view = new TextView();
//	        TextController controller = new TextController(document, view);
//
//	        while (true) {
//	            view.showMenu();
//	            int choice = Integer.parseInt(view.getInput());
//	            controller.processChoice(choice);
//	        }
	    	AbstractFactory editorFactory = FactoryCreator.getAbstractFactory("editeur");
	    	Editeur editeurWord = editorFactory.getEditeur("word");
	    	System.out.println(editeurWord.toString()); 
	    	
	    	Editeur editeurPDF = editorFactory.getEditeur("pdf");
	    	System.out.println(editeurPDF.toString()); 
	    	
	    	AbstractFactory documentFactory = FactoryCreator.getAbstractFactory("document");
	    	Document docPdf = documentFactory.getDocument("pdf");
	    	docPdf.appendText("version initial du pdf");
	    	System.out.println(docPdf.getContent().toString());
	    	
	    	Document docWord = documentFactory.getDocument("word");
	    	docWord.appendText("version initial du word");
	    	System.out.println(docWord.getContent().toString());
	    	
	    	try {
	    		editeurWord.edit(docPdf, "je vais lever une exception");	    		
	    	} catch (Exception ex) {
	    		System.err.println(ex.getMessage());
	    	}
	    	
	    	
	    	editeurWord.edit(docWord, "modification du fichier word");
	    	
	    	System.out.println(docWord.getContent().toString());
	    	
	    	
	    }
	}

