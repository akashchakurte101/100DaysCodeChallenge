package interfacee;

public class SybaseDatabaseConnection implements DatabaseConnection{
    String queryResult;
    private boolean isConnectionAlive=false;
    @Override
    public void connect(String userName,String password) {
        System.out.println("username: "+userName+"\n"+"password: "+ password);
        isConnectionAlive=true;
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected from Sybase database");
        isConnectionAlive=false;
    }

    @Override
    public String fireQuery(String query) {
        this.queryResult=query;
        return queryResult;
    }

    @Override
    public void checkConnectionStatus() {
        if(isConnectionAlive==true)
        {
            System.out.println("Connected with Sybase database");
        }
        else
        {
            System.out.println("disconnnected from Sybase database");
        }
    }
}