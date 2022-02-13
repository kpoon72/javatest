package day4;

public class BankEncapsulation {
    public static void main(String[] args){
        //crating first object
        Account account1= new Account();
        account1.setAccountNumber("1");
        account1.setAccountHolderName("Kamal");
        account1.setBalance(150000);

        // creating second object
        Account account2= new Account();
        account2.setAccountNumber("2");
        account2.setAccountHolderName("Taman");
        account2.setBalance(50000);

        //Interest calculation
        account1.addInterest();
        account2.addInterest();

        System.out.println("$$$$$$$$$$$$ Before Transfer $$$$$$$$$$$$$");
        System.out.println("Account 1 Balance : "+account1.getBalance());
        System.out.println("Account 2 Balance : "+account2.getBalance());

        //transfering balance from account1 to account2
        account1.balanceTransfer(account2,50000);

        System.out.println("$$$$$$$$$$ After transfer $$$$$$$");
        System.out.println("Account 1 Balance : "+account1.getBalance());
        System.out.println("Account 2 Balance : "+account2.getBalance());

    }
}
