package HN_KS24_CNTT5_NguyenTheKien;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner (System.in);
    static Students[] students;
    static int n = 0;

    public static void main (String[] args){
        int choice;

        do{
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiện thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp học lực theo giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default :
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }

    static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Students[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số sinh viên thứ " + (i + 1));

            String id;
            do {
                System.out.print("Mã SV (SV001): ");
                id = sc.nextLine();
            } while (!id.startsWith("SV") || id.length() != 5);

            System.out.print("Tên SV: ");
            String name = sc.nextLine();

            System.out.print("Điểm TB: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Students(id, name, score);
        }
    }

    static void displayStudents() {
        if (students == null) {
            System.out.println("Chưa có danh sách sinh viên ");
            return;
        }

        for (Students s : students) {
            System.out.println(s);
        }
    }
    static void sortByScoreDesc() {
        if (students == null) {
            System.out.println("Chưa có dữ liệu ");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Students temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("Đã sắp xếp theo học lực giảm dần ");
    }
}
