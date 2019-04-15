package switches;

import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        parking p = new parking();
        p.getInput();
    }
    // create input form using scanners
    public void getInput() {
        System.out.println("What day is it today?");
        String day = myScanner.nextLine();
        System.out.println("How many hours will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold withing the college? (Staff/Student/Visitor)");
        String position = myScanner.nextLine();
        calculateFees(day, duration, position);
    }
    // creating constructor for form input
    private void calculateFees(String day, int duration, String position) {
        // defining the variables without any assigned value
        int cost;
        int hourlyrate = 0;
        /* I need to assign a value to both variables hourlyrate and multiplier
        to go along with the default case in both switch cases
         */
        int multiplier = 0;

        switch (position) {
            case "Staff":
                multiplier = 2;
                break;
            case "Student":
                multiplier = 1;
                break;
            case "Visitor":
                multiplier = 3;
                break;
            default:
                System.out.println("Please try again with one of the options Staff / Student / Visitor");
                getInput();
        }
        switch (day) {
            case "Monday":
                hourlyrate = 2;
                break;
            case "Tuesday":
                hourlyrate = 2;
                break;
            case "Wednesday":
                hourlyrate = 3;
                break;
            case "Thursday":
                hourlyrate = 2;
                break;
            case "Friday":
                hourlyrate = 3;
                break;
            case "Saturday":
                hourlyrate = 4;
                break;
            case "Sunday":
                hourlyrate = 5;
                break;
            default:
                System.out.println("Please try again by selecting one of the options: Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday" );
                getInput();
        }

        cost = (hourlyrate * multiplier) * duration;
        System.out.println("Thanks for parking at Gateshead College, Please Pay: £ " + cost);
    }

}

