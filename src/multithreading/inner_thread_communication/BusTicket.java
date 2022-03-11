package multithreading.inner_thread_communication;

public class BusTicket {
    int totalAmount;
    void bookBusTicket(int tickets){
        for(int i =0;i<=tickets;i++){
            totalAmount = totalAmount+1000;
        }

    }
}

class BusTicketThread extends Thread{
    int tickets;
    BusTicket busTicket;

    @Override
    public void run() {
        busTicket.bookBusTicket(tickets);
        notify();
    }
}

class IMPL{
    public static void main(String[] args) {

    }
}
