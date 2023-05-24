package pool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private List<Connection> connections;

    private int maxPoolSize = 5;

    private int id = 1;

    public ConnectionPool() {
        initialize();
    }

    public ConnectionPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        initialize();
    }

    public synchronized Connection borrowConnection(String thread) {
        if (connections.isEmpty() && id > maxPoolSize)
            return null;

        if (connections.isEmpty()) {
            Connection connection = createConnection();
            System.out.println(thread + " a cree " + connection);
            return connection;
        }

        System.out.println(thread + " reutilise une connection libre");
        return connections.remove(connections.size() - 1);
    }

    public synchronized void returnConnection(Connection connection) {
        if (connections.size() < maxPoolSize)
            connections.add(connection);

        System.out.println("libere " + connection);
    }

    public Connection createConnection() {
        return new Connection(id++);
    }

    public void initialize() {
        connections = new ArrayList<>(maxPoolSize);
    }
}
