import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int daysLate = Integer.parseInt(sc.nextLine());
            total += daysLate * 5000;
        }

        System.out.println(total);
    }
}
