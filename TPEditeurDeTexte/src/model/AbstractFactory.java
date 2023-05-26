package model;

public abstract class AbstractFactory {

	public abstract Document getDocument(String type);
	public abstract Editeur getEditeur(String type);
	
	
	
}
