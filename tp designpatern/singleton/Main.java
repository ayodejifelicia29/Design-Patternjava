package singleton;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();

        if (dbConnection != null) {
            System.out.println("Connexion a la base de donnee reussite");
            // System.out.println(dbConnection.listAllNames());
        }
    }

}
