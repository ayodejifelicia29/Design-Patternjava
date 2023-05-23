package abstractFactory.banque;

public class Banque3 implements Banque {

    private String nomB;

    public Banque3() {
        this.nomB = "Banque 3";
    }

    @Override
    public String getNomBanque() {
        return nomB;
    }
}
