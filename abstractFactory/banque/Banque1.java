package abstractFactory.banque;

public class Banque1 implements Banque {

    private String nomB;

    public Banque1() {
        this.nomB = "Banque 1";
    }

    @Override
    public String getNomBanque() {
        return nomB;
    }

}
