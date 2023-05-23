package abstractFactory.banque;

public class Banque2 implements Banque {

    private String nomB;

    public Banque2() {
        this.nomB = "Banque 2";
    }

    @Override
    public String getNomBanque() {
        return nomB;
    }
}
