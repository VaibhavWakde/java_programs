package multithreading;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        ThreadDemo th1 = new ThreadDemo();
        ThreadDemo th2 = new ThreadDemo();
        ThreadDemo th3 = new ThreadDemo();
        ThreadDemo th4 = new ThreadDemo();

        th1.start();
        th1.setName("thread 1");

        th2.start();
        th2.setName("thread 2");

        th3.start();
        th3.setName("thread 3");

        th4.start();
        th4.setName("thread 4");
//        th1.start(); // if we start again one thread then it gives " Illegal Thread Exception"
    }
}
