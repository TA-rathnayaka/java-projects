import java.util.ArrayList;

public class MobilePhone {
    private static ArrayList<Contacts> phoneBook = new ArrayList<Contacts>();


    public void storeContacts(String name, int contactNumber) {
        if (getIndex(name) == -1) {
            Contacts contacts = new Contacts(name, contactNumber);
            phoneBook.add(contacts);
        }else{
            System.out.println("contact you entered already exists");
        }

    }

    private void modifyContacts(int position, String newContactName, int newContactNumber) {
        Contacts contacts = new Contacts(newContactName, newContactNumber);
        phoneBook.set(position, contacts);
    }


    public void modifyContacts(String existingContactName, String newContactName, int newContactNumber) {
        int index = getIndex(existingContactName);
        if (index >= 0) {
            modifyContacts(index, newContactName, newContactNumber);
        } else {
            System.out.println("The contact name doesn't exist");
        }
    }


    private void removeContact(int index) {
        phoneBook.remove(phoneBook.get(index));
    }

    public void removeContact(String contactName) {
        int index = getIndex(contactName);
        if ( index >= 0) {
            removeContact(index);
        }
        else {
            System.out.println(" The contact doesn't found ");
        }

    }

    private int getIndex(String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            String contactName = phoneBook.get(i).getName();
            if (contactName.equals(name)) {
                return phoneBook.indexOf(phoneBook.get(i));
            }

        }
        return -1;
    }

    public Contacts searchContacts(String contactName) {
        for (int i = 0; i < phoneBook.size(); i++) {
            int contactNumber = phoneBook.get(i).getPhoneNumber();
            String name = phoneBook.get(i).getName();
            if (contactName.equals(name)) {
                Contacts contact = phoneBook.get(i);
                return contact;

            }

        }

        return null;
    }


    public void listAllContacts() {
        for (int i = 0; i < phoneBook.size(); i++) {
            Contacts contact = phoneBook.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " ==> " + contact.getPhoneNumber());
        }
    }


}
