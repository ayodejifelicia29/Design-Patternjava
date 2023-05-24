package pool;

public class Main {
    public static void main(String[] args) {

        ConnectionPool connections = new ConnectionPool(2);

        Thread direBonjour = new Thread(new Runnable() {
            @Override
            public void run() {
                Connection connection;
                while ((connection = connections.borrowConnection("direBonjour")) == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                // direBonjour process
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                }
                System.out.println("Bonjour a utilise " + connection.toString());
                connections.returnConnection(connection);
            }
        });

        Thread direBonaprem = new Thread(new Runnable() {
            @Override
            public void run() {
                Connection connection;
                while ((connection = connections.borrowConnection("direBonaprem")) == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                // direBonaprem process
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }
                System.out.println("Bonaprem a utilise " + connection.toString());
                connections.returnConnection(connection);
            }
        });

        Thread direBonsoir = new Thread(new Runnable() {
            @Override
            public void run() {
                Connection connection;
                while ((connection = connections.borrowConnection("direBonsoir")) == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                // direBonsoir process
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                }
                System.out.println("Bonsoir a utilise " + connection.toString());
                connections.returnConnection(connection);
            }
        });

        Thread direBonnenuit = new Thread(new Runnable() {
            @Override
            public void run() {
                Connection connection;
                while ((connection = connections.borrowConnection("direBonnenuit")) == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                // direBonnenuit process
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                System.out.println("Bonne nuit a utilise " + connection.toString());
                connections.returnConnection(connection);
            }
        });

        direBonjour.start();
        direBonaprem.start();
        direBonsoir.start();
        direBonnenuit.start();

        // Connection connection = connections.borrowConnection("direbonjour");
        // System.out.println("bonjour utilise " + connection.toString());
        // connections.returnConnection(connection);
        // Connection connection1 = connections.borrowConnection("direbonaprem");
        // System.out.println("bonaprem utilise " + connection1.toString());
        // connections.returnConnection(connection1);
        // Connection connection2 = connections.borrowConnection("direbonsoir");
        // System.out.println("bonsoir utilise " + connection2.toString());
        // connections.returnConnection(connection2);
    }
}
