package day26;

public class Student implements Comparable<Student> {
    private String name;
    private int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.name.compareTo(this.name);
    }
}
