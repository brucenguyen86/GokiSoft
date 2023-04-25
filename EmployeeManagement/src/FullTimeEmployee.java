public class FullTimeEmployee extends Employee{
    private int overtimeDate;
    private int rank;
    public FullTimeEmployee(String name) {
        super(name);
        this.rank = Configs.anEmployee; // A new employee will be a normal employee by default
    }
    // Declare a different contructor to add different parameter
    public FullTimeEmployee(String name, int overtimeDate){
        super(name);
        this.overtimeDate = overtimeDate;
        this.rank = Configs.anEmployee;
    }
    public void setRank(int rank){ //this function will be used when the employee is a manager
        this.rank = rank;
    }
    public String employeeType(){
        if ( rank == Configs.anEmployee) return "a normal Employee";
        else if (rank == Configs.aManager) return "a manager";
        else return "a part-Time Employee";
    }
    public void calSalary(){
        if ( rank == Configs.anEmployee) {
            super.salary = Configs.employeeSal;
        }
        else if (rank == Configs.aManager) super.salary = Configs.managerSal;
        super.totalIncome = super.salary * Configs.overtimeRate;
        }
    }

