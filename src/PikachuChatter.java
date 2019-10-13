public class PikachuChatter {

    /**
     * Method to print out Pikachu talking
     */
    public static void pikaTalk() {
        System.out.println("(\\_/)");
        System.out.println("(o^.^)");
        System.out.println("z(_(\")(\")");
        System.out.println();
    }

    public static void main (String[] args) {
        // method that draws pikachu talking twice
        System.out.println("Pika pika pika chu pika chu peeeee ka pika chu!");
        pikaTalk();
        System.out.println("Pika? Pika pika pika chu peeeee ka chu!");
        pikaTalk();

        // for (int i = 1; i <= 2; i++) {
        //     for (int j = 1; j <= 2 + i -3; j++) {
        //         // prints second dialogue line exclusively for second pikachu
        //         System.out.println("Pika? Pika pika pika chu peeeee ka chu!");
        //     }
        //     for (int k = 1; k == 1; k++) {
        //         System.out.println("(\\_/)");
        //     }
        //     for (int l = 1; l == 1; l++) {
        //         System.out.println("(o^.^)");
        //     }
        //     for (int m = 1; m == 1; m++) {
        //         System.out.println("z(_(\")(\")");
        //     }
        //     System.out.println();
        // }
    }

}