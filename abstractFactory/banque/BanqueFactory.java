package abstractFactory.banque;

import abstractFactory.AbstractFactory;
import abstractFactory.pret.Pret;

public class BanqueFactory extends AbstractFactory {

    @Override
    public Banque getBanque(String banque) {
        switch (banque) {
            case "banque1":
                return new Banque1();
            case "banque2":
                return new Banque2();
            default:
                return new Banque3();
        }
    }

    @Override
    public Pret getPret(String pret) {
        // return null;
        throw new UnsupportedOperationException("Unimplemented method 'getPret'");
    }

}
