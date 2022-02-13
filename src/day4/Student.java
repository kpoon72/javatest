package day4;

public class Student {
    private String name;
    private String phoneNumber;
    private String dob;
    private String sClass;
    private String rollNumber;
    private String socialSecurity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

//    public String getSocialSecurity() {
//        return socialSecurity;
//    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    //present
    public void present(){
        System.out.println("Student is present");
    }

    //study
    public void studying(){
        System.out.println("Student is studying while sleeping lol");
    }
}
