package OOP.StudentGradeSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNumber;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNumber, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNumber = stuNumber;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamGrades(int note1, int oralNote1, int note2, int oralNote2, int note3, int oralNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.grade = note1;
        }

        if (oralNote1 >= 0 && oralNote1 <= 100) {
            this.c1.oralExamGrade = oralNote1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.grade = note2;
        }

        if (oralNote2 >= 0 && oralNote2 <= 100) {
            this.c2.oralExamGrade = oralNote2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.grade = note3;
        }

        if (oralNote3 >= 0 && oralNote3 <= 100) {
            this.c3.oralExamGrade = oralNote3;
        }
    }

    void isPass() {
        int firstCourseAvg = (80 * this.c1.grade) / 100 + (20 * this.c1.oralExamGrade) / 100;
        int secondCourseAvg = (80 * this.c2.grade) / 100 + (20 * this.c2.oralExamGrade) / 100;
        int thirdCourseAvg = (80 * this.c3.grade) / 100 + (20 * this.c3.oralExamGrade) / 100;

        this.average = (firstCourseAvg + secondCourseAvg + thirdCourseAvg) / 3.0;
        if (this.average > 55) {
            System.out.println("Congratulations, you pass the class!");
            this.isPass = true;
        } else {
            System.out.println("Unfortunately, you did not pass the class!");
            this.isPass = false;
        }
        printGrades();
    }

    void printGrades() {
        System.out.println("========================================");
        System.out.println("Student Name: " + this.name);
        System.out.println(this.c1.name + " grade is: " + this.c1.grade);
        System.out.println(this.c1.name + " oral exam grade is: " + this.c1.oralExamGrade);
        System.out.println(this.c2.name + " grade is: " + this.c2.grade);
        System.out.println(this.c2.name + " oral exam grade is: " + this.c2.oralExamGrade);
        System.out.println(this.c3.name + " grade is: " + this.c3.grade);
        System.out.println(this.c3.name + " oral exam grade is: " + this.c3.oralExamGrade);
        System.out.println("Your average grade is: " + this.average);
    }
}


