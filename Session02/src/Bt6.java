import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            int borrow = Integer.parseInt(sc.nextLine());

            if (borrow == 0) {
                continue;
            }

            if (borrow > max) {
                max = borrow;
            }

            if (borrow < min) {
                min = borrow;
            }

            sum += borrow;
            count++;
        }

        double avg = count > 0 ? (double) sum / count : 0;

        System.out.println("Cao nhất: " + max);
        System.out.println("Thấp nhất: " + min);
        System.out.println("Trung bình: " + avg);
    }
}
