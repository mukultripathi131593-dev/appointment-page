class RaceThread extends Thread {

    public RaceThread(String name) {
        super(name);   // thread name set
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " running... Iteration: " + i);
                Thread.sleep(500); // delay of 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " finished the race!");
    }
}

public class ThreadRace {
    public static void main(String[] args) {

        RaceThread t1 = new RaceThread("Runner-1");
        RaceThread t2 = new RaceThread("Runner-2");
        RaceThread t3 = new RaceThread("Runner-3");

        // Setting different priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
