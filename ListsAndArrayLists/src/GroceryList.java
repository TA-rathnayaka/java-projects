import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items for your grocery List");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + " . " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem ,String newItem){
        int position = searchItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("The grocery item in index " + position + " has been modified");
    }
    public void removeGroceryItem(String item){
       int position = searchItem(item);
       if (position >= 0) {
           removeGroceryItem(position);
       }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    private int searchItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = searchItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }
}
