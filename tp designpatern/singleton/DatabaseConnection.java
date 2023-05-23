package singleton;

// import java.util.List;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    // public List<String> listAllNames() {
    // return List.of("Nom1", "Nom2", "Nom3"); // instancie une list avec les elements contenues
    // dans of equivaut a
    // Arraylist<String> list = new ArrayList<>();
    // list.add("Nom1");
    // list.add("Nom2");
    // list.add("Nom3");
    // }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}
