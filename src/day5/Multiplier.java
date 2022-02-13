package day5;

public class Multiplier {
    public static void main(String[] args){
        System.out.println(Multiplier.multiply(2,2));
        System.out.println(Multiplier.multiply(2,2,2));
        System.out.println(Multiplier.multiply(2.2,2.2));
    }
    static int multiply(int a, int b){
        return a*b;
    }

    static int multiply(int a, int b,int c){
        return a*b*c;
    }

    static double multiply(double a, double b){
        return a*b;
    }
}
