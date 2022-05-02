import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0715153670");

    public static void main(String[] args) {
        boolean quite = false;
        while (!quite) {
            printActions();
            System.out.println("Enter Number : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 0:
                    System.out.println("Shutting down");
                    quite = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();

                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void startPhone() {
        System.out.println("Starting the phone....");
    }

    private static void printActions() {
        System.out.println("Available actions \npress");
        System.out.println("0 - to shutdown");
        System.out.println("1 - print contacts");
        System.out.println("2 - to add new contact");
        System.out.println("3 - to update an existing contacts");
        System.out.println("4 - to remove an existing contact ");
        System.out.println("5 - query an existing contact exists");
        System.out.println("6 - print available actions");
        System.out.println("Choose available actions: ");
    }

    private static void printContacts() {
        mobilePhone.printContacts();

    }

    private static void addNewContact() {
        System.out.println("Enter the name of the contact");
        String contactName = scanner.nextLine();
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(contactName, phoneNumber);
        if (mobilePhone.addContacts(newContact)) {
            System.out.println("New Contact added " + contactName + ", Phone " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + contactName + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter contact name : ");
        String name = scanner.nextLine();
        Contact foundContact = mobilePhone.queryContact(name);
        if (foundContact == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact number: ");
            String newPhoneNumber = scanner.nextLine();
            if (mobilePhone.updateContact(foundContact, Contact.createContact(newName, newPhoneNumber))) {
                System.out.println("Successfully updated record");
            } else {
                System.out.println("Error updating record.");
            }
        }
    }

    private static void removeContact() {
        System.out.println("Enter contact name : ");
        String name = scanner.nextLine();
        Contact foundContact = mobilePhone.queryContact(name);
        if (foundContact == null) {
            System.out.println("Contact not found");
        } else {
            if (mobilePhone.removeContact(foundContact)) {
                System.out.println("Successfully removed contact");
            } else {
                System.out.println("Error removing record ");
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter contact name : ");
        String name = scanner.nextLine();
        Contact foundContact = mobilePhone.queryContact(name);
        if (foundContact == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Name: " + foundContact.getName() + ", phone number: " + foundContact.getPhoneNumbers());
        }
    }
}



