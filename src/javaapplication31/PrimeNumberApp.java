/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import java.util.Scanner;

// Base class
class NumberHandler {
    private int number; // Encapsulation: private member variable

    // Getter for number
    public int getNumber() {
        return number;
    }

    // Setter for number
    public void setNumber(int number) {
        this.number = number;
    }
}

// Derived class for prime number checking
class PrimeChecker extends NumberHandler {

    // Method to check if a number is prime
    public boolean isPrime() {
        int num = getNumber(); // Accessing the encapsulated number
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by another number, so it's not prime
            }
        }
        return true; // Number is prime
    }
}

// Main class
public class PrimeNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of PrimeChecker
        PrimeChecker checker = new PrimeChecker();

        // Accept number from user
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        checker.setNumber(userNumber); // Setting the number using encapsulation

        // Check if the number is prime and display the result
        if (checker.isPrime()) {
            System.out.println(userNumber + " is a prime number.");
        } else {
            System.out.println(userNumber + " is not a prime number.");
        }

        scanner.close();
    }
}

