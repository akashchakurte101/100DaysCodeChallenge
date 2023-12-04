package interfacee;

public class DatabaseMain {

    public static void main(String[] args) {
        DatabaseConnection driver = databaseType("Sybase");
        if(driver!=null) {
            driver.connect("ABC", "12345");
            driver.checkConnectionStatus();
            driver.fireQuery("Select * from employee where id=11");
            driver.disconnect();
        }

    }

    public static DatabaseConnection databaseType(String database) {
        if (database.equals("Oracle")) {
            DatabaseConnection driver1 = new OracleDatabaseConnection();
            return driver1;
        } else if (database.equals("Sybase")) {
            DatabaseConnection driver1 = new SybaseDatabaseConnection();
            return driver1;
        } else {
            System.out.println("No such Database");
            return null;
        }
    }

}
