package OOP.StudentGradeSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("David Johnson", "HIST", "135");
        Teacher t2 = new Teacher("Emily Williams", "PHYS", "246");
        Teacher t3 = new Teacher("Sarah Anderson", "CHEM", "753");

        Course history = new Course("History", "101", "HIST");
        history.addTeacher(t1);

        Course physics = new Course("Physics", "202", "PHYS");
        physics.addTeacher(t2);

        Course chemistry = new Course("Chemistry", "303", "CHEM");
        chemistry.addTeacher(t3);

        Student s1 = new Student("Ella Johnson", "456", "4", history, physics, chemistry);
        s1.addBulkExamGrades(100, 50, 40, 85, 90, 45);
        s1.isPass();
    }
}
