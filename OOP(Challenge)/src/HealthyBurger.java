class HealthyBurger extends HamBurgers {
    private String addition5Name;
    private double addition5Price = 0;

    private String addition6Name;
    private double addition6Price = 0;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "Brown Rye", meat, price);
    }
    public void setAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void setAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;

    }
    @Override
    public void getAllAdditions() {
        super.getAllAdditions();
        if (addition5Price > 0) {
            System.out.println("Additional " + addition5Name + " costs about " + addition5Price);
        }
        if (addition6Price > 0) {
            System.out.println("Additional " + addition6Name + " costs about " + addition6Price);
        }

    }
    @Override
    public double getFinalTotal() {
        return super.getFinalTotal() + addition5Price + addition6Price;
    }
}