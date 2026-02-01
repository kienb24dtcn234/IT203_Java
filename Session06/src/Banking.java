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
    public static void main(String[] args) {
        Banking banking = new Banking("012345678","kien",9999912.99);
        banking.display();
        banking.withdraw(10);
        banking.display();
        banking.accountNumber = "0123456790";
        banking.name = "huy";
        banking.balance = 99999.9999;
        banking.display();




    }
}




