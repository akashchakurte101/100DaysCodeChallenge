package interfacee;

public interface DatabaseConnection {

    void connect(String userName,String password);
    void disconnect();
    String fireQuery(String query);
    void checkConnectionStatus();
}
