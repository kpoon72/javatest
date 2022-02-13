package day4;

public class StudentEncapsulation {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setName("Bhairav");
        student1.setPhoneNumber("4697653426");

        student1.studying();


        Student student2 = new Student();
        student2.setName("Batuk");
        student2.setSocialSecurity("302-34-2377");

        student2.present();

        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}
