package app01;

/*
public class test_jdbc {

}
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {
    	
    }
    
    public void Conn00(String db0) {

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            //System.out.println("Connector/J " + Version.version + "\n");

            System.out.print("Connecting to DB...");
            conn = DriverManager.getConnection(
            //      "jdbc:mariadb://192.168.2.104/mysql", "root", "password");
            //		"jdbc:mariadb://127.0.0.1/test-db", "test-user", "user-pass");
            		"jdbc:mariadb://127.0.0.1/" + db0, "test-user", "user-pass");
            System.out.println(" done.");

            stmt = conn.createStatement();
            //String sql = "SELECT user,host FROM mysql.user";
            String sql = "SELECT a01,a02 FROM db01";
            ResultSet hrs = stmt.executeQuery(sql);

            while (hrs.next()) {
                String user = hrs.getString(1);
                String host = hrs.getString(2);
                System.out.println("User: " + user + "@'" + host + "'");
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {} // do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
        System.out.println("\nGoodbye!");
    }
}
