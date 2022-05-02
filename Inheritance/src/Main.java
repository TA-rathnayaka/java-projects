public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1, 1, 5,10);
//        animal.eat();
        Dog dog = new Dog("Toby", 3, 20, 2,  4, 1, 32, "Coat");
//        dog.eat();
        dog.run();
//
        Fish fish = new Fish("Nemo", 3, 10, 2, 2, 4);
        fish.swim(5);
    }
}
