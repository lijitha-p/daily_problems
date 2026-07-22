package dailyproblems;

public class Program1 {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        dailyproblems.Program1 obj = new dailyproblems.Program1();

        Thread t1 = new Thread(() -> {
            obj.increment();
        });

        Thread t2 = new Thread(() -> {
            obj.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + obj.count);
    }
}