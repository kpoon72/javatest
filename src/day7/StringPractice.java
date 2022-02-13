package day7;

import java.util.logging.Logger;

public class StringPractice {
    public static void main(String[] args){
        String name = "Kamal Bahadur";
        String lname; // by default null
        String lowerCaseName=name.toString();
        String upperCase= "Kamal".toUpperCase();

        Logger.getGlobal().info(lowerCaseName);
        Logger.getGlobal().info(upperCase);
//        Logger.getGlobal().info(lname);
        Logger.getGlobal().info(name.substring(3));
        Logger.getGlobal().info(String.join("/","Kamal","4","Taman"));

        String s= "   ";

        Logger.getGlobal().info(String.valueOf(s.length()));
        Logger.getGlobal().info(String.valueOf(s.isEmpty()));
        Logger.getGlobal().info(String.valueOf(s.isBlank()));

        String st = s.trim();
        Logger.getGlobal().info(String.valueOf(st.length()));
        Logger.getGlobal().info(String.valueOf(st.isBlank()));
        Logger.getGlobal().info(String.valueOf(st.isEmpty()));


    }
}
