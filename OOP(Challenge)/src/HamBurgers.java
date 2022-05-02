public class HamBurgers {
    private String addition1Name;
    private double addition1Price = 0;

    private String addition2Name;
    private double addition2Price = 0;

    private String addition3Name;
    private double addition3Price = 0;

    private String addition4Name;
    private double addition4Price = 0;

    private String breadRollType;
    private String name;
    private String meat;
    private double basePrice;

    public HamBurgers(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void setAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void setAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void setAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void setAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void getAllAdditions() {
        System.out.println(name + " Ham Burger on a " + breadRollType + " roll with " + this.meat  + " price is " + basePrice);
        if (addition1Price > 0) {
            System.out.println("Additional " + addition1Name + " costs about " + addition1Price);
        }
        if (addition2Price > 0) {
            System.out.println("Additional " + addition2Name + " costs about " + addition2Price);
        }
        if (addition3Price > 0) {
            System.out.println("Additional " + addition3Name + " costs about " + addition3Price);

        }
        if (addition4Price > 0) {
            System.out.println("Additional " + addition4Name + " costs about " + addition4Price);

        }
    }
    public double getFinalTotal(){
        return basePrice + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}