package assignment1;

import java.util.Scanner;

public class bankingApp {
    // Class that starts the program and initializes the variables
    public static void main(String[] args) {
        bankAccess first = new bankAccess("az", "123");
        first.verifyUser();
    }
}
    //class of the body of the program
class bankAccess {
    //Instance objects of the class
    private String username;
    private String password;

    private double currentAccount = 100;
    private double savingsAccount = 200;
    private double jointAccount = 300;


    Scanner myScanner = new Scanner(System.in);

    //Constructor
    public bankAccess(String u, String p) {
        username = u;
        password = p;
    }

    //Method that ask for the user login details and verify it with the data we have. And welcomes user.
    public void verifyUser() {
        System.out.println("Welcome to the banking app.");
        System.out.println("Please type your username:");
        String userTyped = myScanner.nextLine();
        System.out.println("Please type your password:");
        String passTyped = myScanner.nextLine();
        if (userTyped.equals(username) && (passTyped.equals(password))) {
            System.out.println("\n");
            System.out.println("Welcome to your personal bank " + username.toUpperCase() + ". ");
            System.out.println("You are at your Current Account");
            menu();
        } else {
            System.err.println("Incorrect login details. Please try again.");
            System.out.println("");
            verifyUser();
        }
    }

    // Method that gives the options for what the user can do.
    private void menu() {
        System.out.println("");
        System.out.println("How can we help you today? Please type an option:");
        System.out.println("a. Balance");
        System.out.println("b. Deposit");
        System.out.println("c. Withdraw");
        System.out.println("d. Transfer");
        System.out.println("e. Change to another personal account");
        System.out.println("f. Logout");
        userAction();
    }

    // Method with all options of the user action. Each case works at a time.
    private void userAction() {
        char input = myScanner.next().charAt(0);
        switch (input) {
            case 'a':
                getBalance();
                break;

            case 'b':
                deposit();
                break;

            case 'c':
                withdraw();
                break;

            case 'd':
                transfer();
                break;

            case 'e':
                changeAccount();
                break;

            case 'f':
                logout();
                break;

            default:
                System.err.println("Incorrect option type. Please try again.");
                menu();
        }
    }

    //Method where 3 account options are displayed to the user
    private void userAccounts() {
        System.out.println("");
        System.out.println("Please select which account?");
        System.out.println("1. Current Account");
        System.out.println("2. Savings Account");
        System.out.println("3. Joint Account");
    }

    // Method that asks for the account, then display the BALANCE in the account selected
    private void getBalance() {
        userAccounts();
        char accountType = myScanner.next().charAt(0);
        if (accountType == '1') {
            System.out.println("Your Current account balance is: £" + currentAccount);
        } else if (accountType == '2') {
            System.out.println("Your Savings account balance is: £" + savingsAccount);
        } else if (accountType == '3') {
            System.out.println("Your Joint account balance is: £" + jointAccount);
        } else {
            System.err.println("Account selected is not valid. Please try again.");
        }
        menu();
    }

    // Method asks for the account, the amount to deposit and display updated balance
    private void deposit() {
        System.out.println("How much do you want to deposit today?");
        int dAmount = myScanner.nextInt();
        if (dAmount >= 0) {
            userAccounts();
            char accountType = myScanner.next().charAt(0);
            if (accountType == '1') {
                currentAccount += dAmount;
                System.out.println("Deposit successfully received. Your Current account balance is: £" + currentAccount);
                menu();
            } else if (accountType == '2') {
                savingsAccount += dAmount;
                System.out.println("Deposit successfully received. Your Savings account balance is: £" + savingsAccount);
                menu();
            } else if (accountType == '3') {
                jointAccount += dAmount;
                System.out.println("Deposit successfully received. Your Joint account balance is: £" + jointAccount);
                menu();
            } else {
                System.err.println("Account selected is not valid. Please try again.");
                menu();
            }
        } else {
            System.err.println("Amount invalid. Please try again.");
            menu();
        }
    }
    // Method ask for amount to withdraw, the source account and checks if there is enough funds to do it.
    private void withdraw() {
        System.out.println("How much do you want to withdraw today?");
        double wAmount = myScanner.nextInt();
        if (wAmount >= 0) {
            System.out.println("Which account would you like to withdraw from?");
            userAccounts();
            char fWithdraw = myScanner.next().charAt(0);
            if (fWithdraw == '1' && currentAccount >= wAmount) {
                currentAccount -= wAmount;
                System.out.println("Withdraw successful. Your Current account balance is: £" + currentAccount);
            } else if (fWithdraw == '2' && savingsAccount >= wAmount) {
                savingsAccount -= wAmount;
                System.out.println("Withdraw successful. Your Savings account balance is: £" + savingsAccount);
            } else if (fWithdraw == '3' && jointAccount >= wAmount) {
                jointAccount -= wAmount;
                System.out.println("Withdraw successful. Your Joint account balance is: £" + jointAccount);
            } else {
                System.err.println("Invalid operatio. Please try again.");
                menu();
            }
        } else {
            System.err.println("Invalid amount. Please try again");
            menu();
        }
    }
    /*Method that allows user to transfer funds between the 3 accounts. Asks for the source and destination accounts,
    amount to be transferred, checks if there is enough funds in the source account and does the transfer.
     */
    private void transfer() {
        System.out.println("Which account would you like to transfer from?");
        userAccounts();
        char fAccount = myScanner.next().charAt(0);
        System.out.println("Which is the destination account?");
        char dAccount = myScanner.next().charAt(0);
        System.out.println("How much do you want to transfer today?");
        double tAmount = myScanner.nextInt();
        if (tAmount >= 0) {
            if (fAccount == '1' && tAmount <= currentAccount) {
                if (dAccount == '2') {
                    currentAccount -= tAmount;
                    savingsAccount += tAmount;
                    System.out.println("Transfer successfully received.");
                } else if (dAccount == '3') {
                    currentAccount -= tAmount;
                    jointAccount += tAmount;
                    System.out.println("Transfer successfully received.");
                } else {
                    System.err.println("Invalid destination account selection.");
                    menu();
                }
            } else if (fAccount == '2' && tAmount <= savingsAccount) {
                if (dAccount == '1') {
                    savingsAccount -= tAmount;
                    currentAccount += tAmount;
                    System.out.println("Transfer successfully received.");
                } else if (dAccount == '3') {
                    savingsAccount -= tAmount;
                    jointAccount += tAmount;
                    System.out.println("Transfer successfully received. ");
                } else {
                    System.err.println("Invalid destination account selection.");
                    menu();
                }
            } else if (fAccount == '3' && tAmount <= jointAccount) {
                if (dAccount == '1') {
                    jointAccount -= tAmount;
                    currentAccount += tAmount;
                    System.out.println("Transfer successfully received.");
                } else if (dAccount == '2') {
                    jointAccount -= tAmount;
                    savingsAccount += tAmount;
                    System.out.println("Transfer successfully received. ");
                } else {
                    System.err.println("Invalid destination account selection.");
                    menu();
                }
            } else {
                System.err.println("Account selected is not valid. Please try again.");
                menu();
            }
        } else {
            System.err.println("Amount invalid. Please try again.");
            menu();
        }
    }
    //Method that changes the present account of the user and it allows to go to navigate between accounts.
    private void changeAccount() {
        System.out.println("");
        System.out.println("Please select which account you want to switch to?");
        System.out.println("1. Current Account");
        System.out.println("2. Savings Account");
        System.out.println("3. Joint Account");
        char accountType = myScanner.next().charAt(0);
        if (accountType == '1') {
            System.out.println("Welcome to your Current Account!");
            menu();
        } else if (accountType == '2') {
            System.out.println("Welcome to your Savings Account!");
            menu();
        } else if (accountType == '3') {
            System.out.println("Welcome to your Joint Account!");
            menu();
        } else {
            System.err.println("Account invalid. Please try again");
            menu();
        }
    }
    //Method to logoff from Application app.
    private void logout() {
        System.out.println("You're now logged off.");
        System.out.println("Thanks for using the banking app");
        System.exit(4);
    }
}



