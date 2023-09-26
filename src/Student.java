public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private boolean extracurriculars;

    public Student(String studentName, int studentGradeLevel, double studentGpa, boolean studentExtracurriculars) {
        name = studentName;
        gradeLevel = studentGradeLevel;
        gpa = studentGpa;
        extracurriculars = studentExtracurriculars;
    }

    public void studentStats() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("Extracurriculars: " + extracurriculars);
    }

    public void gpaCheck() {
        if (gpa >= 4.0) {
            System.out.println("This student is excellent in their studies.");
        } else if (gpa >= 3.0) {
            System.out.println("This student is great in their studies.");
        } else if (gpa >= 2.0) {
            System.out.println("This student is subpar in their studies.");
        } else {
            System.out.println("This student is poor in their studies.");
        }
    }

    public void collegeAdmissionCheck() {
        if (gpa >= 4.0 && extracurriculars) {
            System.out.println("This student has a competitive chance in college admissions.");
        } else if (gpa >= 4.0 || (gpa >= 3.0 && extracurriculars)) {
            System.out.println("This student has a decent chance in college admissions.");
        } else if (gpa >= 3.0 || (gpa >= 2.0 && extracurriculars)) {
            System.out.println("This student has an  acceptable chance in college admissions.");
        } else if (gpa >= 2.0 || (gpa >= 1.0 && extracurriculars)) {
            System.out.println("This student has a minimal chance in college admissions.");
        } else {
            System.out.println("This student does not have a chance in college admissions.");
        }
    }

}

