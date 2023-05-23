package abstractFactory.pret;

public class PretBusiness extends Pret {

    @Override
    public double getTauxInteret(double taux) {
        return 6.5 * taux;
    }

}
