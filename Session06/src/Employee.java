public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyễn Văn A");
        Employee e3 = new Employee("NV02", "Trần Thị B", 15000000);

        e1.display();
        e2.display();
        e3.display();
    }
}
