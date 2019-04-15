package inheritance;

import java.util.Scanner;

public class Vehicle {

    public short numberofSeats;
    public short numberofWheels;

        Scanner myScanner = new Scanner(System.in);

    public void menuOptions() {
        System.out.println("What would you like to do with your car?");
        System.out.println("1 - Accelerate");
        System.out.println("2 - Brake");
        System.out.println("3 - Change Gear Direction");
        System.out.printf("%n");

        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                accelerate();
                break;
            case 2:
                brake();
                break;
            case 3:
                steer("");
                break;
            default:
                System.out.println("This is not a valid method!");
                menuOptions();
                break;
        }
    }

    public void accelerate () {
        System.out.println("What you want to do?");
        System.out.println("1 - Increment Acceleration");
        System.out.println("2 - Decrease Acceleration");
        System.out.println("3 - Go back to main menu");

        int input = Integer.parseInt(myScanner.nextLine());

        if (input == 1) {
            System.out.println("Your vehicle is going faster now!");
        }
        else if (input == 2) {
            System.out.println("Your vehicle is slowing down!");
        }
        else if (input == 3) {
            menuOptions();
        }
        else {
            System.out.println("This input is not valid. Try again");
        }
        System.out.printf("%n");
    }

    public void brake () {
        System.out.println("What you want to do?");
        System.out.println("1 - Break completely");
        System.out.println("2 - Reduce the speed gradually");

        int input = Integer.parseInt(myScanner.nextLine());

        if (input == 1) {
            System.out.println("This was a hard break!");
        }
        else if(input == 2) {
            System.out.println("You'are going to break in few meters");
        }
        else {
            System.out.println("That is not a valid input. Try again.");
        }
        System.out.printf("%n");
        //menu();
    }

    public void steer(String dir) {
        System.out.println("What direction are going next?");
        System.out.println("1 - Right");
        System.out.println("2 - Left");
        System.out.println("3 - Forward");
        System.out.println("4 - Backwards");
        System.out.println("5 - Parking mode");

        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                System.out.println("You're going to the right");
                break;
            case 2:
                System.out.println("You're going to the left");
                break;
            case 3:
                System.out.println("You're going forward");
                break;
            case 4:
                System.out.println("Careful! You're going backwards");
                break;
            case 5:
                System.out.println("Parking mode was activated! Nicely done!");
                break;
            default:
                System.out.println("Sorry, not a valid option. Try again!");
               // menu();
                break;
        }



    }


}
