public class Ex02 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int total = n * m * 5000;
        if (n > 7 && m >= 3) {
            total += total * 0.2;
        }
        System.out.println("Tổng tiền phạt: " + total + " VNĐ");
        boolean reqKhoaThe = total > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + reqKhoaThe);
    }
}