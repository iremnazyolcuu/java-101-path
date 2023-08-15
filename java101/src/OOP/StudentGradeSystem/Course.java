package OOP.StudentGradeSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int grade;
    int oralExamGrade;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
        this.oralExamGrade = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("The teacher's field of expertise does not match the course subject.");
        }
    }
}
