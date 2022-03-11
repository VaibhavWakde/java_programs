package multithreading;

public class ThreadNaming extends Thread{
    @Override
    public void run() {
        System.out.println("in run method "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("in main method "+Thread.currentThread().getName());

        ThreadNaming TN = new ThreadNaming();
        TN.setName("Personal Thread");
        TN.start();
        System.out.println(Thread.currentThread().getName());

    }
}
