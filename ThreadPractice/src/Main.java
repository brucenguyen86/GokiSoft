public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for ( int i = 0; i<100; i++)
                    System.out.println("T1 is running"+i);
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for ( int i = 0; i<100; i++)
                    System.out.println("T2 is running : "+i);
            }
        });
        t2.start();

        //Create thread 3:
        ThreadThree t3 = new ThreadThree("T3");
        t3.name = "T3 ";
        t3.run();
        // Create thread 4:
        for (int i=0;i<100;i++){
            System.out.println("T4 is running "+ i);
        }
        //Create thread 5:
        ThreadFive temp = new ThreadFive("T5");
        Thread t5= new Thread(temp);
        t5.run();
        }

    }
