package abstractFactory;

import abstractFactory.banque.Banque;
import abstractFactory.pret.Pret;

public class AbstractFactoryMain {
    public void main(String[] args) {
        AbstractFactory banqueFactory = FactoryCreator.getFactory("banque");

        Banque banque = banqueFactory.getBanque("banque2");
        System.out.println("la banque est " + banque.getNomBanque()); // type concret de banque est
                                                                      // Banque2

        AbstractFactory preFactory = FactoryCreator.getFactory("pret");
        Pret pret = preFactory.getPret("business");
        System.out.println("le pret est " + pret.getTauxInteret(3.2));
    }
}
