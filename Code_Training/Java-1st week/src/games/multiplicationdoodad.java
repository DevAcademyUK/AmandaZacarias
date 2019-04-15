package games;

import java.util.Scanner;
/* a class is a structure, blueprint/ design for an object, it's not an object. We can
built as many objects as we want from the same variables. We can change it
as many times we want.
our class declaration + name of it (variable)
*/
public class multiplicationdoodad {
    /* instance variable from a objects
    A variable is a container, a box, it holds data, a location or section of data
    do contain the kind of the info you defined
    */
    Scanner myScanner = new Scanner(System.in);
    /* the instance variable is myScanner
    when we are creating an object we do not lose the class
    this a method, an action
     We build an object from a class. We look at all the methods and put the info there.
     So once we put info there we see it as an instance.*/

    /* this is the entry point into our program, the only door
    Only have ONCE in a program. You can put anywhere in the class,
    not inside a method. Tradionally goes after the instance variables and before all
    other methods
         */
    public static void main(String[] args) {
        multiplicationdoodad mdd = new multiplicationdoodad();
        //create a new instance of your class
        mdd.getValues();
        //get the user input by referencing the class and the method
    }
    /* this is a method, an action
    we get from the user input for the variables
    the return method is void (), so it doesn't return anything */
    private void getValues() {
        System.out.println("What number would you like the multiplication tables for?");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the maximum multiplication you wish to calculate?");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        /* we are calling a method and passing 2 values because the methods says that we
        need to provide 2 variables */
        calculate(number, multiplier);
    }
    /* takes an int called number and int multiplier to give back the calculation. We are
    creating 2 new variables*/
    private void calculate(int number, int multiplier) {
        // the initialization of i = 1 so we can multiply it. If it was 0 wouldn't work.
        // initialization; condition; what does after it i++ (increment) and exit loop
        for (int i = 1; i <= multiplier; i++) {
            System.out.println(i + " times " + number + " is " + i * number);
        }
    }
}

