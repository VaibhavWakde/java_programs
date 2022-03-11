package multithreading.inner_communication;

public class BusTicket extends Thread{
    int totolAmount =0;

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            totolAmount +=1000;
        }
        System.out.println(Thread.currentThread().getName());
        notify();
    }
}

class BusTicketThread{
    public static void main(String[] args) throws InterruptedException{
        BusTicket busTicket = new BusTicket();
        busTicket.start();
        busTicket.setName("created thread");

        synchronized (busTicket){
            System.out.println("in sychronized block");
            System.out.println(Thread.currentThread().getName());
            busTicket.wait();
            System.out.println(busTicket.totolAmount);
        }
    }
}
