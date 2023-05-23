package singleton;

public class Main {

    public static void main(String[] args) {
        Joueur j1 = Joueur.getInstance();
        Joueur j2 = Joueur.getInstance();

        System.out.println(j1); // Joueur [nom=joueur du jour]
        System.out.println(j2); // Joueur [nom=joueur du jour]
    }
}
