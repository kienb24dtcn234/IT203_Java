import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        int currentBooks = Integer.parseInt(sc.nextLine());

        if (age >= 18 && currentBooks < 3) {
            System.out.println("Cho phép mượn sách");
        } else if (age < 18) {
            System.out.println("Bạn chưa đủ tuổi");
        } else {
            System.out.println("Bạn đã mượn quá số lượng cho phép");
        }
    }
}
