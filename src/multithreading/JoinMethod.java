package multithreading;

public class JoinMethod extends Thread{
    @Override
    public void run() {
        for(int i =0;i<2;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Current Thread: "+Thread.currentThread().getName());
            }catch (InterruptedException e){
                System.out.println("Exception occurs"+e);
            }
        }
    }


    public static void main(String[] args) {
        JoinMethod JM1=new JoinMethod();
        JoinMethod JM2=new JoinMethod();
        JoinMethod JM3=new JoinMethod();


        JM1.start();
        try{
            System.out.println();
        }catch (Exception e){
            System.out.println();
        }
    }
}
