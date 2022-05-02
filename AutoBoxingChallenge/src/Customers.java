import java.util.ArrayList;

public class Customers {
    private ArrayList<Double> transactionsArrayList = new ArrayList<Double>();
    private String name;

    public Customers(String name, double transaction) {
        this.name = name;
        this.transactionsArrayList.add(transaction);

    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transactionAmount) {
        transactionsArrayList.add(transactionAmount);
    }

    public void printAllTransactions() {
        for (int i = 0; i < transactionsArrayList.size(); i++) {
            System.out.println((i+1) + " --> " + transactionsArrayList.get(i));
        }
    }
}
