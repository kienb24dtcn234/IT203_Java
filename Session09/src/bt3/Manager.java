package bt3;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phong ban: " + department);
    }
}

