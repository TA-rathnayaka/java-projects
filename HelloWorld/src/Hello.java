import java.io.ObjectInputStream;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Tharanga");
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = mySecondNumber + myThirdNumber + myFirstNumber;
        int myLastOne = - myTotal + 1000 ;
        System.out.println(myLastOne);
    }
}
