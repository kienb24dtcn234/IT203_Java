import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 100;

        while (true) {
            int days = Integer.parseInt(sc.nextLine());
            if (days == 999) break;

            if (days <= 0) {
                score += 5;
            } else {
                score -= days * 2;
            }
        }

        System.out.println(score);

        if (score > 120) {
            System.out.println("Độc giả Thân thiết");
        } else if (score >= 80) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Độc giả cần lưu ý");
        }
    }
}
