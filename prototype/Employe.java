package prototype;

public class Employe implements Cloneable {
    private String nom;

    private String preNom;

    private String role;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPreNom() {
        return preNom;
    }

    public void setPreNom(String preNom) {
        this.preNom = preNom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employe copy = new Employe();
        copy.setNom(nom);
        copy.setPreNom(preNom);
        copy.setRole(role);

        return copy;
    }

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", preNom=" + preNom + ", role=" + role + "]";
    }
}
