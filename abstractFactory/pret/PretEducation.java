package abstractFactory.pret;

public class PretEducation extends Pret {

    @Override
    public double getTauxInteret(double taux) {
        return 10 * taux;
    }

}
