public class Employee {
    protected String name;
    protected float salary;
    protected float totalIncome;
    public Employee(){
    }
    public Employee(String name){
        this.name = name;
    }
    protected String employeeType(){
        // sub classes must override this method
        return null;
    }
    public void output(){
        System.out.println("The employee's name is : "+name);
        System.out.println("This is "+ employeeType() + " employee");
        System.out.println("The salary of this employee is $"+ salary );
        System.out.println("The total income of this employee is $"+totalIncome);
    }
}
