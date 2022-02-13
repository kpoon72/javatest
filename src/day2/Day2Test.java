package day2;

public class Day2Test {
    public static void main(String[] args){
        Student std = new Student ();
        std.studying();

        Lift lf = new Lift();
        System.out.println(lf.color);
        lf.setCurrentWeight(23);
        System.out.println(lf.getCurrentWeight());

    }
}
