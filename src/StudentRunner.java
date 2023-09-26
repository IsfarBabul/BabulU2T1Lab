public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Martha", 10, 3.6, true);
        student1.studentStats();
        student1.gpaCheck();
        student1.collegeAdmissionCheck();

        Student student2 = new Student("Marco", 9, 4.0, true);
        student2.studentStats();
        student2.gpaCheck();
        student2.collegeAdmissionCheck();

        Student student3 = new Student("Mariana", 11, 2.3, false);
        student3.studentStats();
        student3.gpaCheck();
        student3.collegeAdmissionCheck();

        Student student4 = new Student("Markus", 12, 0.2, true);
        student4.studentStats();
        student4.gpaCheck();
        student4.collegeAdmissionCheck();
    }
}
