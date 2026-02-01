public class BTTH06 {
    public static void main(String[] args) {
        Banking banking = new Banking("012345678","huy",99999.99);
        banking.display();
        banking.withdraw(99999);
        banking.display();
        banking.setName("hahaa");
        banking.setBalance(12345678.99);
        banking.setAccountNumber("987654321");
        banking.display();

//    BTTH:
//    Yêu cầu:
//            - Quản lý tài khoản ngân hàng (giao dịch)
//    Giải pháp:
// - Class
//- Object (Instance)
//- if else

//    B1: Định nghĩa Class:
//            - Thuộc tính:
//            + accountNumber – String – private
//	+ ownerName – String – private
//	+ balance – double - private
//- Phương thức:
//            + Constructors: (ko có tham số, có tham số)
//             + Getter / Setter
//	+ deposit( double money )
//		+ Kiểm tra tiền money có hợp lệ
//		+ Cộng số dư lên
//	+ withdraw( double money )
//		+ Kiểm tra số tiền money có hợp lệ hay không
//		+ Kiểm tra số dư có đủ rút hay không (balance – money < 0)
//		+ Trừ số dư đi
//	+ display()
//		+ định dạng
//		-----------------------------------
//    Số TK: 0987654321
//    Name: Hà Bích Ngọc
//    Balance: 100.000.000 VNĐ
//		----------------------------------------
//    B2: Lớp Kiểm thử (main để chạy)
//- Khởi tạo 2 tìa khoản (Object - Instances)
//- In thông tin tài khoản trước khi giao dịch
//- Thực hiện giao dịch
//- In thông tin tài khoản sau khi giao dịch


}

    public class Banking {
        private String accountNumber;
        private String name;
        private double balance;

        public Banking() {}
        public Banking(String accountNumber, String name, double balance) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }
        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public void diposit(double amount){
            if (amount > 0){
                this.balance += amount;
                System.out.println("You have deposited " + amount + " into your balance.");
            }else{
                System.out.println("Insufficient funds.");
            }

        }

        public void withdraw(double amount){
            if (amount > 0){
                this.balance -= amount;
                System.out.println("You have withdrawed " + amount + " into your balance.");
            }
            else{
                System.out.println("Insufficient funds.");
            }
        }
        public void display(){
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balance);
        }

    }