import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Configs {

    Scanner sc = new Scanner(System.in);


    public Configs() {
    }



    public void input() throws SQLException {
        District district = new District();
        System.out.println("Enter District ID: ");
        district.setName(sc.nextLine());
        System.out.println("Enter District name : ");
        district.setName(sc.nextLine());

        insertDistrict(district);
    }

    private void insertDistrict(District district) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            // connect to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/TOWNHOUSE","sa","reallyStrongPwd123");
            //Query
            String sql = "insert into DISTRICT(disid,disname) values('"+district.getId()+"', '"+district.getName()+"')";
            stmt = conn.prepareStatement(sql);
            stmt.execute();


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            conn.close();
            stmt.close();
        }

    }

}
