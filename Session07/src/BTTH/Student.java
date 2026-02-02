package BTTH;

public class Student {
    private int id;
    private String name;
    public static int studentCount = 0;
    public static final String SCHOOL_NAME = "PTIT";
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("-----------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("-----------------------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Tong so sinh vien: " + studentCount);
    }
}
