public class Ex04 {
    public static void main(String[] args) {
        double bookPriceUSD = 25.5;
        float exchangeRate = 25450.0f;
        double totalPriceVND = bookPriceUSD * exchangeRate;
        long totalPriceVNDRounded = (long) totalPriceVND;
        System.out.println(totalPriceVNDRounded);
    }
}