package composite;

public class Main {

    public static void main(String[] args) {
        Employe ceo = new Employe("Mr CEO", "direction", "100000");
        Employe coo = new Employe("Mr COO", "Pilotage", "80000");
        Employe cto = new Employe("Mr CTO", "Technique", "50000");
        Employe drh = new Employe("Mr DRH", "RH", "70000");
        Employe dev1 = new Employe("Mr dev1", "Technique", "20000");
        Employe dev2 = new Employe("Mr dev2", "Technique", "20000");

        ceo.add(coo).add(cto).add(drh).add(dev1).add(dev2);
        coo.add(cto);
        cto.add(dev1).add(dev2);
        drh.add(coo).add(cto).add(dev1).add(dev2);

        System.out.println(ceo);
    }
}
