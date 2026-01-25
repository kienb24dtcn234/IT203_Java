public class Ex03 {

    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.println("Trước khi hoán đổi:");
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("Địa chỉ của book1: " + System.identityHashCode(book1));
        System.out.println("Địa chỉ của book2: " + System.identityHashCode(book2));

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.println("\nSau khi hoán đổi:");
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("Địa chỉ của book1: " + System.identityHashCode(book1));
        System.out.println("Địa chỉ của book2: " + System.identityHashCode(book2));

        /*
         * Giải thích:
         *
         * 1.  Bộ nhớ Stack:
         *     - Các biến `book1`, `book2` và `temp` được lưu trữ trên Stack. Stack lưu trữ các tham chiếu tới các đối tượng String trên Heap.
         *     - Ban đầu, `book1` trỏ đến String "Java Basic" trên Heap, `book2` trỏ đến String "Python Intro" trên Heap.
         * 2.  Bộ nhớ Heap:
         *     - Các chuỗi "Java Basic" và "Python Intro" được lưu trữ trên Heap.
         * 3.  Quá trình hoán đổi:
         *     - `String temp = book1;` gán tham chiếu của book1 vào biến temp (vẫn trỏ tới "Java Basic").
         *     - `book1 = book2;` book1 bây giờ trỏ tới "Python Intro".
         *     - `book2 = temp;` book2 bây giờ trỏ tới "Java Basic".
         * 4.  Kết quả:
         *     - book1 trỏ tới "Python Intro", book2 trỏ tới "Java Basic".
         *     - Các đối tượng chuỗi vẫn tồn tại trên Heap; chỉ các tham chiếu trên Stack được cập nhật.
         *     - Địa chỉ hash code hiển thị sự đổi thay của tham chiếu sau khi hoán đổi.
         */
    }
}