package day6;

import java.util.logging.Logger;

public class PredefinedClass {
    public static void main(String[] args){
        double rnum = Math.random();
        Logger.getGlobal().info(String.valueOf(rnum));
//        System.out.println(rnum);

        double a= 5.5;
        double ceilNumber = Math.ceil(a);
        double floorNumber = Math.floor(a);
        double roundNumber = Math.round(a);

        Logger.getGlobal().info(String.valueOf(ceilNumber));
        Logger.getGlobal().info(String.valueOf(floorNumber));
        Logger.getGlobal().info(String.valueOf(roundNumber));
    }
}
