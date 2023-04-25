public class Worker {
    String name;
    String id;
    int age;
    String startDate;
    int lengthOfContract;

    public Worker() {
    }

    public Worker(String name, String id, int age, String startDate, int lengthOfContract) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.startDate = startDate;
        this.lengthOfContract = lengthOfContract;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getLengthOfContract() {
        return lengthOfContract;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setLengthOfContract(int lengthOfContract) {
        this.lengthOfContract = lengthOfContract;
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", start Date='" + startDate + '\'' +
                ", length Of Contract=" + lengthOfContract +
                '}';
    }
}
