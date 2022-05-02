import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchesArrayList = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) < 0) {
            branchesArrayList.add(new Branch(name));
            return true;
        }
        return false;
    }

    private int findBranch(String name) {
        for (int i = 0; i < branchesArrayList.size(); i++) {
            if (branchesArrayList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private Branch findBranch(int index) {
        return this.branchesArrayList.get(index);
    }

    public void addCustomer(String branchName, String customerName, double transaction) {
        int index = findBranch(branchName);
        if (index >= 0) {
            Branch foundBranch = findBranch(index);
            foundBranch.addNewCustomers(customerName, transaction);
            System.out.println("Customer added successfully");
        } else {
            System.out.println("Customer name is already being use");
        }
    }

    public boolean updateTransaction(String branchName, String customerName, double transaction) {
        int index = findBranch(branchName);
        if (index >= 0) {
            Branch foundBranch = findBranch(index);
            foundBranch.addAdditionalTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    public void printAllCustomerDetails(String branchName, boolean transactions) {
        int index = findBranch(branchName);
        Branch branch = findBranch(index);
        for (int i = 0; i < branch.getCustomersArrayList().size(); i++) {
            System.out.println((i + 1) + " ==> " + branch.getCustomersArrayList().get(i).getName());
            if (transactions) {
                for (int j = 0; j < branch.getCustomersArrayList().get(i).getTransactionsArrayList().size(); j++) {
                    System.out.println("  [" + (j + 1) + "]  --> " + branch.getCustomersArrayList().get(i).getTransactionsArrayList().get(j));
                }

            }
        }

    }
}
