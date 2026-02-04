package btth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] list = new Employee[100];
        int current = 0;
        int choice;

        do {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Thêm quản lý");
            System.out.println("3. Tính lương tất cả");
            System.out.println("4. Hiển thị tất cả");
            System.out.println("5. Sắp xếp lương giảm dần");
            System.out.println("6. Đếm nhân viên và quản lý");
            System.out.println("7. Tìm kiếm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Nhập số lượng nhân viên: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Employee e = new Employee();
                        e.inputData(sc);
                        list[current++] = e;
                    }
                    break;
                }
                case 2: {
                    System.out.print("Nhập số lượng quản lý: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Manager m = new Manager();
                        m.inputManager(sc);
                        list[current++] = m;
                    }
                    break;
                }
                case 3: {
                    for (int i = 0; i < current; i++) {
                        list[i].calcSalary();
                    }
                    System.out.println("Đã tính lương xong");
                    break;
                }
                case 4: {
                    for (int i = 0; i < current; i++) {
                        list[i].displayData();
                    }
                    break;
                }
                case 5: {
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (list[i].getSalary() < list[j].getSalary()) {
                                Employee temp = list[i];
                                list[i] = list[j];
                                list[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp lương giảm dần");
                    break;
                }
                case 6: {
                    int countEmp = 0;
                    int countManager = 0;
                    for (int i = 0; i < current; i++) {
                        if (list[i] instanceof Manager) {
                            countManager++;
                        } else {
                            countEmp++;
                        }
                    }
                    System.out.println("Số nhân viên: " + countEmp);
                    System.out.println("Số quản lý: " + countManager);
                    break;
                }
                case 7: {
                    sc.nextLine();
                    System.out.print("Nhập tên cần tìm: ");
                    String key = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < current; i++) {
                        if (list[i].getName().toLowerCase().contains(key.toLowerCase())) {
                            list[i].displayData();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy");
                    }
                    break;
                }
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }
}
