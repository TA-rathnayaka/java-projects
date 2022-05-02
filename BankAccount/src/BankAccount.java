public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(0, 0, "Default Name", "Default Email Address", "000-0000000");
        System.out.println("Empty constructor was called");
    }
    public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account Constructor with parameters is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(121, 9000 ,customerName, email, phoneNumber);
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Now your account balance is " + this.balance);
    }
    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("Now your account balance is " + this.balance);
        }else {
            System.out.println("Only " + this.balance + " available. The Withdrawal is not processed");
        }
    }

}
