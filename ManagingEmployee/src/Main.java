import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        iManageSytem manage = new iManageSytem(workerList);
        manage.input();

        for(Worker variable : workerList){
            variable.display();
        }
       // manage.searchByName();

    }
}