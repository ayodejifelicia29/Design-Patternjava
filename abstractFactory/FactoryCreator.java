package abstractFactory;

import abstractFactory.banque.BanqueFactory;
import abstractFactory.pret.PretFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choix) {

        if (choix == null)
            return null;

        if (choix.compareTo("banque") == 0)
            return new BanqueFactory();

        return new PretFactory();
    }
}
