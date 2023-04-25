import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("reallyStrongPwd123");
        ds.setServerName("localhost");
        ds.setPortNumber( 1433); // port tcp/ip
        ds.setDatabaseName("TOWNHOUSE");
        try(Connection conn =ds.getConnection()){
            System.out.println("Successful");
            System.out.println(conn.getMetaData());
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}