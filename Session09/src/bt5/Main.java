package bt5;

public class Main {
    public static void main(String[] args) {
        Employee[] list = new Employee[3];
        list[0] = new OfficeEmployee("Huy", 1000);
        list[1] = new ProductionEmployee("Cachiu", 120, 8);
        list[2] = new OfficeEmployee("Minh", 900);

        double totalSalary = 0;
        for (Employee e : list) {
            totalSalary += e.calculateSalary();
        }

        System.out.println("Tong luong: " + totalSalary);
    }
}

