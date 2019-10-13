import java.util.Random;

public class RandomPicker {

    public static final int CONSTANT = 50;

    public static void main (String[] args) {
        for(int i = 0; i < 3; i++) {
            double randomValue = Math.random();
            int result = (int)(randomValue * CONSTANT);
            System.out.println(result);
        }

        Random randomGenerator = new Random();
        for (int j = 0; j < 3; j++) {
            double randomValue = randomGenerator.nextDouble();
            int result = (int)(randomValue * CONSTANT);
            System.out.println(result);
        }


    }
}