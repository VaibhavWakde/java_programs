package multithreading;

public class ForLoopInRunMethod extends Thread{
    @Override
    public void run() {
        for(int i =1; i<11;i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" i : "+i);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        for(int j = 11 ; j<21;j++){
            System.out.println(Thread.currentThread().getName()+" j : "+j);
        }
    }

    public static void main(String[] args) {
        ForLoopInRunMethod fl1 = new ForLoopInRunMethod();
        fl1.start();
        fl1.setName("Thread 1");

        ForLoopInRunMethod fl2 = new ForLoopInRunMethod();
        fl2.start();
        fl2.setName("Thread 2");

    }
}
