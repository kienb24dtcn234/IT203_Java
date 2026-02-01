public class Student {
    private String studentId;
    private String fullName;
    private int birthYear;
    private double gpa;

    public Student(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm trung bình: " + gpa);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyễn Văn A", 2004, 3.5);
        Student s2 = new Student("SV002", "Trần Thị B", 2005, 3.8);

        s1.display();
        s2.display();
    }
}
