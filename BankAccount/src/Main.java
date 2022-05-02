public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();  //(324339020,1000  ,"Kasun", "kasunlaksiri@gmil.com", "071-1334573");
//        bankAccount.deposit(100);
//        bankAccount.withdraw(200);
//
//        BankAccount timAccount = new BankAccount("tim","tim.email.com", "071-43434343");
//        timAccount.deposit(100);
//        timAccount.withdraw(200);

        VipCustomer vipCustomer = new VipCustomer("tharanga", 100 ,"tharanga123anuradha@gmil.com");
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());
        System.out.println(vipCustomer.getName());
    }
}
