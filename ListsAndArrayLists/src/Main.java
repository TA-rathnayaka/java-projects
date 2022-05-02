import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quite = false;
        int choice = 0;
        while (!quite) {
            printInstructions();
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    RemoveItem();
                    break;
                case 5:
                    searchForItems();
                    break;
                case 6:
                    processArray();
                case 7:
                    quite = true;


            }


        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - print choice options.");
        System.out.println("\t 1 - print the list of grocery items.");
        System.out.println("\t 2 - add an item to the list.");
        System.out.println("\t 3 - to modify an item in a list.");
        System.out.println("\t 4 - to remove an item in a list.");
        System.out.println("\t 5 - search for an item in a list.");
        System.out.println("\t 6 - to quite the applications.");


    }

    public static void addItem() {
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter replacement item : ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter New item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);

    }

    public static void RemoveItem() {
        System.out.print("Please enter the grocery item  : ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItems() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
    public static void processArray(){
        //Copy all content to another newArray when initialization.
        ArrayList <String> newArray = new ArrayList<String>(groceryList.getGroceryList());
        //Copy all content to another nextArray
        ArrayList <String> nextArray = new ArrayList<String>();
        nextArray.addAll(groceryList.getGroceryList());
        // Turning ArrayList to an array
        String[] normalArray = new String[groceryList.getGroceryList().size()];
        normalArray = groceryList.getGroceryList().toArray(normalArray);
    }


//    private static Scanner scanner = new Scanner(System.in);
//    private static int[] baseData = new int[10];
//
//    public static void main(String[] args) {
//        System.out.println("Enter 10 numbers ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        baseData[10]= 2;
//        baseData[11]= 5;
//        printArray(baseData);
//    }
//    private static void getInput(){
//        for(int i=0; i < baseData.length; i++){
//            baseData[i] = scanner.nextInt();
//            scanner.nextLine();
//
//        }
//    }
//    private static void printArray(int[] array){
//        for(int i=0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//
//
//    }
//    private static void resizeArray() {
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for (int i=0; i < original.length; i++){
//            baseData[i] = original[i];
//        }
//    }

}
