package DAO;

import model.Document;

public class DBConnect {
	private static DBConnect instance = null;

    private DBConnect() {
    }

    public static DBConnect getInstance() {
        if ( instance == null ) {
        	instance = new DBConnect();
        }
        System.out.println("une connexion à la base de données est établie!");
        return instance;
    }
    
    public static void saveDocument(Document doc) {
    	//DBConnect.save.... en base de donnée
    }
    
}

// à faire 
//sauvegarde un document, lister, supprimer
//Base de donnee sera une liste document