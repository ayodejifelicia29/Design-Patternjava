package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employe employe = new Employe();
        employe.setNom("Nom1");
        employe.setPreNom("PrenomNom1");
        employe.setRole("DRH");
        System.out.println("employe1 = " + employe);

        Employe emp2 = (Employe) employe.clone(); // clone employe object; Employe emp2 = employe
                                                  // est affectation de reference et non une copy
        emp2.setNom("Nom2");
        emp2.setPreNom("PrenomNom2");
        System.out.println("emp2 = " + emp2);

        System.out.println("employe1 = " + employe);
    }
}
