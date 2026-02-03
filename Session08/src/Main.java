package HN_KS24_CNTT5_NguyenTheKien;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Students[] students;
    static int n = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = sc.nextInt();
            sc.nextLine(); // chống trôi lệnh

            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 5);
    }

    // ======================
    // 1. Nhập danh sách sinh viên
    static void inputStudents() {
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Students[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));

            String id;
            do {
                System.out.print("Ma SV (SV001): ");
                id = sc.nextLine();
            } while (!id.startsWith("SV") || id.length() != 5);

            System.out.print("Ten SV: ");
            String name = sc.nextLine();

            System.out.print("Diem TB: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Students(id, name, score);
        }
    }

    // ======================
    // 2. Hiển thị danh sách
    static void displayStudents() {
        if (students == null) {
            System.out.println("Chua co danh sach sinh vien!");
            return;
        }

        for (Students s : students) {
            System.out.println(s);
        }
    }

    // ======================
    // 3. Tìm kiếm theo học lực
    static void searchByRank() {
        if (students == null) {
            System.out.println("Chua co du lieu!");
            return;
        }

        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (Students s : students) {
            if (s.getRank().equalsIgnoreCase(rank)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }

    // ======================
    // 4. Sắp xếp giảm dần theo điểm
    static void sortByScoreDesc() {
        if (students == null) {
            System.out.println("Chua co du lieu!");
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

        System.out.println("Da sap xep theo hoc luc giam dan!");
    }
}
