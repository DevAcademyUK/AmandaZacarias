package song;

import java.util.Scanner;

public class fiveLittleDucks {
    public static void main(String[] args) {
        fiveLittleDucks swimming = new fiveLittleDucks();
        swimming.little();
    }

    private void little() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many ducks do you see?");
        int ducks = myScanner.nextInt();

        String word = "ducks";

        for (int i = ducks; i > 0; i--) {
            System.out.println(i + " little " + word + " went swimming one day.");
            System.out.println("Over the hill and far away.");
            System.out.println("Mother duck said, 'Quack quack quack quack'.");

            if (i == 1) {
                System.out.println("And all her " + ducks + " little ducks came back!");
            } else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "duck";

                   /* if (i == 0) {
                        System.out.println("No ducks left to come back");
                    }*/
                }
                System.out.println("And only " + newNum + " little " + word + " came back! \n");
            }
        }
    }
}

