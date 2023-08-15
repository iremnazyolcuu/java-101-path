package OOP.StudentGradeSystem;

public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String branch, String phoneNumber) {
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Branch: " + this.branch);
    }

}
