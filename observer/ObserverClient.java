package observer;

public class ObserverClient implements Observer {

    private Subject subject;

    private final String ID = "CLIENT";

    public ObserverClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void update(Order order) {
        if (order == null) {
            System.out.println("Client Start process");
            return;
        }

        if (order.isReady() == Boolean.TRUE) {
            System.out.println("Votre commande est prete");
        }
    }

}
