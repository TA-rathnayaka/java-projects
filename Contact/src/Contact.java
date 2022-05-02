public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumbers) {
        this.name = name;
        this.phoneNumber = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumbers() {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
