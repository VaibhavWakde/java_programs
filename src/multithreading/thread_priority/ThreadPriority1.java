package multithreading.thread_priority;

public class ThreadPriority1 extends Thread{
    @Override
    public void run() {
        for(int i =1;i<=3;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Hi");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
