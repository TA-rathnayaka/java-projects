public class Main {
    public static void main(String[] args) {
        HamBurgers hamburgers = new HamBurgers("Basic", "White", "Sausage", 3.56);
        hamburgers.getAllAdditions();
        hamburgers.setAddition1("tomato", 0.27);
        hamburgers.setAddition2("Lettuce", 0.75);
        hamburgers.setAddition3("Cheese", 1.13);
        hamburgers.getAllAdditions();
        System.out.println("Total burger price is = " + hamburgers.getFinalTotal());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.57);
        healthyBurger.setAddition1("eggs", 0.27);
        healthyBurger.setAddition2("tomato", 0.27);
        healthyBurger.setAddition3("Lettuce", 0.75);
        healthyBurger.setAddition5("Cheese", 1.13);
        healthyBurger.getAllAdditions();
        System.out.println("Total burger price is = " + healthyBurger.getFinalTotal());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.getAllAdditions();
        System.out.println("Total burger price is = " + deluxeBurger.getFinalTotal());


    }
}
