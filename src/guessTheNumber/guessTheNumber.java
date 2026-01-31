package guessTheNumber;

import java.util.Random;

public class guessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("HEADS!!!");
        }else {
            System.out.println("TAILS!!!");
        }

    }
}
