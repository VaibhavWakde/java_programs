package multithreading.thread_priority;

public class ThreadPriority2 extends Thread{
    @Override
    public void run() {
        for(int i =1;i<3;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
