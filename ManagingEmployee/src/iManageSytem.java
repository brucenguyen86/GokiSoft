import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.sql.DriverManager.*;

public class iManageSytem {
    ArrayList<Worker> workerList = new ArrayList<>();


    public iManageSytem() {

    }

    public iManageSytem(ArrayList<Worker> workerList) {
        this.workerList = workerList;

    }

    public ArrayList<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }

    Scanner sc = new Scanner(System.in);


    public void input(){
        int ask;
        boolean check= true;
        while (check) {
            Worker worker = new Worker();
            System.out.println("Please enter employee's name: ");
            worker.setName(sc.nextLine());
            System.out.println("Please enter employee's ID: ");
            worker.setId(sc.nextLine());
            System.out.println("Please enter employee's age: ");
            worker.setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("Please enter employee's StartDate: ");
            worker.setStartDate(sc.nextLine());
            System.out.println("Please enter employee's Length of Contract : ");
            worker.setLengthOfContract(Integer.parseInt(sc.nextLine()));
            workerList.add(worker);
            try {
                insertIntoDatabase(worker);
            }catch( SQLException ex){
                Logger.getLogger(iManageSytem.class.getName()).log(Level.SEVERE,null,ex);
            }


            System.out.printf("Would you like to continue? \n 1. Yes \n 2.No \n");
            ask = Integer.parseInt(sc.nextLine());
            if (ask == 2){
                break;
            }else check = true;
        }
    }

    private void insertIntoDatabase(Worker worker) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            //Open connection to database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");

        // query - insert
        String sql = "insert into employee(id,name,startdate,lengthofcontract) values('"+worker.id+"', '"+worker.name+"', '"+worker.startDate+"', '"+worker.lengthOfContract+"')";
        stmt = conn.prepareStatement(sql);
        stmt.execute();


    }catch (Exception e){
        e.printStackTrace();
        } finally {
            conn.close();
        }
        }

    public void searchByName() {
        String inputName;
        int count = 0;
        while (true) {
            System.out.println("Please enter employee's name you want to search: ");
            inputName = sc.nextLine();
            for (Worker worker : workerList) {
                if (worker.getName().equals(inputName)) {
                    display(worker.getId());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("The input name is invalid, please input again ");
            } else {
                System.out.println("There are " + count + " employee(s) shared the same name");
                break;
            }
        }
    }
    public void display(String id){
    for(Worker worker: workerList){
        if(worker.getId().equals(id)){
            worker.display();
        }
    }
    }
}
