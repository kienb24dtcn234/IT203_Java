public class Ex05 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int bookCode = scanner.nextInt();
        int thousands = bookCode / 1000;
        int hundreds = (bookCode % 1000) / 100;
        int dozens = (bookCode % 100) / 10;
        int units = bookCode % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        boolean isValid = (sumOfFirstThreeNumber % 10) == units;
        System.out.println(isValid);
    }
}
