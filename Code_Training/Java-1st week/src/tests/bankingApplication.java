package tests;

import java.util.Scanner;

public class bankingApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankAccount obj1 = new BankAccount("amanda", "cgd-01");
        obj1.showMenu();
    }
}

class BankAccount {
    private int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    // built a constructor from the class, instance from the object
    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("a. check balance");
        System.out.println("b. deposit");
        System.out.println("c. withdraw");
        System.out.println("d. previous transaction");
        System.out.println("e. exit");

        do {
            System.out.println("=================================================================================");
            System.out.println("Enter an option");
            System.out.println("=================================================================================");
            option = myScanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("--------------------------------------------------------------------------");
                    int amount = myScanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("--------------------------------------------------------------------------");
                    int amount2 = myScanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("--------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("**************************************************************************");
                    break;

                default:
                    System.out.println("Invalid option!! Please enter again");
                    break;
            }
        }

        while (option != 'E');
        System.out.println("Thank you for using our services");
    }
}


