public class PartTimeEmployee extends Employee{
    int workingHour;
    public PartTimeEmployee(){
    }
    public PartTimeEmployee(String name, int workingHour){
        super(name);
        this.workingHour = workingHour;
    }
    public String employeeType(){
        return "A part-time employee";
    }
    public void calSalary() {
    super.totalIncome = workingHour * Configs.hourRate;
    super.salary = 0;
    }
}
