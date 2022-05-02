public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        boolean validateFirstName = this.firstName.isEmpty();
        if (validateFirstName) {
            this.firstName = "";
        }
        return this.firstName;
    }

    public String getLastName() {
        boolean validateLastName = this.lastName.isEmpty();
        if (validateLastName) {
            this.firstName = "";
        }
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

}
