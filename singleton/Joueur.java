package singleton;

public class Joueur {
    private static Joueur joueur; // instance de la classe Joueur

    private Joueur() { // constructeur prive
    }

    // Joueur.getjoueur
    public static Joueur getInstance() {
        if (joueur == null)
            return new Joueur();
        else
            return joueur;
    }
}
