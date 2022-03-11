package multithreading.task;

public class BookTicketApi {
//    int[] seatNo= {1,2,3};
    int seatNo = 1;
    synchronized void bookTicket(int userSeatNo){
//        aa:
//            for(int i=0;i<seatNo.length;i++){
//
//                if(userSeatNo == seatNo[i]){
//                    System.out.println("seat no. "+seatNo[i]+" is booked for "+Thread.currentThread().getName());
//                    break aa;
//                }
//                else {
//                    System.out.println("Seat is Already Booked, Go for another Seat "+Thread.currentThread().getName());
//                    break aa;
//                }
//            }
        if(userSeatNo == seatNo){
            System.out.println("Seat is booked for "+Thread.currentThread().getName());
        }
        else {
            System.out.println("Seat is Already booked go for another seat "+Thread.currentThread().getName());
        }
    }
}

class BusTicket extends Thread {
    static final BookTicketApi bookTicketApi = new BookTicketApi();
    int userSeatNo;

    @Override
    public void run() {
        bookTicketApi.bookTicket(userSeatNo);
    }

    public static void main(String[] args) {
        BusTicket user1 = new BusTicket();
        user1.start();
        user1.setName("User1");
        user1.userSeatNo =1;

        BusTicket user2 = new BusTicket();
        user2.start();
        user2.setName("User2");
        user2.userSeatNo =1;

        BusTicket user3 = new BusTicket();
        user3.start();
        user3.setName("User3");
        user3.userSeatNo =1;
    }
}
