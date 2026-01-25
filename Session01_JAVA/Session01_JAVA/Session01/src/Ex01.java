import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách (bookID): ");
        String bookID = scanner.nextLine();
        System.out.print("Nhập tên sách (bookName): ");
        String bookName = scanner.nextLine();
        System.out.print("Nhập năm xuất bản (publishYear): ");
        int publishYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giá sách (price): ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Sách còn không? (true/false): ");
        boolean isAvailable = scanner.nextBoolean();
        scanner.nextLine();
        int bookAge = 2026 - publishYear;
        System.out.println("\n--- Thông tin sách ---");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.println("Năm xuất bản: " + publishYear);
        System.out.printf("Giá sách: %.2f\n", price);
        System.out.println("Tuổi thọ sách: " + bookAge + " năm");
        System.out.println("Tình trạng: " + (isAvailable ? "Còn sách" : "Đã mượn"));
        scanner.close();
    }
}