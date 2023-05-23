package abstractFactory.pret;

import abstractFactory.AbstractFactory;
import abstractFactory.banque.Banque;

public class PretFactory extends AbstractFactory {

    @Override
    public Banque getBanque(String banque) {
        // return null;
        throw new UnsupportedOperationException("Unimplemented method 'getBanque'");
    }

    @Override
    public Pret getPret(String pret) {
        switch (pret) {
            case "maison":
                return new PretMaison();
            case "business":
                return new PretBusiness();
            default:
                return new PretEducation();
        }
    }

}
