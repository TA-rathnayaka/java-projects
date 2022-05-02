public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australian Bank");

        if(!bank.addBranch("Adelide")){
            System.out.println("The Branch name Already exist");
        }
        bank.addCustomer("Adelide","Tharanga", 1234563.89);
        bank.printAllCustomerDetails("Adelide",true);
    }
}
