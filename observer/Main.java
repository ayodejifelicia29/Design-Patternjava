package observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new ObserverLambda(subject);

        new ObserverClient(subject);

        // client cree une commande
        Order order = new Order();
        order.setId(1);

        subject.notifyAllObservers(); // notifie tous les observers

        subject.setOrder(order, ObserverLambda.class);

        order.setReady(true);
        subject.setOrder(order, ObserverClient.class); // notifie le client que la commande est prete

        order.setDelivered(true);
        subject.setOrder(order, ObserverLambda.class); // notifie la lambda que la commande a ete livree avec succes

        Order order2 = new Order();
        order2.setId(2);

        subject.notifyAllObservers();

        subject.setOrder(order2, ObserverLambda.class);

        order2.setReady(true);
        subject.setOrder(order2, ObserverClient.class);

        order2.setDelivered(true);
        subject.setOrder(order2, ObserverLambda.class);

    }
}
