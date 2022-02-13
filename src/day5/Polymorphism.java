package day5;

public class Polymorphism {
    public static void main(String[] args){
    Bank b;
    b= new BOK();
        System.out.println(" BOK interest rate"+b.getRateOfInterest());
    b = new Chase();
        System.out.println("Chase Interest Rate"+b.getRateOfInterest());

        System.out.println("Data Member Polymorphism JR");
        System.out.println("Data member  "+b.typ);

    }
}
