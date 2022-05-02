import java.util.ArrayList;

public class Branch {
    private ArrayList<Customers> customersArrayList = new ArrayList<Customers>();
    private String name;

    public Branch(String name) {
        this.name = name;

    }

    public ArrayList<Customers> getCustomersArrayList() {
        return customersArrayList;
    }

    public boolean addNewCustomers(String name, double transaction) {
        if (searchCustomer(name) < 0) {
            this.customersArrayList.add(new Customers(name, transaction));
            return true;
        }

        return false;
    }

    public boolean addAdditionalTransaction(String name, double transactionAmount) {
        int index = searchCustomer(name);
        if (index >= 0) {
            Customers foundCustomer = searchCustomer(index);
            foundCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    private int searchCustomer(String name) {
        for (int i = 0; i < customersArrayList.size(); i++) {
            if (customersArrayList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private Customers searchCustomer(int index) {
        return customersArrayList.get(index);
    }

    public String getName() {
        return name;
    }

}

