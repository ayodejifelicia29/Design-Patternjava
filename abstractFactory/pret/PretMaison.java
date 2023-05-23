package abstractFactory.pret;

public class PretMaison extends Pret {

    @Override
    public double getTauxInteret(double taux) {
        return 2.5 * taux;
    }

}
