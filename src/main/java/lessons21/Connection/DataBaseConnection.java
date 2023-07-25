package lessons21.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static final String serverTimeZone = "UTC";
    public static final String serverName = "localhost"; // ip address db
    public static final String databaseName ="homework26"; // bd name
    public static final int portNumber = 3306; // db port
    public static final String user = "root"; // login
    public static final String password = "root"; // password


    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://" + serverName + ":" + portNumber
                    + "/" + databaseName + "?serverTimezone=" + serverTimeZone;
        return DriverManager.getConnection(url, user, password);
    }

    public static void close (Connection connection){
        if (connection!=null){
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
