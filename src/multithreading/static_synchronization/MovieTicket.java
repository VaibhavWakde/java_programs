package multithreading.static_synchronization;

public class MovieTicket {
    static int totalTickets =50;
    static synchronized void bookTicket(int seats){
        if(totalTickets>=seats){
            System.out.println(seats+" seats are going to book");
            totalTickets = totalTickets - seats;
            System.out.println("Ticket Left "+totalTickets);
        }
        else {
            System.out.println("No Tickets Available.");
        }
    }
}


class Thread1 extends Thread {
    int seats;
    MovieTicket movieTicket;

    Thread1(int seats, MovieTicket movieTicket){
        this.movieTicket = movieTicket;
        this.seats = seats;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(seats);
    }
}

class Thread2 extends Thread {
    int seats;
    MovieTicket movieTicket;

    Thread2(int seats, MovieTicket movieTicket){
        this.movieTicket=movieTicket;
        this.seats = seats;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(seats);
    }
}

class Impl{
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket();

        Thread1 t1 = new Thread1(4,m1);
        t1.start();

        Thread1 t2 = new Thread1(5,m2);
        t2.start();

        Thread2 t3 = new Thread2(7,m1);
        t3.start();

        Thread2 t4 = new Thread2(8,m2);
        t4.start();
    }
}
