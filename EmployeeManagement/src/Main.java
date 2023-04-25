public class Main {
    public static void main(String[] args) {
        FullTimeEmployee manager01 = new FullTimeEmployee("Nguyen Van Hung");
        manager01.setRank(2);
        FullTimeEmployee employee01 = new FullTimeEmployee("Cu Thi Linh Tam",10);
        FullTimeEmployee employee02 = new FullTimeEmployee("Cu Thi Anh Tuyet",5);
        PartTimeEmployee partime01 = new PartTimeEmployee("Hoang Thi BInh",100);
        // Calculate Salary:
        employee01.calSalary();
        employee02.calSalary();
        partime01.calSalary();
        manager01.calSalary();
        // Output :
        employee01.output();
        employee02.output();
        partime01.output();
        manager01.output();
        }


    }
