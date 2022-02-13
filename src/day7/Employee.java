package day7;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Employee {
    private String name;
    private double salary;
    private LocalDate date;

    public Employee(){
        Logger.getGlobal().info("Empty Constructor is Called");
    }

    public Employee(String name, double salary, LocalDate date){
        this.name=name;
        this.salary=salary;
        this.date=date;
    }

}
