package multithreading.synchronization;

/**
 * it
 */

public class WithdrawMoneyApi {
    double amount =1000;
    synchronized void withdrawMoney(double withdraw){
        if(amount >=withdraw){
            System.out.println("Withdraw Money : "+withdraw);
            amount=amount-withdraw;
            System.out.println("Amount after withdraw : "+amount);
        }
        else{
            System.out.println("Insufficient Balance, you have "+amount+" in account");
        }
    }
}

class BankApi extends Thread{
    static final private WithdrawMoneyApi withdrawMoneyApi = new WithdrawMoneyApi();
    double withdraw;

    @Override
    public void run() {
        withdrawMoneyApi.withdrawMoney(withdraw);
    }

    public static void main(String[] args) {
        BankApi bankApi1 = new BankApi();
        bankApi1.start();
        bankApi1.setName("Thread1");
        bankApi1.withdraw = 700;

        BankApi bankApi2 = new BankApi();
        bankApi2.start();
        bankApi2.setName("Thread2");
        bankApi2.withdraw = 500;

        BankApi bankApi3 = new BankApi();
        bankApi3.start();
        bankApi3.setName("Thread3");
        bankApi3.withdraw = 900;
    }
}
