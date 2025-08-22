package Functions_Methods;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", new int[]{85, 90, 80});
        Student s2 = new Student("Bob", new int[]{70, 60, 65});

        s1.showDetails(true);
        s2.showDetails();

        Student top = Student.betterStudent(s1, s2);
        System.out.println("\nBetter Student: " + top.getGrade() + " Grade, Avg = " + top.getAverage());
    }
}
