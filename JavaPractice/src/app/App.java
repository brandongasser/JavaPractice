package app;

import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

public class App {
    public static void main(String[] args) throws Exception {

        boolean amICool = true;

        if (amICool) {
            System.out.println("you're cool");
        } else {
            System.out.println("you are not cool");
        }

        int number = 65;

        if (number != 65) {
            System.out.println("Not Equals");
        } else {
            System.out.println("Equals");
        }


        int myFirstNumber = 2;
        int mySecondNumber = 4;

        if (myFirstNumber + mySecondNumber > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Not greather than 10");
        }

        // boolean operators

        // == is equal to
        // ! not
        // != is not equal to
        // && and
        // < > <= >=
        // || or
        // ^ xor

        // thing1 operator thing2
        // !(52 == 47)    true
        // 52 == 30 + 22    true
        // 52 != 47    true
        // 52 >= 47    true
        // false && true     false
        // false || true     true
        // true ^ true     false

        // ((57 == 42) || (57 == 57)) && !false
        // (false || true) && true
        // true && true
        // true

        while (true) {
            break;
        }

        do {
            
        } while (false);

        int potato = 0;
        
        while (potato < 1000) {
            System.out.println(potato);
            potato = potato + 1;
        }

        for (int potatoTwo = 0; potatoTwo < 1000; potatoTwo++) {
            System.out.println(potatoTwo);
        }
    }
}