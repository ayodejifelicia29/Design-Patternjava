package observer;

public interface Observer {
    public String getID();

    public void update(Order command);
}
