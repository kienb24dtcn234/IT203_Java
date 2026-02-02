

    public class Student {
        private String name;
        private int id;
        public static int studentCount = 0;
        public static final String SCHOOL_NAME = "ABC University";

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            studentCount++;
        }

        public String getName() {
            return name;

        }

        public int getId() {
            return id;
        }

        public static int getStudentCount() {
            return studentCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void displayInfo() {
            System.out.println("Mã SV: " + id);
            System.out.println("Tên SV: " + name);
            System.out.println("Trường: " + SCHOOL_NAME);
            System.out.println("----------------------");
        }

        public static void showTotalStudent() {
            System.out.println("Tổng số sinh viên đã tạo: " + studentCount);
        }

        public static void main(String[] args) {
            Student s1 = new Student("Kiên", 101);
            Student s2 = new Student("Huy", 102);
            Student s3 = new Student("Ninh", 103);

            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();

            Student.showTotalStudent();
        }
    }
