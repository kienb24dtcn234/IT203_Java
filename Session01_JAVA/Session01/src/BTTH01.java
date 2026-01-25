import java.util.Scanner;

public class BTTH01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhap gia bia: ");
        double price = sc.nextDouble();

        System.out.print("Sach con khong? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int age = 2026 - publishYear;

        System.out.printf("\n-----Phieu thong tin sach-----\n");
        System.out.printf("Ma sach: " + bookID);
        System.out.printf("Ten sach: " + bookName.toUpperCase());
        System.out.printf("Nam xuat ban: " + publishYear);
        System.out.printf("Gia bia: %.2f\n",price);
        System.out.printf("Tuoi tho sach: " + age);

        if (isAvailable) {
            System.out.printf("Con sach");
        } else {
            System.out.printf("Het sach");
        }
    }
}