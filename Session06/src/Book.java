public class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;

    public Book(String bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lập trình Java", "Nguyễn Văn A", 75000);
        Book b2 = new Book("B02", "Cấu trúc dữ liệu", "Trần Thị B", 82000);

        b1.display();
        b2.display();
    }
}
