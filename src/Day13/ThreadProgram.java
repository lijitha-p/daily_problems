package dailyproblems;

class Number {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadProgram {

    public static void main(String[] args) throws InterruptedException {

        Number number = new Number();

        Thread t1 = new Thread(() -> {
            number.increment();
        });

        Thread t2 = new Thread(() -> {
            number.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + number.getCount());
    }
}