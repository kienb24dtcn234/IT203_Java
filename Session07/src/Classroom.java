class ClassRoom {
    private String studentName;
    public static double classFund = 0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void payFund(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng " + amount);
    }

    public static void showTotalFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }

    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("Huy");
        ClassRoom s2 = new ClassRoom("Hiền");
        ClassRoom s3 = new ClassRoom("Cachiu");

        s1.payFund(50000);
        s2.payFund(30000);
        s3.payFund(20000);

        ClassRoom.showTotalFund();
    }
}
