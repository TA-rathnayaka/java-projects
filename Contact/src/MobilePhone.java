import java.util.ArrayList;

public class MobilePhone {
    private String myPhoneNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addContacts(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", Was not found");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists");
            System.out.println("update was not successful");
            return false;
        }
        contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", Was not found");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + " was removed ");
        return true;
    }
    public void printContacts(){
        for(int i=0; i < this.contacts.size(); i++){
            System.out.println((i+1) + ". " + this.contacts.get(i).getName() + " => " + this.contacts.get(i).getPhoneNumbers() );
        }
    }
    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >=0) {
            return contacts.get(position);
        }
        return null;
    }
}
