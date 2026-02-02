class Student2 {
    private String id;
    private String name;
    public static int totalStudent = 0;

    public Student2(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }


    public void display() {
        System.out.println("Mã SV: " + id + ", Tên SV: " + name);
    }

    public static void displayTotal() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("SV001", "Kiên");
        Student2 s2 = new Student2("SV002", "Huy");
        Student2 s3 = new Student2("SV003", "Ninh");

        s1.display();
        s2.display();
        s3.display();

        Student2.displayTotal();
    }
}
