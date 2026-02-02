package BTTH;

public class BTTH07 {
    public static void main(String[] args) {
        Student sv1 = new Student(1, "Hà Bích Ngọc");
        Student sv2 = new Student(2, "Nguyễn Văn A");
        Student sv3 = new Student(3, "Trần Thị B");
        sv1.displayInfo();
        sv2.displayInfo();
        sv3.displayInfo();
        Student.showTotalStudent();
    }
}
