public class ThreadThree extends Thread {
    String name;
    public ThreadThree(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + "is running" + i);
        }
    }
}

