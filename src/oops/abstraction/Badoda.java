package oops.abstraction;

public class Badoda extends Bank {
    @Override
    int getRateOfInterest() {
        return 9;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Badoda Bank");
    }
}
