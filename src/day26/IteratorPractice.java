package day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

public class IteratorPractice {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Kalu");
        names.add("Bhallu");
        names.add("Dallu");

        Logger.getGlobal().info(names.toString());

       /* Iterator<String> it = names.iterator();
        //String s =it.next();
        //System.out.println(s); // it will just print Kalu

        while (it.hasNext()){
            String s1 = it.next();
            System.out.println(s1);
        }*/
        for (String s3: names){
            Logger.getGlobal().info(s3);
        }

        boolean check = names.contains("Kalu");
        Logger.getGlobal().info(String.valueOf(check));

       // Collection<Student> students = new ArrayList<>();
       // Collection<Student> students = new HashSet<>(); // need to implement has set method in Student class and toString
        //Collection<Student> students = new TreeSet<>(); // No dublicate/ Display in order kamal first then Bhola..Implements Comparable interface and override Compareto method at Student Class
        Collection<Student> students = new LinkedHashSet<>();//this will keep in order
        students.add(new Student("Kamal",1));
        students.add(new Student("Bhola",2));
        Logger.getGlobal().info(students.toString());


        boolean chek = students.contains(new Student("Kamal",1));
        Logger.getGlobal().info(String.valueOf(chek)); // We need to get equal to method on Studnet class to compare

        students.clear();
        boolean ch= students.isEmpty();
        Logger.getGlobal().info(String.valueOf(ch));
    }
}
