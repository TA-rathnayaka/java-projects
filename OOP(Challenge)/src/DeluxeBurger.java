class DeluxeBurger extends HamBurgers {

    public DeluxeBurger() {
        super("Deluxe Burger", "White", "Sausage & bacon", 14.15);
        super.setAddition1("Chips", 2.75);
        super.setAddition2("Drinks", 1.81);
    }

    public DeluxeBurger(String name, String breadRollType, String meat, double basePrice) {
        super(name, breadRollType, meat, basePrice);
    }

    @Override
    public void setAddition1(String name, double price) {
        System.out.println("Cannot add new additions");;
    }

    @Override
    public void setAddition2(String name, double price) {
        System.out.println("Cannot add new additions");;
    }

    @Override
    public void setAddition3(String name, double price) {
        System.out.println("Cannot add new additions");;
    }

    @Override
    public void setAddition4(String name, double price) {
        System.out.println("Cannot add new additions");;
    }
}