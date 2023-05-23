package abstractFactory;

import abstractFactory.banque.Banque;
import abstractFactory.pret.Pret;

public abstract class AbstractFactory {
    public abstract Banque getBanque(String banque);

    public abstract Pret getPret(String pret);
}
