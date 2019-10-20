import java.util.Scanner;

/**
 * Created by
 */
public class QuadraticCalculator {

    public static void main(String args[]) {

        boolean done = false;
        Scanner inputScanner = new Scanner(System.in);

        // while (!done) {

        //     // enter code to get the information for the equation here
        //     System.out.println("Please enter the three numbers you want to solve for a, b and c of a quadratic equation:");
        //     System.out.println("(enter all numbers with spaces, or enter quit to stop the program)");
        //     Object input = inputScanner.next();
        //     // if the first input is a string, then make sure it is time to quit
        //     if (input instanceof String) {
        //         done = true;
        //     }
        //     // otherwise check to see if it is something we can use, if so grab the rest of the data
        //     else if (input instanceof Double) {
        //         System.out.println("We're cooking with gas, boys!: " + input);


        //         // do quadratic calculation and output possible answers (there are two)
        //     }
        //     // it it is none of the above, it is probably invalid input
        //     else {
        //         inputScanner.next();
        //     }
        // }

        double[] inputs = new double[3];
        int index = 0;
        String input = inputScanner.next();

        while(!input.equals("quit") && index < 3) {
            try {
                double aNumber = Double.parseDouble(input);
                System.out.println("Adding number to array of inputs: " + aNumber);
                inputs[index] = aNumber;
                index++;
            } catch(NumberFormatException e) {
                System.out.println("Unable to parse a number from input value: " + input);
                System.exit(1);
            }

            if (index < 3) {
                input = inputScanner.next();
            }
        }

        if (inputs.length == 3) {
            System.out.println("We are ready to compute!");
            double a = inputs[0];
            double b = inputs[1];
            double c = inputs[2];
            Double firstAnswer = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            Double secondAnswer = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            if (firstAnswer.isNaN() || secondAnswer.isNaN()) {
                System.out.println("Results are not a number");
            } else {
                System.out.println("Results from quadratic calculator: " + firstAnswer + ", " + secondAnswer);
            }
        }
        // we should always clean up after ourselves! Close the scanner object
        inputScanner.close();
        System.out.println("Goodbye!");
    }
}
