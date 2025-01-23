package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Main program: The entry point of the program. It demonstrates binary operations
     * including addition, OR, AND, and multiplication.
     *
     * @param args: not used
     */
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        // Input from the user for two binary numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first binary number: ");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);

        System.out.print("Enter the second binary number: ");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);

        System.out.println("First binary number is " + binary1.getValue());
        System.out.println("Second binary number is " + binary2.getValue());

        // Demonstrating addition
        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Sum: " + sum.getValue());

        // Demonstrating OR operation
        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("OR: " + orResult.getValue());

        // Demonstrating AND operation
        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("AND: " + andResult.getValue());

        // Demonstrating multiplication
        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiplication: " + multiplyResult.getValue());

        scanner.close();
    }
}
