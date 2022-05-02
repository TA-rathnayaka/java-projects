import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        int number = 0;
        while (flag) {
            printInstructions();
            System.out.print("Choose: ");
            number = scanner.nextInt();
            switch (number) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printAllContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    searchContacts();
                    break;
                case 4:
                    modifyContacts();
                    break;
                case 5:
                    removeContacts();
                    break;
                case 6:
                    flag = false;


            }

        }
    }

    public static void printInstructions() {
        System.out.println("Press");
        System.out.println("0 - to print instructions");
        System.out.println("1 - to print all contacts");
        System.out.println("2 - to add contacts");
        System.out.println("3 - to search contacts");
        System.out.println("4 - to modify contacts");
        System.out.println("5 - to remove contacts");
        System.out.println("6 - to quite");
    }

    public static void printAllContacts() {
        mobilePhone.listAllContacts();
    }

    public static void addContacts() {
        System.out.print("Enter the Name : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.storeContacts(name, number);
    }

    public static void searchContacts() {
        System.out.print("Enter the Name : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        Contacts contacts = mobilePhone.searchContacts(name);
        if (contacts == null){
            System.out.println("No results found");
        }else{
            System.out.println("Found results \n" + contacts.getName() + " ==> " + contacts.getPhoneNumber());
        }
    }

    public static void modifyContacts() {
        System.out.println("Enter name you want to modify :");
        scanner.nextLine();
        String existingName = scanner.nextLine();
        System.out.println("Enter new name you want to add :");
        String newName = scanner.nextLine();
        System.out.println("Enter new number you want to add :");
        int newNumber = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.modifyContacts(existingName, newName, newNumber);

    }

    public static void removeContacts() {
        System.out.println("Enter name you want to remove :");
        scanner.nextLine();
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

}
