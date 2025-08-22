package Functions_Methods;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 85) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 50) return 'C';
        else return 'F';
    }

    public void showDetails() {
        System.out.println("Student: " + name);
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }

    public void showDetails(boolean withMarks) {
        showDetails();
        if (withMarks) {
            System.out.print("Marks: ");
            for (int m : marks) System.out.print(m + " ");
            System.out.println();
        }
    }

    public static Student betterStudent(Student s1, Student s2) {
        return (s1.getAverage() > s2.getAverage()) ? s1 : s2;
    }
}
