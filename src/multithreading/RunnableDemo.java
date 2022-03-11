package multithreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        RunnableDemo RD = new RunnableDemo();

        Thread th1 = new Thread(RD);
        Thread th2 = new Thread(RD);

        th1.start();
        th2.start();
    }
}
