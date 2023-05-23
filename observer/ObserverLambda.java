package observer;

public class ObserverLambda implements Observer {

    private Subject subject;

    private final String ID = "LAMBDA";

    public ObserverLambda(Subject subject) {
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
            System.out.println("Lambda Start process");
            return;
        }

        if (order.isDelivered() == Boolean.TRUE) {
            System.out.println(String.format("order %d delivered successfully", order.getId()));
            // subject.detach(this);
        } else if (order.isDelivered() == Boolean.FALSE)
            System.out.println("New order");
    }

}
