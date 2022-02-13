package day4;

import java.util.logging.Logger;

public class Account {
    //accountNumber
    // accountHolderName
    // balance
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private final float INTEREST_RATE = 0.05f;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //deposit
    public void deposit(double amount){
        Logger.getGlobal().info(this.accountHolderName);
        Logger.getGlobal().info(this.accountNumber);
        this.balance += amount;
    }

    //addInterest
    public void addInterest(){
        double interest =(this.getBalance()*1*INTEREST_RATE);
        double balanceAfterInterest=this.getBalance()+interest;
        System.out.println("Principal Amount : "+this.getBalance());
        System.out.println("Interest Amount : "+interest);
        this.setBalance(balanceAfterInterest);
        System.out.println("New Account Balance : "+this.getBalance());
    }

    //transfer balance between accounts
    public void balanceTransfer(Account fromAccount, double amountToBeTransferred){
        //TODO check if sufficient balance to be transferrred is available or not
        if(fromAccount.getBalance()>=amountToBeTransferred ){
            fromAccount.setBalance(fromAccount.getBalance()-amountToBeTransferred);
            this.setBalance(this.getBalance()+amountToBeTransferred);
        }
    }

}
