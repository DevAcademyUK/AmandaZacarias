package tests;

import java.util.Scanner;
// imported from package java, there is another package util, class Scanner

public class scannerTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("value = "+ a);*/

        Scanner scanner = new Scanner(System.in);  // scanner object

        System.out.println("Enter a character");
        char c = scanner.next().charAt(3);
        System.out.println("The character is "+c);
    }
}
