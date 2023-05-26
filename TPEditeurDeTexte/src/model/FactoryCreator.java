package model;

public class FactoryCreator {
	
	public static AbstractFactory getAbstractFactory(String type) {
		
		if(type.compareTo("document") == 0) {
			return new DocumentFactory();
		}
		
		return new EditorFactory();
	}
	
	
}
